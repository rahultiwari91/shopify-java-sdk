package com.shopify.api.resources.commerce;

import com.shopify.api.ShopifyClientFactory;
import com.shopify.api.contracts.orders.transaction.TransactionResponse;
import com.shopify.api.contracts.orders.transaction.Transactions;
import com.shopify.api.model.Count;
import com.shopify.api.urls.TransactionUrl;
import com.shopify.client.ShopifyClient;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:01:32 PM
 *
 */
public class TransactionResourceClient {

	/**
	 * Retrieves a list of transactions.
	 * 
	 * Transactions attached to multi-currency orders are in the presentment
	 * currency by default. To retrieve transactions in the shop currency, include
	 * the URL parameter in_shop_currency=true.
	 * 
	 * @param orderId - Order Id
	 * @return {@link Transactions}
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static ShopifyClient<Transactions> getTransactions(Long orderId) throws Exception {
		String url = TransactionUrl.getTransactionsUrl(orderId);
		String requstMethod = "GET";
		Class<?> clz = Transactions.class;
		ShopifyClient<Transactions> shopifyClient = (ShopifyClient<Transactions>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Retrieves a count of an order's transactions.
	 * 
	 * @param orderId - Order Id
	 * @return {@link Count}
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static ShopifyClient<Count> getTransactionsCount(Long orderId) throws Exception {
		String url = TransactionUrl.getTransactionsCountUrl(orderId);
		String requstMethod = "GET";
		Class<?> clz = Count.class;
		ShopifyClient<Count> shopifyClient = (ShopifyClient<Count>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Retrieves a specific transaction.
	 * 
	 * Transactions attached to multi-currency orders are in the presentment
	 * currency by default. To retrieve transactions in the shop currency, include
	 * the URL parameter in_shop_currency=true.
	 * 
	 * @param orderId       - Order Id
	 * @param transactionId - Transaction Id
	 * @return {@link Transactions}
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static ShopifyClient<Transactions> getTransaction(Long orderId, Long transactionId) throws Exception {
		String url = TransactionUrl.getTransactionUrl(orderId, transactionId);
		String requstMethod = "GET";
		Class<?> clz = Transactions.class;
		ShopifyClient<Transactions> shopifyClient = (ShopifyClient<Transactions>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Creates a transaction for an order.
	 * 
	 * @param orderId
	 * @return {@link Transactions}
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static ShopifyClient<TransactionResponse> createTransaction(Long orderId) throws Exception {
		String url = TransactionUrl.createTransactionUrl(orderId);
		String requstMethod = "POST";
		Class<?> clz = TransactionResponse.class;
		ShopifyClient<TransactionResponse> shopifyClient = (ShopifyClient<TransactionResponse>) ShopifyClientFactory
				.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);
		return shopifyClient;
	}

}
