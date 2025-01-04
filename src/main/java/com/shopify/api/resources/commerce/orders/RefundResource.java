package com.shopify.api.resources.commerce.orders;

import com.shopify.api.contracts.orders.refund.Refund;
import com.shopify.api.contracts.orders.refund.RefundCalculate;
import com.shopify.api.model.Collection;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:03:59 PM
 *
 */
public interface RefundResource {

	/**
	 * Retrieve all refunds from a specific order. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/refund#index-2019-07">More
	 * Details</a>
	 * 
	 * @param orderId - Order Id to get the refunds.
	 * @return List of Refunds - {@link Collection}.
	 * @throws Exception
	 */
	Collection<Refund> getOrderRefunds(String orderId) throws Exception;

	/**
	 * Retrieves a specific refund. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/refund#show-2019-07">More
	 * Details</a>
	 * 
	 * @param orderId  - Order Id to get the refunds.
	 * @param refundId - Refund Id to get the specific refund.
	 * @param fields   - Show only certain fields, specified by a comma-separated
	 *                 list of field names.
	 * @return - {@link Refund}
	 * @throws Exception
	 */
	Refund getOrderRefundByIds(String orderId, String refundId, String fields) throws Exception;

	/**
	 * Calculate the refund for a line item and shipping. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/refund#calculate-2019-07">More
	 * Details</a><br>
	 * 
	 * <h3>Caution:</h3>For multi-currency orders, the currency property is required
	 * whenever the amount property is provided. For more information, see <a href=
	 * "https://help.shopify.com/en/api/guides/multi-currency-migration-guide">Migrating
	 * to support multiple currencies</a>.<br>
	 * 
	 * Calculates refund transactions based on line items and shipping. When you
	 * want to create a refund, you should first use the calculate endpoint to
	 * generate accurate refund transactions. Specify the line items that are being
	 * refunded, their quantity and restock instructions, and whether you intend to
	 * refund shipping costs. If the restock instructions can't be met—for example,
	 * because you try to return more items than have been fulfilled—then the
	 * endpoint returns modified restock instructions. You can then use the response
	 * in the body of the request to create the actual refund.<br>
	 * The response includes a transactions object with "kind": "suggested_refund",
	 * which must to be changed to "kind" : "refund" for the refund to be accepted.
	 * 
	 * @param orderId - Order Id to calculate the Refund
	 * @param refundCalculate - {@link RefundCalculate}
	 * @return {@link Refund}
	 * @throws Exception
	 */
	Refund calculateRefund(String orderId, RefundCalculate refundCalculate) throws Exception;

	/**
	 * Create a refund for an order. Use the calculate endpoint to produce the
	 * transactions to submit. <a href=
	 * "https://help.shopify.com/en/api/reference/orders/refund#create-2019-07">More
	 * Details</a><br>
	 * 
	 * <h3>Caution:</h3> For multi-currency orders, the currency property is
	 * required whenever the amount property is provided. For more information, see
	 * <a href=
	 * "https://help.shopify.com/en/api/guides/multi-currency-migration-guide">Migrating
	 * to support multiple currencies</a>.<br>
	 * 
	 * <h3>Note:</h3> When you use this endpoint with a Partner development store or
	 * a trial store, you can create only five refunds per minute.
	 * 
	 * @param orderId - Order Id to create the Refund
	 * @param refund - {@link Refund}
	 * @return {@link Refund}
	 * @throws Exception
	 */
	Refund createRefund(String orderId, Refund refund) throws Exception;

}
