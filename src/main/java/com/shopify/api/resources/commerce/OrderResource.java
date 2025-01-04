package com.shopify.api.resources.commerce;

import com.shopify.api.ApiContext;
import com.shopify.api.contracts.order.Order;
import com.shopify.api.contracts.order.OrderResponse;
import com.shopify.api.model.Collection;
import com.shopify.api.model.Count;
import com.shopify.client.ShopifyClient;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:00:53 PM
 *
 */
public class OrderResource {

	private ApiContext _apiContext;

	public OrderResource(ApiContext apiContext) {
		_apiContext = apiContext;
	}

	/**
	 * Retrieves a list of orders.
	 * 
	 * @return List of {@link Order}
	 * @throws Exception
	 */
	public Collection<Order> getOrders() throws Exception {
		return null;
	}

	/**
	 * Retrieves a list of orders by Status(enable/disable).
	 * 
	 * @param status - enable/disable
	 * @return List of {@link Order}
	 * @throws Exception
	 */
	public Collection<Order> getOrdersByStatus(String status) throws Exception {
		return null;
	}

	/**
	 * Filter orders.
	 * 
	 * @param limit  - The maximum number of results to retrieve. (default: 50,
	 *               maximum: 250)
	 * @param order  - The field and direction to order results by. (default:
	 *               disabled_at DESC)
	 * @param filter - <a href=
	 *               "https://help.shopify.com/en/api/reference/orders/order#index-2019-07">Order
	 *               valid filters</a>
	 * @param fields - Show only certain fields, specified by a comma-separated list
	 *               of field names.
	 * @return List of {@link Order}
	 * @throws Exception
	 */
	public Collection<Order> getOrders(Integer limit, String order, String filter, String fields) throws Exception {
		return null;
	}

	/**
	 * Retrieves a specific order. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/order#show-2019-07">More
	 * Details</a><br>
	 * 
	 * @param orderId
	 * @return {@link Order}
	 * @throws Exception
	 */
	public OrderResponse getOrder(Long orderId) throws Exception {
		ShopifyClient<OrderResponse> client = OrderResourceClient.getOrder(orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();
	}

	/**
	 * Retrieves a count of orders. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/order#count-2019-07">More
	 * Details</a><br>
	 * 
	 * @return {@link Count}
	 * @throws Exception
	 */
	public Count getOrderCount() throws Exception {
		return null;
	}

	/**
	 * Retrieves count of orders by filters.
	 * 
	 * @param Filter - <a href=
	 *               "https://help.shopify.com/en/api/reference/orders/order#count-2019-07">Valid
	 *               Filters</a>
	 * @return {@link Count}
	 * @throws Exception
	 */
	public Count getOrderCount(String filter) throws Exception {
		return null;
	}

	/**
	 * Creates an order. By default, product inventory is not claimed. When you
	 * create an order, you can include the following option parameters in the body
	 * of the request: <br>
	 * <h3>inventory_behaviour:</h3> The behaviour to use when updating inventory.
	 * (default: bypass) <br>
	 * <h3>bypass:</h3> Do not claim inventory. <br>
	 * <h3>decrement_ignoring_policy:</h3> Ignore the product's inventory policy and
	 * claim inventory. <br>
	 * <h3>decrement_obeying_policy:</h3> Follow the product's inventory policy and
	 * claim inventory, if possible. <br>
	 * <h3>send_receipt:</h3> Whether to send an order confirmation to the customer.
	 * <br>
	 * <h3>Note:</h3> If you're working on a private app and order confirmations are
	 * still being sent to the customer when send_receipt is set to false, then you
	 * need to disable the Storefront API from the private app's page in the Shopify
	 * admin. <br>
	 * <h3>send_fulfillment_receipt:</h3> Whether to send a shipping confirmation to
	 * the customer. <br>
	 * <h3>Note:</h3> If you're using this endpoint with a trial or Partner
	 * development store, then you can create no more than 5 new orders per minute.
	 * <a href=
	 * "https://help.shopify.com/en/api/reference/orders/order?api[version]=2019-07#create-2019-07">More
	 * Details</a>
	 * 
	 * @param Order - {@link Order}
	 * @return {@link Order}
	 * @throws Exception
	 */
	public Order createOrder(Order Order) throws Exception {
		return null;
	}

	/**
	 * Updates an existing order.
	 * 
	 * @param Order - {@link Order}
	 * @return {@link Order}
	 * @throws Exception
	 */
	public OrderResponse updateOrder(Order Order) throws Exception {
		ShopifyClient<OrderResponse> client = OrderResourceClient.updateOrder(Order);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();
	}

	/**
	 * Deletes an order. Orders that interact with an online gateway can't be
	 * deleted.
	 * 
	 * @param orderId
	 * @throws Exception
	 */
	public void deleteOrder(String orderId) throws Exception {
	}

	/**
	 * Closes an order. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/order#close-2019-07">More
	 * Details</a><br>
	 * 
	 * @param orderId
	 * @return {@link Order}
	 * @throws Exception
	 */
	public Order closeOrder(String orderId) throws Exception {
		return null;
	}

	/**
	 * Re-opens a closed order. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/order#open-2019-07">More
	 * Details</a><br>
	 * 
	 * @param orderId
	 * @return {@link Order}
	 * @throws Exception
	 */
	public Order reOpenOrder(String orderId) throws Exception {
		return null;
	}

	/**
	 * Cancels an order. Orders that have a fulfillment object can't be canceled.
	 * <a href=
	 * "https://help.shopify.com/en/api/reference/orders/order#cancel-2019-07">More
	 * Details</a><br>
	 * Caution - For multi-currency orders, the currency property is required
	 * whenever the amount property is provided. For more information, see <a href=
	 * "https://help.shopify.com/en/api/guides/multi-currency-migration-guide">Migrating
	 * to support multiple currencies</a>.
	 * 
	 * @param orderId
	 * @return {@link Order}
	 * @throws Exception
	 */
	public Order cancelOrder(String orderId) throws Exception {
		return null;
	}

}
