package com.shopify.client;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.shopify.api.ApiContext;
import com.shopify.api.ApiException;

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 3:08:59 PM
 *
 */
public interface ShopifyClient<TResult> {

	public void setContext(ApiContext apiContext);

	public void addHeader(String header, String value);

	public String getStringResult() throws Exception;

	public TResult getResult() throws Exception;

	public String execute(ApiContext apiContext, String resource, Map<String, String> params, String requestMethod,
			JSONPObject requestBody) throws Exception;

	public void executeRequest() throws Exception;

	public TResult executePostRequest(Object bodyObject, String resourceUrl, Map<String, String> headers)
			throws ApiException;

	public TResult executePutRequest(Object bodyObject, String resourceUrl, Map<String, String> headers)
			throws ApiException;

	public void executeDeleteRequest(String resourceUrl, Map<String, String> headers) throws ApiException;

	public void cleanupHttpConnection() throws Exception;

	public void setRequestMethod(String requestMethod);
 
	public void setResourceUrl(String url);

	public <TBody> void setBody(TBody object) throws JsonProcessingException;
}
