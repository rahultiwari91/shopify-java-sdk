package com.shopify.client;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.util.EntityUtils;
import org.datanucleus.util.Base64;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.shopify.api.ApiContext;
import com.shopify.api.ApiException;
import com.shopify.api.ApiResponseHandler;
import com.shopify.api.Headers;
import com.shopify.api.contracts.constants.PropertyConstants;
import com.shopify.api.utils.HttpClientPool;
import com.shopify.api.utils.JsonUtils;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 5:09:34 PM
 *
 */
public class ShopifyClientImpl<TResult> implements ShopifyClient<TResult> {

	private static final ObjectMapper mapper = JsonUtils.initObjectMapper();

	private ApiContext _apiContext = null;
	private String baseAddress = null;
	private String resourceUrl = null;
	private HashMap<String, String> headers = new HashMap<String, String>();
	private CloseableHttpResponse httpResponseMessage = null;
	private InputStream streamContent = null;
	private String httpContent = null;
	private Class<TResult> responseType;
	private String requestMethod = null;
	private String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36";

	private final static HttpClient httpClient = HttpClientBuilder.create().build();

	public ShopifyClientImpl() {
		this.responseType = null;
	}

	public ShopifyClientImpl(Class<TResult> responseType) throws Exception {
		this.responseType = responseType;
	}

	public void setContext(ApiContext apiContext) {
		_apiContext = apiContext;

		if (_apiContext != null) {
			if (_apiContext.getUsername() != null && StringUtils.isNotBlank(_apiContext.getUsername())) {
				String authorization = _apiContext.getUsername() + PropertyConstants.COLON + _apiContext.getPassword();
				String encodedBytes = Base64.encodeString(authorization);
				authorization = PropertyConstants.BASIC + PropertyConstants.WHITESPACE + encodedBytes;
				addHeader(HttpHeaders.AUTHORIZATION, authorization);
			}

			if (_apiContext.getAccessToken() != null && StringUtils.isNotBlank(_apiContext.getAccessToken())) {
				addHeader(com.shopify.api.Headers.X_SHOPIFY_ACCESS_TOKEN, _apiContext.getAccessToken());
			} else {
				//addHeader(com.shopify.api.Headers.X_SHOPIFY_ACCESS_TOKEN, _apiContext.getPassword());
			}

			addHeader(HttpHeaders.USER_AGENT, USER_AGENT);
			addHeader(HttpHeaders.ACCEPT, PropertyConstants.APPLICATION_JSON);
			addHeader(HttpHeaders.CONTENT_TYPE, PropertyConstants.APPLICATION_JSON);

			baseAddress = _apiContext.getBaseAddress();
		}
	}

	public void addHeader(String header, String value) {
		headers.put(header, value);
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public void setResourceUrl(String resource) {
		this.resourceUrl = resource;
	}

	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}

	public void executeRequest() throws Exception {
		validateContext();
		
		CloseableHttpClient client = HttpClientPool.getInstance().getHttpClient();
		BasicHttpEntityEnclosingRequest request = buildRequest();

		HttpHost httpHost = new HttpHost(baseAddress, -1, "https");
		httpResponseMessage = client.execute(httpHost, request);

		try {
			ensureSuccess(httpResponseMessage, request.getRequestLine());
		} catch (Exception e) {
			// make sure on exception that that response is closed
			EntityUtils.consume(httpResponseMessage.getEntity());
			httpResponseMessage.close();
			throw e;
		}
	}

	public String execute(ApiContext apiContext, String resource, Map<String, String> params, String requestMethod,
			JSONPObject requestBody) throws Exception {

		ResponseHandler<String> responseHandler = new ApiResponseHandler();
		String httpresponse = null;
		String url = null;
		HttpUriRequest httpUriReq = null;
		try {

			// Set entity body
			final StringEntity entityBody = setEntityBody(requestBody);

			httpresponse = validateContext(apiContext, requestMethod, resource);
			if (httpresponse != null) {
				url = apiContext.getApiUrl(resource);

				// If there are parameters then add it in the URL
				if (params != null) {
					updateUrlWithParams(url, params);
				}

			} else {
				return httpresponse;
			}

			if (requestMethod.equalsIgnoreCase(PropertyConstants.REQUEST_TYPE_GET)) {
				httpUriReq = new HttpGet(url);
			} else if (requestMethod.equalsIgnoreCase(PropertyConstants.REQUEST_TYPE_POST)) {
				httpUriReq = new HttpPost(url);
				((HttpEntityEnclosingRequestBase) httpUriReq).setEntity(entityBody);
			} else if (requestMethod.equalsIgnoreCase(PropertyConstants.REQUEST_TYPE_PUT)) {
				httpUriReq = new HttpPut(url);
				((HttpEntityEnclosingRequestBase) httpUriReq).setEntity(entityBody);
			} else if (requestMethod.equalsIgnoreCase(PropertyConstants.REQUEST_TYPE_DELETE)) {
				httpUriReq = new HttpDelete(url);
			}

			httpresponse = httpClient.execute(httpUriReq, responseHandler);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO release connection if needed.
		}
		return httpresponse;
	}

