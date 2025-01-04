package com.shopify.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.datanucleus.util.Base64;

public class CommonUtil {

	private static final Logger log = Logger.getLogger(CommonUtil.class
			.getName());

	/**
	 * This method has everything to make a POST call to any URL with basic
	 * authentication, provides certain number of retries and also returns the
	 * response body as string in case responsestatus matches expected status.
	 * 
	 * @param apiURL
	 * @param credentials
	 * @param noOfRetries
	 * @param requiredStatusCode
	 * @param requestData
	 * @return response as a string in case status matches expected status. Else
	 *         null.
	 */
	public static String getResponseFromAPIs(final String apiURL,
			final String userName, final String password, final String httpMethod,
			final Integer noOfRetries, final Integer requiredStatusCode,
		 final String requestData,
			final String contentType) {
		
		String response = null;
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(apiURL);
			connection = (HttpURLConnection) url.openConnection();
			
			if (userName != null && password != null) {
	            String authorization = userName + ":" + password;
	            String encodedBytes = Base64.encodeString(authorization);
	            authorization = "Basic " + encodedBytes;
	            connection.setRequestProperty("Authorization", authorization);
	        }
			
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(30000);
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
            	sb.append(line);
            }
            reader.close();
            
            if(connection.getResponseCode() == requiredStatusCode) {
            	response = sb.toString();
            }

		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
		
		return response;
		
	}


	public static String deleteResponseFromAPIs(final String apiURL,
			final String userName, final String password,
			final String httpMethod, final Integer noOfRetries,
			final Integer requiredStatusCode, final String requestData,
			final String contentType) {

		String response = null;
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(apiURL);
			connection = (HttpURLConnection) url.openConnection();

			if (userName != null && password != null) {
				String authorization = userName + ":" + password;
				String encodedBytes = Base64.encodeString(authorization);
				authorization = "Basic " + encodedBytes;
				connection.setRequestProperty("Authorization", authorization);
			}

			connection.setRequestMethod("DELETE");
			connection.setConnectTimeout(30000);

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String line;
			StringBuilder sb = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();

			if (connection.getResponseCode() == requiredStatusCode) {
				response = sb.toString();
			}

		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}

		return response;

	}

	public static String postResponseFromAPIs(final String apiURL,
			final String userName, final String password,
			final String httpMethod, final Integer noOfRetries,
			final Integer requiredStatusCode, final String requestData,
			final String contentType) {

		String response = null;
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(apiURL);
			connection = (HttpURLConnection) url.openConnection();

			connection.setDoOutput(true);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Content-Length",
					String.valueOf(requestData.length()));

			if (userName != null && password != null) {
				String authorization = userName + ":" + password;
				String encodedBytes = Base64.encodeString(authorization);
				authorization = "Basic " + encodedBytes;
				connection.setRequestProperty("Authorization", authorization);
			}

			connection.setConnectTimeout(30000);

			// Write data
			OutputStream os = connection.getOutputStream();
			os.write(requestData.getBytes());

			// Read response
			StringBuilder responseSB = new StringBuilder();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));

			String line;
			while ((line = br.readLine()) != null)
				responseSB.append(line);
			log.info("connection.getResponseCode() "
					+ connection.getResponseCode());
			log.info("responseSB.toString() " + responseSB.toString());

			if (connection.getResponseCode() == requiredStatusCode) {
				response = responseSB.toString();
			}
			// Close streams
			br.close();
			os.close();

		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}

		return response;

	}
}
