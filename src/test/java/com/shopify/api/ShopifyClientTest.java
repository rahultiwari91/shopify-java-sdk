package com.shopify.api;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shopify.api.contracts.giftcard.GiftCard;
import com.shopify.api.contracts.giftcard.GiftCardCollection;
import com.shopify.api.contracts.giftcard.GiftCardRequest;
import com.shopify.api.contracts.giftcard.GiftCardResponse;
import com.shopify.api.contracts.orders.transaction.Transactions;
import com.shopify.api.model.Count;
import com.shopify.api.resources.commerce.GiftCardResource;
import com.shopify.api.resources.commerce.TransactionResource;
import com.shopify.api.utils.JsonUtils;

public class ShopifyClientTest {
	ObjectMapper mapper = JsonUtils.initObjectMapper();

	ApiContext apiContext = new ApiContext();

	@Test
	public void ShopifyClientTransactionTest() throws ApiException {
		getApiContext();
		try {
			TransactionResource resource = new TransactionResource(apiContext);
			Transactions transactions = resource.getTransactions(Long.valueOf("1351459471453"));

			System.out.println(
					"Transactions: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(transactions));

			Transactions tnxs = resource.getTransactionById(Long.valueOf("1351459471453"),
					Long.valueOf("1598161846365"));

			System.out.println("Transaction: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tnxs));

			Count count = resource.getTransactionsCount(Long.valueOf("1351459471453"));

			System.out.println(
					"Transactions Count: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(count));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// @Test
	public void ShopifyClientInputStreamTest() throws ApiException {
		getApiContext();
		try {
			GiftCardResource giftCardResource = new GiftCardResource(apiContext);

			// 1
			GiftCardCollection giftCards = giftCardResource.getGiftCards();
			System.out
					.println("All GiftCards:" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(giftCards));

			// 2
			long id = Long.valueOf("185391906909");
			GiftCardResponse inputStream = giftCardResource.getGiftCard(id);
			System.out
					.println("getGiftCard:" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inputStream));

			// 3
			GiftCardCollection gcCollection = giftCardResource.getGiftCardsByStatus("enable");
			System.out.println(
					"getGiftCardsByStatus:" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(gcCollection));

			// 4
			Count count = giftCardResource.getGiftCardCount();
			System.out.println("getGiftCardCount:" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(count));

			// 5
			Count countbyStatus = giftCardResource.getGiftCardCountByStatus("enable");
			System.out.println("getGiftCardCountByStatus:"
					+ mapper.writerWithDefaultPrettyPrinter().writeValueAsString(countbyStatus));

			// 6
			GiftCardCollection gcColl = giftCardResource.getGiftCards(10, null, "GCN1", null);
			System.out.println("Search Results(getGiftCards):"
					+ mapper.writerWithDefaultPrettyPrinter().writeValueAsString(gcColl));

			// 7
			createGiftCard(giftCardResource);

			// 8
			updateGiftCard(giftCardResource, id);

			// 9
			disableGiftCard(giftCardResource, id);

			assertNotNull(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void getApiContext() {
		apiContext.setApiVersion("2019-07");
		apiContext.setPassword("3ebea74e77d5d0315c385e3a48a1af59");
		apiContext.setUsername("21b6938ada0fc0abf37150d1b6e55415");
		apiContext.setShopSubdomain("callawayapparel-dev");

	}

	/**
	 * @param giftCardResource
	 */
	private void createGiftCard(GiftCardResource giftCardResource) {
		try {
			GiftCard createGc = new GiftCard();
			final BigDecimal balance = BigDecimal.valueOf(100.0);
			createGc.setCode(randomAlphaNumeric(12) + "GCN3");
			createGc.setNote("ITPL GCI1 PEI1 GCN2");
			createGc.setInitialValue(balance);
			createGc.setTemplateSuffix("gift_cards.ignitiv.liquid");
			GiftCardRequest cardRequest = new GiftCardRequest();
			cardRequest.setGiftCard(createGc);
			GiftCardResponse createGcRes = giftCardResource.createGiftCard(cardRequest);
			System.out.println("Created:" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(createGcRes));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	/**
	 * @param giftCardResource
	 * @param id
	 */
	private void updateGiftCard(GiftCardResource giftCardResource, long id) {
		try {
			GiftCardResponse updateGc = giftCardResource.getGiftCard(id);
			updateGc.getGiftCard().setNote("GiftCardNote");
			GiftCardRequest giftCardUpdateRequest = new GiftCardRequest();
			giftCardUpdateRequest.setGiftCard(updateGc.getGiftCard());
			updateGc = giftCardResource.updateGiftCard(giftCardUpdateRequest,
					String.valueOf(updateGc.getGiftCard().getId()));
			System.out.println("Updated:" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(updateGc));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param giftCardResource
	 * @param id
	 * 
	 */
	private void disableGiftCard(GiftCardResource giftCardResource, long id) {
		try {
			GiftCard disableGc = new GiftCard();
			disableGc.setId(id);
			GiftCardRequest giftCardDisableRequest = new GiftCardRequest();
			giftCardDisableRequest.setGiftCard(disableGc);
			GiftCard disabledGc = giftCardResource.disableGiftCard(giftCardDisableRequest, id);
			System.out.println("disabled:" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(disabledGc));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
