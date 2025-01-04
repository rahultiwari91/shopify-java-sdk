package com.shopify.api.urls;

import com.shopify.api.utils.UrlFormatter;

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 4:32:12 PM
 *
 */
public class OrderUrl {

	/**
	 * @param orderId
	 * @return
	 */
	public static String getOrderUrl(Long orderId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/orders/{order_id}.json");
		formatter.formatUrl("order_id", orderId);
		return formatter.getResourceUrl();
	}

}
