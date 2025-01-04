package com.shopify.api.urls;

import com.shopify.api.utils.UrlFormatter;

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 4:32:43 PM
 *
 */
public class GiftCardUrl {

	public static String resourceUrl;

	public String getResourceUrl() {
		return resourceUrl;
	}

	/**
	 * @return
	 */
	public static String getGiftCardsUrl() {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards.json");
		return formatter.getResourceUrl();
	}
	
	/**
	 * @param status
	 * @return
	 */
	public static String getGiftCardsUrlWithStatus(String status) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards.json?status={status}");
		formatter.formatUrl("status", status);
		return formatter.getResourceUrl();
	}

	/**
	 * @param status
	 * @return
	 */
	public static String getGiftCardUrl(long giftCardId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards/{giftCardId}.json");
		formatter.formatUrl("giftCardId", giftCardId);
		return formatter.getResourceUrl();
	}

	/**
	 * @param limit
	 * @param order
	 * @param query
	 * @param fields
	 * @return
	 */
	public static String getGiftCardsUrl(Integer limit, String order, String query, String fields) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards/search.json?query={query}&limit={limit}&order={order}&fields={fields}");
		formatter.formatUrl("limit", limit);
		formatter.formatUrl("order", order);
		formatter.formatUrl("query", query);
		formatter.formatUrl("fields", fields);
		return formatter.getResourceUrl();
	}

	/**
	 * @return
	 */
	public static String getGiftCardCountUrl() {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards/count.json");
		return formatter.getResourceUrl();
	}

	/**
	 * @param status
	 * @return
	 */
	public static String getGiftCardCountWithStatusUrl(String status) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards/count.json?status={status}");
		return formatter.getResourceUrl();
	}

	/**
	 * @return
	 */
	public static String createGiftCardUrl() {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards.json");
		return formatter.getResourceUrl();
	}

	/**
	 * @param giftCardId 
	 * @return
	 */
	public static String updateGiftCardUrl(String giftCardId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards/{giftCardId}.json");
		formatter.formatUrl("giftCardId", giftCardId);
		return formatter.getResourceUrl();
	}

	/**
	 * @param giftCardId
	 * @return
	 */
	public static String disableGiftCardUrl(long giftCardId) {
		UrlFormatter formatter = new UrlFormatter("/admin/api/#{api_version}/gift_cards/{giftCardId}/disable.json");
		formatter.formatUrl("giftCardId", giftCardId);
		return formatter.getResourceUrl();
	}

	
	
	
	
	
}
