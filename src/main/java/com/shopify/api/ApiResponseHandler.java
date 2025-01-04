package com.shopify.api;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.util.EntityUtils;

/**
 * @author Rahul Tiwari, Created on Aug 22, 2019 - 5:31:59 PM
 * @param <T>
 * @param <T>
 *
 */
public class ApiResponseHandler implements ResponseHandler<String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.http.client.ResponseHandler#handleResponse(org.apache.http.
	 * HttpResponse)
	 */
	@Override
	public String handleResponse(HttpResponse response) throws ClientProtocolException, IOException {

		// Get the status of the response
		if (null != response && response.getStatusLine() != null) {
			int status = response.getStatusLine().getStatusCode();
			if (status >= 200 && status < 300) {
				HttpEntity entity = response.getEntity();
				if (entity == null) {
					return null;
				} else {
					return EntityUtils.toString(entity);
				}

			} else {
				return "" + status;
			}
		} else {
			return null;
		}
	}
}
