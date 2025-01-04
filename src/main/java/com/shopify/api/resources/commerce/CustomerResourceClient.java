package com.shopify.api.resources.commerce;

import java.util.List;

import com.shopify.api.contracts.customer.Customer;
import com.shopify.api.contracts.order.Order;
import com.shopify.api.model.Collection;
import com.shopify.api.model.Count;
import com.shopify.client.ShopifyClient;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:01:16 PM
 *
 */
public class CustomerResourceClient {

	/**
	 * Retrieves a list of Customers. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#index-2019-07">More
	 * Details</a><br>
	 * 
	 * @return List of Customers - {@link Collection}
	 * @throws Exception
	 */
	public static ShopifyClient<List<Customer>> getCustomers() throws Exception {
		return null;
	}

	/**
	 * Retrieves a list of customers with filter. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#index-2019-07">More
	 * Details</a>
	 * 
	 * @param limit  - The maximum number of results to retrieve. (default: 50,
	 *               maximum: 250)
	 * @param filter - The text to search for. <a href=
	 *               "https://help.shopify.com/en/api/getting-started/search-syntax">Search
	 *               Syntax</a>
	 * @param fields - Show only certain fields, specified by a comma-separated list
	 *               of field names.
	 * @return List of {@link Customer}
	 * @throws Exception
	 */
	public static ShopifyClient<List<Customer>> getCustomers(Integer limit, String filter, String fields)
			throws Exception {
		return null;
	}

	/**
	 * Retrieves a list of customers with filter. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#search-2019-07">More
	 * Details</a>
	 * 
	 * @param limit  - The maximum number of results to retrieve. (default: 50,
	 *               maximum: 250)
	 * @param order  - Set the field and direction by which to order results.
	 *               (default: last_order_date DESC)
	 * @param filter - Text to search for in the shop's customer data. <a href=
	 *               "https://help.shopify.com/en/api/getting-started/search-syntax">Search
	 *               Syntax</a>
	 * @param fields - Show only certain fields, specified by a comma-separated list
	 *               of field names.
	 * @return List of {@link Customer}
	 * @throws Exception
	 */
	public static ShopifyClient<List<Customer>> getCustomers(Integer limit, String order, String query, String fields)
			throws Exception {
		return null;
	}

	/**
	 * Retrieves a single customer. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#show-2019-07">More
	 * Details</a><br>
	 * 
	 * @param customerId - Customer Id
	 * @return {@link Customer}
	 * @throws Exception
	 */
	public static ShopifyClient<Customer> getCustomer(String customerId) throws Exception {
		return null;
	}

	/**
	 * Retrieves a single customer. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#show-2019-07">More
	 * Details</a><br>
	 * 
	 * @param customerId - Customer Id
	 * @param fields     - Show only certain fields, specified by a comma-separated
	 *                   list of field names.
	 * @return {@link Customer}
	 * @throws Exception
	 */
	public static ShopifyClient<Customer> getCustomer(String customerId, String fields) throws Exception {
		return null;
	}

	/**
	 * Creates a customer. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#create-2019-07">More
	 * Details</a><br>
	 * 
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public static ShopifyClient<Customer> createCustomer(Customer customer) throws Exception {
		return null;
	}

	/**
	 * Updates a customer. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#update-2019-07">More
	 * Details</a><br>
	 * 
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public static ShopifyClient<Customer> updateCustomer(String customerId, Customer customer) throws Exception {
		return null;
	}

	/**
	 * Retrieves a count of all customers.<a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#count-2019-07">More
	 * Details</a><br>
	 * 
	 * @return {@link Count}
	 * @throws Exception
	 */
	public static ShopifyClient<Count> customersCount() throws Exception {
		return null;
	}

	/**
	 * Retrieves all orders belonging to a customer. <a href=
	 * "https://help.shopify.com/en/api/reference/customers/customer#orders-2019-07">More
	 * Details</a><br>
	 * 
	 * @param customerId - Customer Id to get all the orders.
	 * @return List of {@link Order}
	 * @throws Exception
	 */
	public static ShopifyClient<Order> getOrders(String customerId) throws Exception {
		return null;
	}

}