	/**
	 * Update URL with params
	 * 
	 * @param url
	 * @param Parameters map with param name and value.
	 */
	private static void updateUrlWithParams(String url, Map<String, String> params) {
		if (null != url) {
			url.concat(PropertyConstants.QUESTION_MARK);
			for (Entry<String, String> param : params.entrySet()) {
				url.concat(param.getKey()).concat(PropertyConstants.EQUAL).concat(param.getValue())
						.concat(PropertyConstants.AND);
			}
		}
	}

	/**
	 * @param apiContext
	 * @param requestMethod
	 * @param resource
	 * @return It will return the error message if context is not valid. It will
	 *         return null if context is valid.
	 */
	private static String validateContext(ApiContext apiContext, String requestMethod, String resource) {
		String errorMessage = null;
		if (requestMethod == null || "".equalsIgnoreCase(requestMethod)) {
			errorMessage = "Request Type not defined.";
		} else if (resource == null || "".equalsIgnoreCase(resource)) {
			errorMessage = "Resouce not defined.";
		} else if (apiContext == null) {
			errorMessage = "ApiContext not defined.";
		} else if (null == apiContext.getUsername() || "".equalsIgnoreCase(apiContext.getUsername())) {
			errorMessage = "Username can't be null or blank.";
		} else if (null == apiContext.getPassword() || "".equalsIgnoreCase(apiContext.getPassword())) {
			errorMessage = "Password can't be null or blank.";
		}
		return errorMessage;
	}

	private void validateContext() {
		if (_apiContext == null) {
			throw new ApiException("ApiContext not defined.");
		} else if (null == _apiContext.getUsername() || StringUtils.isBlank(_apiContext.getUsername())) {
			throw new ApiException("Username can't be null or blank.");
		} else if (null == _apiContext.getPassword() || StringUtils.isBlank(_apiContext.getPassword())) {
			throw new ApiException("Password can't be null or blank.");
		} else if (null == resourceUrl || StringUtils.isBlank(resourceUrl)) {
			throw new ApiException("Resouce URL is invalid.");
		} else {
			resourceUrl = _apiContext.getResourceUrl(resourceUrl);
		}
	}

	private BasicHttpEntityEnclosingRequest buildRequest() throws Exception {
		BasicHttpEntityEnclosingRequest request = new BasicHttpEntityEnclosingRequest(requestMethod, resourceUrl);
		if (requestMethod.equalsIgnoreCase("POST") || requestMethod.equalsIgnoreCase("PUT")) {
			if (StringUtils.isNotBlank(httpContent)) {
				StringEntity entity = new StringEntity(httpContent, Consts.UTF_8);
				request.setEntity(entity);
			} else if (this.streamContent != null) {
				long length = -1;
				if (streamContent instanceof FileInputStream) {
					if (((FileInputStream) streamContent).getChannel() != null) {
						length = ((FileInputStream) streamContent).getChannel().size();
					}
				} else {
					throw new UnsupportedOperationException(
							"The InputStream is not supported. It must be an instance of FileInputStream.");
				}
				InputStreamEntity entity = new InputStreamEntity(this.streamContent, length);
				request.setEntity(entity);
			}
		}

		if (!headers.containsKey(Headers.CONTENT_TYPE)) {
			request.setHeader("Content-type", "application/json");
		}

		Iterator<Entry<String, String>> i = headers.entrySet().iterator();
		while (i.hasNext()) {
			Entry<String, String> header = i.next();
			request.addHeader(header.getKey(), header.getValue());
		}

		return request;
	}

	private static StringEntity setEntityBody(final JSONPObject requestBody) throws UnsupportedEncodingException {
		if (requestBody != null) {
			StringEntity entityBody = null;
			entityBody = new StringEntity(requestBody.toString());
			entityBody.setContentType(PropertyConstants.APPLICATION_JSON);
			return entityBody;
		} else {
			return null;
		}
	}

	private TResult deserialize(String jsonString, Class<TResult> cls) throws Exception {
		return mapper.readValue(jsonString, cls);
	}

