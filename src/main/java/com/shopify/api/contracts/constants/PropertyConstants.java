package com.shopify.api.contracts.constants;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 5:02:26 PM
 *
 */
public interface PropertyConstants {

	public static final String HTTPS = "https://";
	public static final String USERNAME = "";
	public static final String PASSWORD = "";
	public static final String ACCESS_TOKEN_VALUE = "";
	public static final String SUBDOMAIN = "";
	public static final String API_DOMAIN = "myshopify.com";
	public static final String API_TARGET_PATH = ".myshopify.com/admin/api/";
	public static final String API_VERSION = "2019-07";
	public static final String FORWARD_SLASH = "/";
	public static final String AT = "@";
	public static final String DOT = ".";
	public static final String COLON = ":";
	public static final String DOT_JSON = ".json";
	public static final String BASIC = "Basic";
	public static final String WHITESPACE = " ";

	public static final String REQUEST_TYPE_GET = "GET";
	public static final String REQUEST_TYPE_POST = "POST";
	public static final String REQUEST_TYPE_PUT = "PUT";
	public static final String REQUEST_TYPE_DELETE = "DELETE";

	public static final String APPLICATION_JSON = "application/json";
	public static final String API_TARGET = ".myshopify.com/admin";
	public static final String ACCESS_TOKEN_HEADER = "X-Shopify-Access-Token";
	public static final String DEPRECATED_REASON_HEADER = "X-Shopify-API-Deprecated-Reason";
	public static final String OAUTH = "oauth";
	public static final String REVOKE = "revoke";
	public static final String ACCESS_TOKEN = "access_token";
	public static final String PRODUCTS = "products";
	public static final String VARIANTS = "variants";
	public static final String RECURRING_APPLICATION_CHARGES = "recurring_application_charges";
	public static final String ORDERS = "orders";
	public static final String FULFILLMENTS = "fulfillments";
	public static final String ACTIVATE = "activate";
	public static final String IMAGES = "images";
	public static final String SHOP = "shop";
	public static final String COUNT = "count";
	public static final String CLOSE = "close";
	public static final String CANCEL = "cancel";
	public static final String METAFIELDS = "metafields";
	public static final String RISKS = "risks";
	public static final String LOCATIONS = "locations";
	public static final String INVENTORY_LEVELS = "inventory_levels";
	public static final String JSON = ".json";
	public static final String LIMIT_QUERY_PARAMETER = "limit";
	public static final String PAGE_QUERY_PARAMETER = "page";
	public static final String STATUS_QUERY_PARAMETER = "status";
	public static final String ANY_STATUSES = "any";
	public static final String CREATED_AT_MIN_QUERY_PARAMETER = "created_at_min";
	public static final String CREATED_AT_MAX_QUERY_PARAMETER = "created_at_max";
	public static final String ATTRIBUTION_APP_ID_QUERY_PARAMETER = "attribution_app_id";
	public static final String CALCULATE = "calculate";
	public static final String REFUNDS = "refunds";
	public static final String TRANSACTIONS = "transactions";
	public static final String GIFT_CARDS = "gift_cards";
	public static final String REFUND_KIND = "refund";
	public static final String SET = "set";
	public static final String CLIENT_ID = "client_id";
	public static final String CLIENT_SECRET = "client_secret";
	public static final String AUTHORIZATION_CODE = "code";

	public static final int DEFAULT_REQUEST_LIMIT = 50;
	public static final int TOO_MANY_REQUESTS_STATUS_CODE = 429;
	public static final int UNPROCESSABLE_ENTITY_STATUS_CODE = 422;
	public static final int LOCKED_STATUS_CODE = 423;

	public static final String SHOP_RETRIEVED_MESSAGE = "Starting to make calls for Shopify store with ID of {} and name of {}";
	public static final String COULD_NOT_BE_SAVED_SHOPIFY_ERROR_MESSAGE = "could not successfully be saved";
	public static final String RETRY_ATTEMPT_MESSAGE = "Waited {} seconds since first retry attempt. This is attempt {}. Please review the following failed request information.\nRequest Location of {}\nResponse Status Code of {}\nResponse Headers of:\n{}\nResponse Body of:\n{}";
	public static final String RETRY_FAILED_MESSAGE = "Request retry has failed.";
	public static final String DEPRECATED_SHOPIFY_CALL_ERROR_MESSAGE = "Shopify call is deprecated. Please take note of the X-Shopify-API-Deprecated-Reason and correct the call.\nRequest Location of {}\nResponse Status Code of {}\nResponse Headers of:\n{}";
	public static final String GENERAL_ACCESS_TOKEN_EXCEPTION_MESSAGE = "There was a problem generating access token using shop subdomain of %s and authorization code of %s.";

	public static final int ONE_MINUTE_IN_MILLISECONDS = 60000;
	public static final int FIVE_MINUTES_IN_MILLISECONDS = 300000;
	public static final String QUESTION_MARK = "?";
	public static final String AND = "&";
	public static final String EQUAL = "=";
	
}
