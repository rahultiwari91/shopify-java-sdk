package com.shopify.api;

import com.shopify.api.contracts.constants.PropertyConstants;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:32:15 PM
 *
 */
public class ApiContext {

	private String username;
	private String password;
	private String shopSubdomain;
	private String apiVersion;
	private String accessToken;

	public ApiContext() {
		this.apiVersion = PropertyConstants.API_VERSION;
	}

	public ApiContext(String username, String password, String shopSubdomain) {
		this.username = username;
		this.password = password;
		this.shopSubdomain = shopSubdomain;
		this.apiVersion = PropertyConstants.API_VERSION;
	}

	public ApiContext(String username, String password, String shopSubdomain, String apiVersion) {
		this.username = username;
		this.password = password;
		this.shopSubdomain = shopSubdomain;
		this.apiVersion = apiVersion;
	}

	/**
	 * Get the REST API url.
	 * 
	 * @param resource - required
	 * @return It'll return api url with authentication details.
	 */
	public String getApiUrl(String resource) {
		String apiUrl = PropertyConstants.HTTPS + this.username + ":" + this.password + PropertyConstants.AT
				+ this.shopSubdomain + PropertyConstants.API_TARGET_PATH + this.apiVersion
				+ PropertyConstants.FORWARD_SLASH + resource + PropertyConstants.DOT_JSON;
		return apiUrl;
	}

	/**
	 * Get the REST API url.
	 * 
	 * @param resource - required
	 * @return It'll return api url with authentication details.
	 */
	public String getResourceUrl(String resourceUrl) {
		return resourceUrl.replace("#{api_version}", this.apiVersion);
	}

	/**
	 * Get the REST API url.
	 * 
	 * @param resource - required
	 * @return It'll return api url with authentication details.
	 */
	public String getBaseAddress() {
		return this.shopSubdomain + PropertyConstants.DOT + PropertyConstants.API_DOMAIN;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the shop
	 */
	public String getShopSubdomain() {
		return shopSubdomain;
	}

	/**
	 * @param shop the shop to set
	 */
	public void setShopSubdomain(String shopSubdomain) {
		this.shopSubdomain = shopSubdomain;
	}

	/**
	 * @return the apiVersion
	 */
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * @param apiVersion the apiVersion to set
	 */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

}
