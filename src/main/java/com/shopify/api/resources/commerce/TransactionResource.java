package com.shopify.api.resources.commerce;

import com.shopify.api.ApiContext;
import com.shopify.api.contracts.orders.transaction.TransactionRequest;
import com.shopify.api.contracts.orders.transaction.TransactionResponse;
import com.shopify.api.contracts.orders.transaction.Transactions;
import com.shopify.api.model.Count;
import com.shopify.client.ShopifyClient;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:01:32 PM
 *
 */
public class TransactionResource {

	private ApiContext _apiContext;

	public TransactionResource(ApiContext apiContext) {
		_apiContext = apiContext;
	}

	/**
	 * Retrieves a list of transactions.
	 * 
	 * Transactions attached to multi-currency orders are in the presentment
	 * currency by default. To retrieve transactions in the shop currency, include
	 * the URL parameter in_shop_currency=true.
	 * 
	 * @param orderId - Order Id
	 * @return {@link Transactions}
	 */
	public Transactions getTransactions(Long orderId) throws Exception {
		ShopifyClient<Transactions> client = TransactionResourceClient.getTransactions(orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();
	}

	/**
	 * Retrieves a count of an order's transactions.
	 * 
	 * @param orderId - Order Id
	 * @return {@link Count}
	 */
	public Count getTransactionsCount(Long orderId) throws Exception {
		ShopifyClient<Count> client = TransactionResourceClient.getTransactionsCount(orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();
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
	 */
	public Transactions getTransactionById(Long orderId, Long transactionId) throws Exception {
		ShopifyClient<Transactions> client = TransactionResourceClient.getTransaction(orderId, transactionId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();
	}

	/**
	 * Creates a transaction for an order.
	 * 
	 * 
	 * <h3>Caution:</h3> For multi-currency orders, the currency property is
	 * required when creating refund and capture transactions. The value should be
	 * the presentment currency from the order. For more information, see <a href=
	 * "https://help.shopify.com/en/api/guides/multi-currency-migration-guide">Migrating
	 * to support multiple currencies</a>.
	 * 
	 * @param orderId            - Order Id
	 * @param transactionRequest - {@link TransactionRequest}
	 * @return {@link Transactions}
	 */
	public TransactionResponse createTransaction(Long orderId, TransactionRequest transactionRequest) throws Exception {
		ShopifyClient<TransactionResponse> client = TransactionResourceClient.createTransaction(orderId);
		client.setContext(_apiContext);
		client.setBody(transactionRequest);
		client.executeRequest();
		return client.getResult();
	}

}