	private String stringContent() throws Exception {
		HttpEntity httpEntity = httpResponseMessage.getEntity();
		InputStream stream = (InputStream) httpEntity.getContent();
		return org.apache.commons.io.IOUtils.toString(stream, "UTF-8");
	}

	public <TBody> void setBody(TBody body) throws JsonProcessingException {
		httpContent = mapper.writeValueAsString(body);
	}

	public void setBody(InputStream body) throws JsonProcessingException {
		streamContent = body;
	}

	public void setBody(String body) {
		httpContent = body;
	}

	public String getStringResult() throws Exception {
		return stringContent();
	}

	@SuppressWarnings("unchecked")
	public TResult getResult() throws Exception {
		TResult tResult = null;
		try {
			if (httpResponseMessage.getStatusLine().getStatusCode() == 404)
				return null;

			if (responseType != null) {
				String className = responseType.getName();
				if (className.equals(java.io.InputStream.class.getName())) {
					tResult = (TResult) httpResponseMessage.getEntity().getContent();
				} else {
					tResult = deserialize(getStringResult(), responseType);
				}
			}
		} finally {
			EntityUtils.consume(httpResponseMessage.getEntity());
			httpResponseMessage.close();
		}
		return tResult;
	}

	public TResult executePostRequest(Object bodyObject, String resourceUrl, Map<String, String> headers)
			throws ApiException {
		return this.executeRequest(bodyObject, new HttpPost(resourceUrl), headers);
	}

	public TResult executePutRequest(Object bodyObject, String resourceUrl, Map<String, String> headers)
			throws ApiException {
		return this.executeRequest(bodyObject, new HttpPut(resourceUrl), headers);
	}

	public void executeDeleteRequest(String resourceUrl, Map<String, String> headers) throws ApiException {
		HttpDelete delete = new HttpDelete(resourceUrl);
		delete.setHeader("Accept", "application/json");
		delete.setHeader("Content-type", "application/json");
		if (headers != null) {
			for (Map.Entry<String, String> entry : headers.entrySet()) {
				delete.addHeader(entry.getKey(), entry.getValue());
			}
		}
		try {
			executeRequest(delete);
		} catch (Exception ioe) {
			throw new ApiException("Exception occurred while authenticating user: " + ioe.getMessage());
		}

	}

	private TResult executeRequest(Object bodyObject, HttpEntityEnclosingRequestBase request,
			Map<String, String> headers) {
		TResult result = null;

		try {
			String body = mapper.writeValueAsString(bodyObject);
			StringEntity se = new StringEntity(body);
			request.setEntity(se);
			request.setHeader("Accept", "application/json");
			request.setHeader("Content-type", "application/json");
			if (headers != null) {
				for (Map.Entry<String, String> entry : headers.entrySet()) {
					request.addHeader(entry.getKey(), entry.getValue());
				}
			}
		} catch (UnsupportedEncodingException uee) {
			throw new ApiException("JSON error proccessing authentication: " + uee.getMessage());
		} catch (JsonProcessingException jpe) {
			throw new ApiException("JSON error proccessing authentication: " + jpe.getMessage());
		}

		try {
			executeRequest(request);
			result = getResult();
		} catch (ApiException ae) {
			throw ae;
		} catch (Exception ioe) {
			throw new ApiException("Exception occurred while authenticating application: " + ioe.getMessage());
		}

		return result;
	}

	private void executeRequest(HttpRequestBase request) throws Exception {

		CloseableHttpClient client = HttpClientPool.getInstance().getHttpClient();

		httpResponseMessage = client.execute(request);
		try {
			ensureSuccess(httpResponseMessage, request.getRequestLine());
		} catch (Exception e) {
			// make sure on exception that that response is closed
			EntityUtils.consume(httpResponseMessage.getEntity());
			httpResponseMessage.close();
			throw e;
		}
	}

	protected void ensureSuccess(HttpResponse response, RequestLine requestLine) throws ApiException {
		int statusCode = response.getStatusLine().getStatusCode();
		if (statusCode == 304 || statusCode >= 200 && statusCode <= 300)
			return;

		String errorMessage = null;

		if (statusCode == 404)
			errorMessage = requestLine.getUri().toString() + " not found";
		else
			errorMessage = "Unknown Error with Status Code: " + statusCode;
		throw new ApiException(errorMessage, statusCode);
	}

	public void cleanupHttpConnection() throws Exception {
		if (httpResponseMessage != null) {
			EntityUtils.consume(httpResponseMessage.getEntity());
			httpResponseMessage.close();
		}

	}

}
