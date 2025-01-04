package com.shopify.api;

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 3:44:01 PM
 *
 */
public class ShopifyConfig {
	private static String encodeAlgorithm = "SHA-256";
	private static String charSet = "UTF-8";
	private static int defaultEventRequestTimeout = 180;
	private static String proxyHost = null;
	private static Integer proxyPort = null;
	private static Integer defaultHttpClientMaxPerRoute = 20;
	private static Integer maxHttpClientConnections = 200;
	private static Integer httpClientTimeoutMillis = 60000;
	/**
	 * @return the encodeAlgorithm
	 */
	public static String getEncodeAlgorithm() {
		return encodeAlgorithm;
	}
	/**
	 * @param encodeAlgorithm the encodeAlgorithm to set
	 */
	public static void setEncodeAlgorithm(String encodeAlgorithm) {
		ShopifyConfig.encodeAlgorithm = encodeAlgorithm;
	}
	/**
	 * @return the charSet
	 */
	public static String getCharSet() {
		return charSet;
	}
	/**
	 * @param charSet the charSet to set
	 */
	public static void setCharSet(String charSet) {
		ShopifyConfig.charSet = charSet;
	}
	/**
	 * @return the defaultEventRequestTimeout
	 */
	public static int getDefaultEventRequestTimeout() {
		return defaultEventRequestTimeout;
	}
	/**
	 * @param defaultEventRequestTimeout the defaultEventRequestTimeout to set
	 */
	public static void setDefaultEventRequestTimeout(int defaultEventRequestTimeout) {
		ShopifyConfig.defaultEventRequestTimeout = defaultEventRequestTimeout;
	}
	/**
	 * @return the proxyHost
	 */
	public static String getProxyHost() {
		return proxyHost;
	}
	/**
	 * @param proxyHost the proxyHost to set
	 */
	public static void setProxyHost(String proxyHost) {
		ShopifyConfig.proxyHost = proxyHost;
	}
	/**
	 * @return the proxyPort
	 */
	public static Integer getProxyPort() {
		return proxyPort;
	}
	/**
	 * @param proxyPort the proxyPort to set
	 */
	public static void setProxyPort(Integer proxyPort) {
		ShopifyConfig.proxyPort = proxyPort;
	}
	/**
	 * @return the defaultHttpClientMaxPerRoute
	 */
	public static Integer getDefaultHttpClientMaxPerRoute() {
		return defaultHttpClientMaxPerRoute;
	}
	/**
	 * @param defaultHttpClientMaxPerRoute the defaultHttpClientMaxPerRoute to set
	 */
	public static void setDefaultHttpClientMaxPerRoute(Integer defaultHttpClientMaxPerRoute) {
		ShopifyConfig.defaultHttpClientMaxPerRoute = defaultHttpClientMaxPerRoute;
	}
	/**
	 * @return the maxHttpClientConnections
	 */
	public static Integer getMaxHttpClientConnections() {
		return maxHttpClientConnections;
	}
	/**
	 * @param maxHttpClientConnections the maxHttpClientConnections to set
	 */
	public static void setMaxHttpClientConnections(Integer maxHttpClientConnections) {
		ShopifyConfig.maxHttpClientConnections = maxHttpClientConnections;
	}
	/**
	 * @return the httpClientTimeoutMillis
	 */
	public static Integer getHttpClientTimeoutMillis() {
		return httpClientTimeoutMillis;
	}
	/**
	 * @param httpClientTimeoutMillis the httpClientTimeoutMillis to set
	 */
	public static void setHttpClientTimeoutMillis(Integer httpClientTimeoutMillis) {
		ShopifyConfig.httpClientTimeoutMillis = httpClientTimeoutMillis;
	}
}
