package com.shopify.api.resources.commerce;

import com.shopify.api.ShopifyClientFactory;
import com.shopify.api.contracts.giftcard.GiftCard;
import com.shopify.api.contracts.giftcard.GiftCardCollection;
import com.shopify.api.contracts.giftcard.GiftCardResponse;
import com.shopify.api.model.Count;
import com.shopify.api.urls.GiftCardUrl;
import com.shopify.client.ShopifyClient;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:01:32 PM
 *
 */
public class GiftCardResourceClient {

	/**
	 * Retrieves a list of gift cards.
	 * 
	 * @return List of {@link GiftCard}
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public static ShopifyClient<GiftCardCollection> getGiftCards() throws Exception {
		String url = GiftCardUrl.getGiftCardsUrl();
		String requstMethod = "GET";
		Class<?> clz = GiftCardCollection.class;
		ShopifyClient<GiftCardCollection> shopifyClient = (ShopifyClient<GiftCardCollection>) ShopifyClientFactory
				.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Retrieves a list of gift cards by Status(enable/disable).
	 * 
	 * @param status - enable/disable
	 * @return List of {@link GiftCard}
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public static ShopifyClient<GiftCardCollection> getGiftCardsByStatus(String status) throws Exception {
		String url = GiftCardUrl.getGiftCardsUrlWithStatus(status);
		String requstMethod = "GET";
		Class<?> clz = GiftCardCollection.class;
		ShopifyClient<GiftCardCollection> shopifyClient = (ShopifyClient<GiftCardCollection>) ShopifyClientFactory
				.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Searches for gift cards.
	 * 
	 * @param limit      - The maximum number of results to retrieve. (default: 50,
	 *                   maximum: 250)
	 * @param order      - The field and direction to order results by. (default:
	 *                   disabled_at DESC)
	 * @param query      - The text to search for. <a href=
	 *                   "https://help.shopify.com/en/api/getting-started/search-syntax">Search
	 *                   Syntax</a>
	 * @param fields     - Show only certain fields, specified by a comma-separated
	 *                   list of field names.
	 * @return List of {@link GiftCard}
	 * @throws Exception
	 */
	@SuppressWarnings({ "unchecked" })
	public static ShopifyClient<GiftCardCollection> getGiftCards(Integer limit, String order, String query, String fields)
			throws Exception {
		String url = GiftCardUrl.getGiftCardsUrl(limit, order, query, fields);
		String requstMethod = "GET";
		Class<?> clz = GiftCardCollection.class;
		ShopifyClient<GiftCardCollection> shopifyClient = (ShopifyClient<GiftCardCollection>) ShopifyClientFactory
				.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Retrieves a single gift card.
	 * 
	 * @param giftCardId
	 * @return {@link GiftCard}
	 * @throws Exception
	 */
	public static ShopifyClient<GiftCardResponse> getGiftCard(long giftCardId) throws Exception {
		String url = GiftCardUrl.getGiftCardUrl(giftCardId);
		String requstMethod = "GET";
		Class<?> clz = GiftCardResponse.class;
		@SuppressWarnings("unchecked")
		ShopifyClient<GiftCardResponse> shopifyClient = (ShopifyClient<GiftCardResponse>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Retrieves a count of gift cards.
	 * 
	 * @return {@link Count}
	 * @throws Exception
	 */
	public static ShopifyClient<Count> getGiftCardCount() throws Exception {
		String url = GiftCardUrl.getGiftCardCountUrl();
		String requstMethod = "GET";
		Class<?> clz = Count.class;
		@SuppressWarnings("unchecked")
		ShopifyClient<Count> shopifyClient = (ShopifyClient<Count>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);
		return shopifyClient;
	}

	/**
	 * Retrieve a count gift cards by status (enable/disable)
	 * 
	 * @param status - enable/disable
	 * @return {@link Count}
	 * @throws Exception
	 */
	public static ShopifyClient<Count> getGiftCardCountByStatus(String status) throws Exception {
		String url = GiftCardUrl.getGiftCardCountWithStatusUrl(status);
		String requstMethod = "GET";
		Class<?> clz = Count.class;
		@SuppressWarnings("unchecked")
		ShopifyClient<Count> shopifyClient = (ShopifyClient<Count>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);

		return shopifyClient;
	}

	/**
	 * Create a gift card with custom data.
	 * 
	 * @return {@link GiftCard}
	 * @throws Exception
	 */
	public static ShopifyClient<GiftCardResponse> createGiftCard() throws Exception {
		String url = GiftCardUrl.createGiftCardUrl();
		String requstMethod = "POST";
		Class<?> clz = GiftCardResponse.class;
		@SuppressWarnings("unchecked")
		ShopifyClient<GiftCardResponse> shopifyClient = (ShopifyClient<GiftCardResponse>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);
		return shopifyClient;
	}

	/**
	 * Create a gift card with an automatically generated code.
	 * 
	 * @return {@link GiftCard}
	 * @throws Exception
	 */
	public static ShopifyClient<GiftCardResponse> createGiftCardWithAutoGeneratedCode() throws Exception {
		String url = GiftCardUrl.createGiftCardUrl();
		String requstMethod = "POST";
		Class<?> clz = GiftCardResponse.class;
		@SuppressWarnings("unchecked")
		ShopifyClient<GiftCardResponse> shopifyClient = (ShopifyClient<GiftCardResponse>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);
		return shopifyClient;
	}

	/**
	 * Updates an existing gift card. The gift card's balance can't be changed via
	 * the API. You can change only the expiry date, note, and template suffix.
	 * 
	 * @param giftCardId - Gift Card Id (Shopify)
	 * @return {@link GiftCard}
	 * @throws Exception
	 */
	public static ShopifyClient<GiftCardResponse> updateGiftCard(String giftCardId) throws Exception {
		String url = GiftCardUrl.updateGiftCardUrl(giftCardId);
		String requstMethod = "PUT";
		Class<?> clz = GiftCardResponse.class;
		@SuppressWarnings("unchecked")
		ShopifyClient<GiftCardResponse> shopifyClient = (ShopifyClient<GiftCardResponse>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);
		return shopifyClient;
	}

	/**
	 * Disables a gift card. Disabling a gift card can't be undone.
	 * 
	 * @param giftCardId
	 * @return {@link GiftCard}
	 * @throws Exception
	 */
	public static ShopifyClient<GiftCard> disableGiftCard(long giftCardId) throws Exception {
		String url = GiftCardUrl.disableGiftCardUrl(giftCardId);
		String requstMethod = "POST";
		Class<?> clz = GiftCard.class;
		@SuppressWarnings("unchecked")
		ShopifyClient<GiftCard> shopifyClient = (ShopifyClient<GiftCard>) ShopifyClientFactory.getInstance(clz);
		shopifyClient.setRequestMethod(requstMethod);
		shopifyClient.setResourceUrl(url);
		return shopifyClient;
	}

}
