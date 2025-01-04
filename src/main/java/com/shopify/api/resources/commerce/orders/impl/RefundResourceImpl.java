package com.shopify.api.resources.commerce.orders.impl;

import com.shopify.api.contracts.orders.refund.Refund;
import com.shopify.api.contracts.orders.refund.RefundCalculate;
import com.shopify.api.model.Collection;
import com.shopify.api.resources.commerce.orders.RefundResource;

/**
 * @author Rahul Tiwari, Created on Aug 28, 2019 - 2:03:56 PM
 *
 */
public class RefundResourceImpl implements RefundResource {

	/* (non-Javadoc)
	 * @see com.shopify.api.resources.commerce.orders.RefundResource#getOrderRefunds(java.lang.String)
	 */
	@Override
	public Collection<Refund> getOrderRefunds(String orderId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.shopify.api.resources.commerce.orders.RefundResource#getOrderRefundByIds(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Refund getOrderRefundByIds(String orderId, String refundId, String fields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.shopify.api.resources.commerce.orders.RefundResource#calculateRefund(java.lang.String, com.shopify.api.contracts.orders.refund.RefundCalculate)
	 */
	@Override
	public Refund calculateRefund(String orderId, RefundCalculate refundCalculate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.shopify.api.resources.commerce.orders.RefundResource#createRefund(java.lang.String, com.shopify.api.contracts.orders.refund.Refund)
	 */
	@Override
	public Refund createRefund(String orderId, Refund refund) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
