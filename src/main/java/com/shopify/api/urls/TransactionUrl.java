package com.shopify.api.urls;

import com.shopify.api.utils.UrlFormatter;

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 4:32:43 PM
 *
 */
public class TransactionUrl {

	public static String resourceUrl;

	public String getResourceUrl() {
		return resourceUrl;
	}

	/**
	 * @param orderId
	 * @return
	 */
	public static String getTransactionsUrl(Long orderId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/orders/{order_id}/transactions.json");
		formatter.formatUrl("order_id", orderId);
		return formatter.getResourceUrl();
	}

	/**
	 * @param orderId
	 * @return
	 */
	public static String getTransactionsCountUrl(Long orderId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/orders/{order_id}/transactions/count.json");
		formatter.formatUrl("order_id", orderId);
		return formatter.getResourceUrl();
	}

	/**
	 * @param orderId
	 * @param transactionId
	 * @return
	 */
	public static String getTransactionUrl(Long orderId, Long transactionId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/orders/{order_id}/transactions/{transaction_id}.json");
		formatter.formatUrl("order_id", orderId);
		formatter.formatUrl("transaction_id", transactionId);
		return formatter.getResourceUrl();
	}

	/**
	 * @return
	 */
	public static String createTransactionUrl(Long orderId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/orders/{order_id}/transactions.json");
		formatter.formatUrl("order_id", orderId);
		return formatter.getResourceUrl();
	}
	
}
