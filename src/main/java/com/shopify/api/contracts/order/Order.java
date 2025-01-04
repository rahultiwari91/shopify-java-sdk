
package com.shopify.api.contracts.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "email", "closed_at", "created_at", "updated_at", "number", "note", "token", "gateway",
		"test", "total_price", "subtotal_price", "total_weight", "total_tax", "taxes_included", "currency",
		"financial_status", "confirmed", "total_discounts", "total_line_items_price", "cart_token",
		"buyer_accepts_marketing", "name", "referring_site", "landing_site", "cancelled_at", "cancel_reason",
		"total_price_usd", "checkout_token", "reference", "user_id", "location_id", "source_identifier", "source_url",
		"processed_at", "device_id", "phone", "customer_locale", "app_id", "browser_ip", "landing_site_ref",
		"order_number", "discount_applications", "discount_codes", "note_attributes", "payment_gateway_names",
		"processing_method", "checkout_id", "source_name", "fulfillment_status", "tax_lines", "tags", "contact_email",
		"order_status_url", "presentment_currency", "total_line_items_price_set", "total_discounts_set",
		"total_shipping_price_set", "subtotal_price_set", "total_price_set", "total_tax_set", "admin_graphql_api_id",
		"line_items", "shipping_lines", "billing_address", "shipping_address", "fulfillments", "client_details",
		"refunds", "payment_details", "customer" })
public class Order implements Serializable {

	@JsonProperty("id")
	private long id;
	@JsonProperty("email")
	private String email;
	@JsonProperty("closed_at")
	private Object closedAt;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("number")
	private long number;
	@JsonProperty("note")
	private Object note;
	@JsonProperty("token")
	private String token;
	@JsonProperty("gateway")
	private String gateway;
	@JsonProperty("test")
	private boolean test;
	@JsonProperty("total_price")
	private String totalPrice;
	@JsonProperty("subtotal_price")
	private String subtotalPrice;
	@JsonProperty("total_weight")
	private long totalWeight;
	@JsonProperty("total_tax")
	private String totalTax;
	@JsonProperty("taxes_included")
	private boolean taxesIncluded;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("financial_status")
	private String financialStatus;
	@JsonProperty("confirmed")
	private boolean confirmed;
	@JsonProperty("total_discounts")
	private String totalDiscounts;
	@JsonProperty("total_line_items_price")
	private String totalLineItemsPrice;
	@JsonProperty("cart_token")
	private String cartToken;
	@JsonProperty("buyer_accepts_marketing")
	private boolean buyerAcceptsMarketing;
	@JsonProperty("name")
	private String name;
	@JsonProperty("referring_site")
	private String referringSite;
	@JsonProperty("landing_site")
	private String landingSite;
	@JsonProperty("cancelled_at")
	private Object cancelledAt;
	@JsonProperty("cancel_reason")
	private Object cancelReason;
	@JsonProperty("total_price_usd")
	private String totalPriceUsd;
	@JsonProperty("checkout_token")
	private String checkoutToken;
	@JsonProperty("reference")
	private String reference;
	@JsonProperty("user_id")
	private Object userId;
	@JsonProperty("location_id")
	private Object locationId;
	@JsonProperty("source_identifier")
	private String sourceIdentifier;
	@JsonProperty("source_url")
	private Object sourceUrl;
	@JsonProperty("processed_at")
	private String processedAt;
	@JsonProperty("device_id")
	private Object deviceId;
	@JsonProperty("phone")
	private String phone;
	@JsonProperty("customer_locale")
	private Object customerLocale;
	@JsonProperty("app_id")
	private Object appId;
	@JsonProperty("browser_ip")
	private String browserIp;
	@JsonProperty("landing_site_ref")
	private String landingSiteRef;
	@JsonProperty("order_number")
	private long orderNumber;
	@JsonProperty("discount_applications")
	private List<DiscountApplication> discountApplications = new ArrayList<DiscountApplication>();
	@JsonProperty("discount_codes")
	private List<DiscountCode> discountCodes = new ArrayList<DiscountCode>();
	@JsonProperty("note_attributes")
	private List<NoteAttribute> noteAttributes = new ArrayList<NoteAttribute>();
	@JsonProperty("payment_gateway_names")
	private List<String> paymentGatewayNames = new ArrayList<String>();
	@JsonProperty("processing_method")
	private String processingMethod;
	@JsonProperty("checkout_id")
	private long checkoutId;
	@JsonProperty("source_name")
	private String sourceName;
	@JsonProperty("fulfillment_status")
	private Object fulfillmentStatus;
	@JsonProperty("tax_lines")
	private List<TaxLine> taxLines = new ArrayList<TaxLine>();
	@JsonProperty("tags")
	private String tags;
	@JsonProperty("contact_email")
	private String contactEmail;
	@JsonProperty("order_status_url")
	private String orderStatusUrl;
	@JsonProperty("presentment_currency")
	private String presentmentCurrency;
	@JsonProperty("total_line_items_price_set")
	private TotalLineItemsPriceSet totalLineItemsPriceSet;
	@JsonProperty("total_discounts_set")
	private TotalDiscountsSet totalDiscountsSet;
	@JsonProperty("total_shipping_price_set")
	private TotalShippingPriceSet totalShippingPriceSet;
	@JsonProperty("subtotal_price_set")
	private SubtotalPriceSet subtotalPriceSet;
	@JsonProperty("total_price_set")
	private TotalPriceSet totalPriceSet;
	@JsonProperty("total_tax_set")
	private TotalTaxSet totalTaxSet;
	@JsonProperty("admin_graphql_api_id")
	private String adminGraphqlApiId;
	@JsonProperty("line_items")
	private List<LineItem> lineItems = new ArrayList<LineItem>();
	@JsonProperty("shipping_lines")
	private List<ShippingLine> shippingLines = new ArrayList<ShippingLine>();
	@JsonProperty("billing_address")
	private BillingAddress billingAddress;
	@JsonProperty("shipping_address")
	private ShippingAddress shippingAddress;
	@JsonProperty("fulfillments")
	private List<Fulfillment> fulfillments = new ArrayList<Fulfillment>();
	@JsonProperty("client_details")
	private ClientDetails clientDetails;
	@JsonProperty("refunds")
	private List<Refund> refunds = new ArrayList<Refund>();
	@JsonProperty("payment_details")
	private PaymentDetails paymentDetails;
	@JsonProperty("customer")
	private Customer customer;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 4090850248556376747L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Order() {
	}

	/**
	 * 
	 * @param phone
	 * @param gateway
	 * @param test
	 * @param subtotalPrice
	 * @param totalPriceSet
	 * @param customer
	 * @param totalShippingPriceSet
	 * @param cancelReason
	 * @param totalTaxSet
	 * @param subtotalPriceSet
	 * @param confirmed
	 * @param browserIp
	 * @param totalPriceUsd
	 * @param userId
	 * @param cartToken
	 * @param discountApplications
	 * @param checkoutId
	 * @param presentmentCurrency
	 * @param processedAt
	 * @param deviceId
	 * @param number
	 * @param totalLineItemsPrice
	 * @param email
	 * @param buyerAcceptsMarketing
	 * @param noteAttributes
	 * @param refunds
	 * @param appId
	 * @param closedAt
	 * @param taxLines
	 * @param locationId
	 * @param landingSite
	 * @param checkoutToken
	 * @param paymentDetails
	 * @param sourceUrl
	 * @param taxesIncluded
	 * @param currency
	 * @param id
	 * @param referringSite
	 * @param totalDiscounts
	 * @param token
	 * @param sourceName
	 * @param createdAt
	 * @param name
	 * @param financialStatus
	 * @param shippingAddress
	 * @param lineItems
	 * @param fulfillmentStatus
	 * @param note
	 * @param totalPrice
	 * @param tags
	 * @param fulfillments
	 * @param contactEmail
	 * @param cancelledAt
	 * @param adminGraphqlApiId
	 * @param processingMethod
	 * @param shippingLines
	 * @param sourceIdentifier
	 * @param reference
	 * @param landingSiteRef
	 * @param discountCodes
	 * @param updatedAt
	 * @param totalDiscountsSet
	 * @param orderStatusUrl
	 * @param customerLocale
	 * @param totalWeight
	 * @param orderNumber
	 * @param paymentGatewayNames
	 * @param billingAddress
	 * @param totalLineItemsPriceSet
	 * @param totalTax
	 * @param clientDetails
	 */
	public Order(long id, String email, Object closedAt, String createdAt, String updatedAt, long number, Object note,
			String token, String gateway, boolean test, String totalPrice, String subtotalPrice, long totalWeight,
			String totalTax, boolean taxesIncluded, String currency, String financialStatus, boolean confirmed,
			String totalDiscounts, String totalLineItemsPrice, String cartToken, boolean buyerAcceptsMarketing,
			String name, String referringSite, String landingSite, Object cancelledAt, Object cancelReason,
			String totalPriceUsd, String checkoutToken, String reference, Object userId, Object locationId,
			String sourceIdentifier, Object sourceUrl, String processedAt, Object deviceId, String phone,
			Object customerLocale, Object appId, String browserIp, String landingSiteRef, long orderNumber,
			List<DiscountApplication> discountApplications, List<DiscountCode> discountCodes,
			List<NoteAttribute> noteAttributes, List<String> paymentGatewayNames, String processingMethod,
			long checkoutId, String sourceName, Object fulfillmentStatus, List<TaxLine> taxLines, String tags,
			String contactEmail, String orderStatusUrl, String presentmentCurrency,
			TotalLineItemsPriceSet totalLineItemsPriceSet, TotalDiscountsSet totalDiscountsSet,
			TotalShippingPriceSet totalShippingPriceSet, SubtotalPriceSet subtotalPriceSet, TotalPriceSet totalPriceSet,
			TotalTaxSet totalTaxSet, String adminGraphqlApiId, List<LineItem> lineItems,
			List<ShippingLine> shippingLines, BillingAddress billingAddress, ShippingAddress shippingAddress,
			List<Fulfillment> fulfillments, ClientDetails clientDetails, List<Refund> refunds,
			PaymentDetails paymentDetails, Customer customer) {
		super();
		this.id = id;
		this.email = email;
		this.closedAt = closedAt;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.number = number;
		this.note = note;
		this.token = token;
		this.gateway = gateway;
		this.test = test;
		this.totalPrice = totalPrice;
		this.subtotalPrice = subtotalPrice;
		this.totalWeight = totalWeight;
		this.totalTax = totalTax;
		this.taxesIncluded = taxesIncluded;
		this.currency = currency;
		this.financialStatus = financialStatus;
		this.confirmed = confirmed;
		this.totalDiscounts = totalDiscounts;
		this.totalLineItemsPrice = totalLineItemsPrice;
		this.cartToken = cartToken;
		this.buyerAcceptsMarketing = buyerAcceptsMarketing;
		this.name = name;
		this.referringSite = referringSite;
		this.landingSite = landingSite;
		this.cancelledAt = cancelledAt;
		this.cancelReason = cancelReason;
		this.totalPriceUsd = totalPriceUsd;
		this.checkoutToken = checkoutToken;
		this.reference = reference;
		this.userId = userId;
		this.locationId = locationId;
		this.sourceIdentifier = sourceIdentifier;
		this.sourceUrl = sourceUrl;
		this.processedAt = processedAt;
		this.deviceId = deviceId;
		this.phone = phone;
		this.customerLocale = customerLocale;
		this.appId = appId;
		this.browserIp = browserIp;
		this.landingSiteRef = landingSiteRef;
		this.orderNumber = orderNumber;
		this.discountApplications = discountApplications;
		this.discountCodes = discountCodes;
		this.noteAttributes = noteAttributes;
		this.paymentGatewayNames = paymentGatewayNames;
		this.processingMethod = processingMethod;
		this.checkoutId = checkoutId;
		this.sourceName = sourceName;
		this.fulfillmentStatus = fulfillmentStatus;
		this.taxLines = taxLines;
		this.tags = tags;
		this.contactEmail = contactEmail;
		this.orderStatusUrl = orderStatusUrl;
		this.presentmentCurrency = presentmentCurrency;
		this.totalLineItemsPriceSet = totalLineItemsPriceSet;
		this.totalDiscountsSet = totalDiscountsSet;
		this.totalShippingPriceSet = totalShippingPriceSet;
		this.subtotalPriceSet = subtotalPriceSet;
		this.totalPriceSet = totalPriceSet;
		this.totalTaxSet = totalTaxSet;
		this.adminGraphqlApiId = adminGraphqlApiId;
		this.lineItems = lineItems;
		this.shippingLines = shippingLines;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.fulfillments = fulfillments;
		this.clientDetails = clientDetails;
		this.refunds = refunds;
		this.paymentDetails = paymentDetails;
		this.customer = customer;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	public Order withId(long id) {
		this.id = id;
		return this;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	public Order withEmail(String email) {
		this.email = email;
		return this;
	}

	@JsonProperty("closed_at")
	public Object getClosedAt() {
		return closedAt;
	}

	@JsonProperty("closed_at")
	public void setClosedAt(Object closedAt) {
		this.closedAt = closedAt;
	}

	public Order withClosedAt(Object closedAt) {
		this.closedAt = closedAt;
		return this;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Order withCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@JsonProperty("updated_at")
	public String getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Order withUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@JsonProperty("number")
	public long getNumber() {
		return number;
	}

	@JsonProperty("number")
	public void setNumber(long number) {
		this.number = number;
	}

	public Order withNumber(long number) {
		this.number = number;
		return this;
	}

	@JsonProperty("note")
	public Object getNote() {
		return note;
	}

	@JsonProperty("note")
	public void setNote(Object note) {
		this.note = note;
	}

	public Order withNote(Object note) {
		this.note = note;
		return this;
	}

	@JsonProperty("token")
	public String getToken() {
		return token;
	}

	@JsonProperty("token")
	public void setToken(String token) {
		this.token = token;
	}

	public Order withToken(String token) {
		this.token = token;
		return this;
	}

	@JsonProperty("gateway")
	public String getGateway() {
		return gateway;
	}

	@JsonProperty("gateway")
	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public Order withGateway(String gateway) {
		this.gateway = gateway;
		return this;
	}

	@JsonProperty("test")
	public boolean isTest() {
		return test;
	}

	@JsonProperty("test")
	public void setTest(boolean test) {
		this.test = test;
	}

	public Order withTest(boolean test) {
		this.test = test;
		return this;
	}

	@JsonProperty("total_price")
	public String getTotalPrice() {
		return totalPrice;
	}

	@JsonProperty("total_price")
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order withTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
		return this;
	}

	@JsonProperty("subtotal_price")
	public String getSubtotalPrice() {
		return subtotalPrice;
	}

	@JsonProperty("subtotal_price")
	public void setSubtotalPrice(String subtotalPrice) {
		this.subtotalPrice = subtotalPrice;
	}

	public Order withSubtotalPrice(String subtotalPrice) {
		this.subtotalPrice = subtotalPrice;
		return this;
	}

	@JsonProperty("total_weight")
	public long getTotalWeight() {
		return totalWeight;
	}

	@JsonProperty("total_weight")
	public void setTotalWeight(long totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Order withTotalWeight(long totalWeight) {
		this.totalWeight = totalWeight;
		return this;
	}

	@JsonProperty("total_tax")
	public String getTotalTax() {
		return totalTax;
	}

	@JsonProperty("total_tax")
	public void setTotalTax(String totalTax) {
		this.totalTax = totalTax;
	}

	public Order withTotalTax(String totalTax) {
		this.totalTax = totalTax;
		return this;
	}

	@JsonProperty("taxes_included")
	public boolean isTaxesIncluded() {
		return taxesIncluded;
	}

	@JsonProperty("taxes_included")
	public void setTaxesIncluded(boolean taxesIncluded) {
		this.taxesIncluded = taxesIncluded;
	}

	public Order withTaxesIncluded(boolean taxesIncluded) {
		this.taxesIncluded = taxesIncluded;
		return this;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Order withCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	@JsonProperty("financial_status")
	public String getFinancialStatus() {
		return financialStatus;
	}

	@JsonProperty("financial_status")
	public void setFinancialStatus(String financialStatus) {
		this.financialStatus = financialStatus;
	}

	public Order withFinancialStatus(String financialStatus) {
		this.financialStatus = financialStatus;
		return this;
	}

	@JsonProperty("confirmed")
	public boolean isConfirmed() {
		return confirmed;
	}

	@JsonProperty("confirmed")
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public Order withConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
		return this;
	}

	@JsonProperty("total_discounts")
	public String getTotalDiscounts() {
		return totalDiscounts;
	}

	@JsonProperty("total_discounts")
	public void setTotalDiscounts(String totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	public Order withTotalDiscounts(String totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
		return this;
	}

	@JsonProperty("total_line_items_price")
	public String getTotalLineItemsPrice() {
		return totalLineItemsPrice;
	}

	@JsonProperty("total_line_items_price")
	public void setTotalLineItemsPrice(String totalLineItemsPrice) {
		this.totalLineItemsPrice = totalLineItemsPrice;
	}

	public Order withTotalLineItemsPrice(String totalLineItemsPrice) {
		this.totalLineItemsPrice = totalLineItemsPrice;
		return this;
	}

	@JsonProperty("cart_token")
	public String getCartToken() {
		return cartToken;
	}

	@JsonProperty("cart_token")
	public void setCartToken(String cartToken) {
		this.cartToken = cartToken;
	}

	public Order withCartToken(String cartToken) {
		this.cartToken = cartToken;
		return this;
	}

	@JsonProperty("buyer_accepts_marketing")
	public boolean isBuyerAcceptsMarketing() {
		return buyerAcceptsMarketing;
	}

	@JsonProperty("buyer_accepts_marketing")
	public void setBuyerAcceptsMarketing(boolean buyerAcceptsMarketing) {
		this.buyerAcceptsMarketing = buyerAcceptsMarketing;
	}

	public Order withBuyerAcceptsMarketing(boolean buyerAcceptsMarketing) {
		this.buyerAcceptsMarketing = buyerAcceptsMarketing;
		return this;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	public Order withName(String name) {
		this.name = name;
		return this;
	}

	@JsonProperty("referring_site")
	public String getReferringSite() {
		return referringSite;
	}

	@JsonProperty("referring_site")
	public void setReferringSite(String referringSite) {
		this.referringSite = referringSite;
	}

	public Order withReferringSite(String referringSite) {
		this.referringSite = referringSite;
		return this;
	}

	@JsonProperty("landing_site")
	public String getLandingSite() {
		return landingSite;
	}

	@JsonProperty("landing_site")
	public void setLandingSite(String landingSite) {
		this.landingSite = landingSite;
	}

	public Order withLandingSite(String landingSite) {
		this.landingSite = landingSite;
		return this;
	}

	@JsonProperty("cancelled_at")
	public Object getCancelledAt() {
		return cancelledAt;
	}

	@JsonProperty("cancelled_at")
	public void setCancelledAt(Object cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public Order withCancelledAt(Object cancelledAt) {
		this.cancelledAt = cancelledAt;
		return this;
	}

	@JsonProperty("cancel_reason")
	public Object getCancelReason() {
		return cancelReason;
	}

	@JsonProperty("cancel_reason")
	public void setCancelReason(Object cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Order withCancelReason(Object cancelReason) {
		this.cancelReason = cancelReason;
		return this;
	}

	@JsonProperty("total_price_usd")
	public String getTotalPriceUsd() {
		return totalPriceUsd;
	}

	@JsonProperty("total_price_usd")
	public void setTotalPriceUsd(String totalPriceUsd) {
		this.totalPriceUsd = totalPriceUsd;
	}

	public Order withTotalPriceUsd(String totalPriceUsd) {
		this.totalPriceUsd = totalPriceUsd;
		return this;
	}

	@JsonProperty("checkout_token")
	public String getCheckoutToken() {
		return checkoutToken;
	}

	@JsonProperty("checkout_token")
	public void setCheckoutToken(String checkoutToken) {
		this.checkoutToken = checkoutToken;
	}

	public Order withCheckoutToken(String checkoutToken) {
		this.checkoutToken = checkoutToken;
		return this;
	}

	@JsonProperty("reference")
	public String getReference() {
		return reference;
	}

	@JsonProperty("reference")
	public void setReference(String reference) {
		this.reference = reference;
	}

	public Order withReference(String reference) {
		this.reference = reference;
		return this;
	}

	@JsonProperty("user_id")
	public Object getUserId() {
		return userId;
	}

	@JsonProperty("user_id")
	public void setUserId(Object userId) {
		this.userId = userId;
	}

	public Order withUserId(Object userId) {
		this.userId = userId;
		return this;
	}

	@JsonProperty("location_id")
	public Object getLocationId() {
		return locationId;
	}

	@JsonProperty("location_id")
	public void setLocationId(Object locationId) {
		this.locationId = locationId;
	}

	public Order withLocationId(Object locationId) {
		this.locationId = locationId;
		return this;
	}

	@JsonProperty("source_identifier")
	public String getSourceIdentifier() {
		return sourceIdentifier;
	}

	@JsonProperty("source_identifier")
	public void setSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
	}

	public Order withSourceIdentifier(String sourceIdentifier) {
		this.sourceIdentifier = sourceIdentifier;
		return this;
	}

	@JsonProperty("source_url")
	public Object getSourceUrl() {
		return sourceUrl;
	}

	@JsonProperty("source_url")
	public void setSourceUrl(Object sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public Order withSourceUrl(Object sourceUrl) {
		this.sourceUrl = sourceUrl;
		return this;
	}

	@JsonProperty("processed_at")
	public String getProcessedAt() {
		return processedAt;
	}

	@JsonProperty("processed_at")
	public void setProcessedAt(String processedAt) {
		this.processedAt = processedAt;
	}

	public Order withProcessedAt(String processedAt) {
		this.processedAt = processedAt;
		return this;
	}

	@JsonProperty("device_id")
	public Object getDeviceId() {
		return deviceId;
	}

	@JsonProperty("device_id")
	public void setDeviceId(Object deviceId) {
		this.deviceId = deviceId;
	}

	public Order withDeviceId(Object deviceId) {
		this.deviceId = deviceId;
		return this;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Order withPhone(String phone) {
		this.phone = phone;
		return this;
	}

	@JsonProperty("customer_locale")
	public Object getCustomerLocale() {
		return customerLocale;
	}

	@JsonProperty("customer_locale")
	public void setCustomerLocale(Object customerLocale) {
		this.customerLocale = customerLocale;
	}

	public Order withCustomerLocale(Object customerLocale) {
		this.customerLocale = customerLocale;
		return this;
	}

	@JsonProperty("app_id")
	public Object getAppId() {
		return appId;
	}

	@JsonProperty("app_id")
	public void setAppId(Object appId) {
		this.appId = appId;
	}

	public Order withAppId(Object appId) {
		this.appId = appId;
		return this;
	}

	@JsonProperty("browser_ip")
	public String getBrowserIp() {
		return browserIp;
	}

	@JsonProperty("browser_ip")
	public void setBrowserIp(String browserIp) {
		this.browserIp = browserIp;
	}

	public Order withBrowserIp(String browserIp) {
		this.browserIp = browserIp;
		return this;
	}

	@JsonProperty("landing_site_ref")
	public String getLandingSiteRef() {
		return landingSiteRef;
	}

	@JsonProperty("landing_site_ref")
	public void setLandingSiteRef(String landingSiteRef) {
		this.landingSiteRef = landingSiteRef;
	}

	public Order withLandingSiteRef(String landingSiteRef) {
		this.landingSiteRef = landingSiteRef;
		return this;
	}

	@JsonProperty("order_number")
	public long getOrderNumber() {
		return orderNumber;
	}

	@JsonProperty("order_number")
	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Order withOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
		return this;
	}

	@JsonProperty("discount_applications")
	public List<DiscountApplication> getDiscountApplications() {
		return discountApplications;
	}

	@JsonProperty("discount_applications")
	public void setDiscountApplications(List<DiscountApplication> discountApplications) {
		this.discountApplications = discountApplications;
	}

	public Order withDiscountApplications(List<DiscountApplication> discountApplications) {
		this.discountApplications = discountApplications;
		return this;
	}

	@JsonProperty("discount_codes")
	public List<DiscountCode> getDiscountCodes() {
		return discountCodes;
	}

	@JsonProperty("discount_codes")
	public void setDiscountCodes(List<DiscountCode> discountCodes) {
		this.discountCodes = discountCodes;
	}

	public Order withDiscountCodes(List<DiscountCode> discountCodes) {
		this.discountCodes = discountCodes;
		return this;
	}

	@JsonProperty("note_attributes")
	public List<NoteAttribute> getNoteAttributes() {
		return noteAttributes;
	}

	@JsonProperty("note_attributes")
	public void setNoteAttributes(List<NoteAttribute> noteAttributes) {
		this.noteAttributes = noteAttributes;
	}

	public Order withNoteAttributes(List<NoteAttribute> noteAttributes) {
		this.noteAttributes = noteAttributes;
		return this;
	}

	@JsonProperty("payment_gateway_names")
	public List<String> getPaymentGatewayNames() {
		return paymentGatewayNames;
	}

	@JsonProperty("payment_gateway_names")
	public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
		this.paymentGatewayNames = paymentGatewayNames;
	}

	public Order withPaymentGatewayNames(List<String> paymentGatewayNames) {
		this.paymentGatewayNames = paymentGatewayNames;
		return this;
	}

	@JsonProperty("processing_method")
	public String getProcessingMethod() {
		return processingMethod;
	}

	@JsonProperty("processing_method")
	public void setProcessingMethod(String processingMethod) {
		this.processingMethod = processingMethod;
	}

	public Order withProcessingMethod(String processingMethod) {
		this.processingMethod = processingMethod;
		return this;
	}

	@JsonProperty("checkout_id")
	public long getCheckoutId() {
		return checkoutId;
	}

	@JsonProperty("checkout_id")
	public void setCheckoutId(long checkoutId) {
		this.checkoutId = checkoutId;
	}

	public Order withCheckoutId(long checkoutId) {
		this.checkoutId = checkoutId;
		return this;
	}

	@JsonProperty("source_name")
	public String getSourceName() {
		return sourceName;
	}

	@JsonProperty("source_name")
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public Order withSourceName(String sourceName) {
		this.sourceName = sourceName;
		return this;
	}

	@JsonProperty("fulfillment_status")
	public Object getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	@JsonProperty("fulfillment_status")
	public void setFulfillmentStatus(Object fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public Order withFulfillmentStatus(Object fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
		return this;
	}

	@JsonProperty("tax_lines")
	public List<TaxLine> getTaxLines() {
		return taxLines;
	}

	@JsonProperty("tax_lines")
	public void setTaxLines(List<TaxLine> taxLines) {
		this.taxLines = taxLines;
	}

	public Order withTaxLines(List<TaxLine> taxLines) {
		this.taxLines = taxLines;
		return this;
	}

	@JsonProperty("tags")
	public String getTags() {
		return tags;
	}

	@JsonProperty("tags")
	public void setTags(String tags) {
		this.tags = tags;
	}

	public Order withTags(String tags) {
		this.tags = tags;
		return this;
	}

	@JsonProperty("contact_email")
	public String getContactEmail() {
		return contactEmail;
	}

	@JsonProperty("contact_email")
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Order withContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
		return this;
	}

	@JsonProperty("order_status_url")
	public String getOrderStatusUrl() {
		return orderStatusUrl;
	}

	@JsonProperty("order_status_url")
	public void setOrderStatusUrl(String orderStatusUrl) {
		this.orderStatusUrl = orderStatusUrl;
	}

	public Order withOrderStatusUrl(String orderStatusUrl) {
		this.orderStatusUrl = orderStatusUrl;
		return this;
	}

	@JsonProperty("presentment_currency")
	public String getPresentmentCurrency() {
		return presentmentCurrency;
	}

	@JsonProperty("presentment_currency")
	public void setPresentmentCurrency(String presentmentCurrency) {
		this.presentmentCurrency = presentmentCurrency;
	}

	public Order withPresentmentCurrency(String presentmentCurrency) {
		this.presentmentCurrency = presentmentCurrency;
		return this;
	}

	@JsonProperty("total_line_items_price_set")
	public TotalLineItemsPriceSet getTotalLineItemsPriceSet() {
		return totalLineItemsPriceSet;
	}

	@JsonProperty("total_line_items_price_set")
	public void setTotalLineItemsPriceSet(TotalLineItemsPriceSet totalLineItemsPriceSet) {
		this.totalLineItemsPriceSet = totalLineItemsPriceSet;
	}

	public Order withTotalLineItemsPriceSet(TotalLineItemsPriceSet totalLineItemsPriceSet) {
		this.totalLineItemsPriceSet = totalLineItemsPriceSet;
		return this;
	}

	@JsonProperty("total_discounts_set")
	public TotalDiscountsSet getTotalDiscountsSet() {
		return totalDiscountsSet;
	}

	@JsonProperty("total_discounts_set")
	public void setTotalDiscountsSet(TotalDiscountsSet totalDiscountsSet) {
		this.totalDiscountsSet = totalDiscountsSet;
	}

	public Order withTotalDiscountsSet(TotalDiscountsSet totalDiscountsSet) {
		this.totalDiscountsSet = totalDiscountsSet;
		return this;
	}

	@JsonProperty("total_shipping_price_set")
	public TotalShippingPriceSet getTotalShippingPriceSet() {
		return totalShippingPriceSet;
	}

	@JsonProperty("total_shipping_price_set")
	public void setTotalShippingPriceSet(TotalShippingPriceSet totalShippingPriceSet) {
		this.totalShippingPriceSet = totalShippingPriceSet;
	}

	public Order withTotalShippingPriceSet(TotalShippingPriceSet totalShippingPriceSet) {
		this.totalShippingPriceSet = totalShippingPriceSet;
		return this;
	}

	@JsonProperty("subtotal_price_set")
	public SubtotalPriceSet getSubtotalPriceSet() {
		return subtotalPriceSet;
	}

	@JsonProperty("subtotal_price_set")
	public void setSubtotalPriceSet(SubtotalPriceSet subtotalPriceSet) {
		this.subtotalPriceSet = subtotalPriceSet;
	}

	public Order withSubtotalPriceSet(SubtotalPriceSet subtotalPriceSet) {
		this.subtotalPriceSet = subtotalPriceSet;
		return this;
	}

	@JsonProperty("total_price_set")
	public TotalPriceSet getTotalPriceSet() {
		return totalPriceSet;
	}

	@JsonProperty("total_price_set")
	public void setTotalPriceSet(TotalPriceSet totalPriceSet) {
		this.totalPriceSet = totalPriceSet;
	}

	public Order withTotalPriceSet(TotalPriceSet totalPriceSet) {
		this.totalPriceSet = totalPriceSet;
		return this;
	}

	@JsonProperty("total_tax_set")
	public TotalTaxSet getTotalTaxSet() {
		return totalTaxSet;
	}

	@JsonProperty("total_tax_set")
	public void setTotalTaxSet(TotalTaxSet totalTaxSet) {
		this.totalTaxSet = totalTaxSet;
	}

	public Order withTotalTaxSet(TotalTaxSet totalTaxSet) {
		this.totalTaxSet = totalTaxSet;
		return this;
	}

	@JsonProperty("admin_graphql_api_id")
	public String getAdminGraphqlApiId() {
		return adminGraphqlApiId;
	}

	@JsonProperty("admin_graphql_api_id")
	public void setAdminGraphqlApiId(String adminGraphqlApiId) {
		this.adminGraphqlApiId = adminGraphqlApiId;
	}

	public Order withAdminGraphqlApiId(String adminGraphqlApiId) {
		this.adminGraphqlApiId = adminGraphqlApiId;
		return this;
	}

	@JsonProperty("line_items")
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	@JsonProperty("line_items")
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Order withLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
		return this;
	}

	@JsonProperty("shipping_lines")
	public List<ShippingLine> getShippingLines() {
		return shippingLines;
	}

	@JsonProperty("shipping_lines")
	public void setShippingLines(List<ShippingLine> shippingLines) {
		this.shippingLines = shippingLines;
	}

	public Order withShippingLines(List<ShippingLine> shippingLines) {
		this.shippingLines = shippingLines;
		return this;
	}

	@JsonProperty("billing_address")
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	@JsonProperty("billing_address")
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Order withBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
		return this;
	}

	@JsonProperty("shipping_address")
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	@JsonProperty("shipping_address")
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Order withShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
		return this;
	}

	@JsonProperty("fulfillments")
	public List<Fulfillment> getFulfillments() {
		return fulfillments;
	}

	@JsonProperty("fulfillments")
	public void setFulfillments(List<Fulfillment> fulfillments) {
		this.fulfillments = fulfillments;
	}

	public Order withFulfillments(List<Fulfillment> fulfillments) {
		this.fulfillments = fulfillments;
		return this;
	}

	@JsonProperty("client_details")
	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	@JsonProperty("client_details")
	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
	}

	public Order withClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
		return this;
	}

	@JsonProperty("refunds")
	public List<Refund> getRefunds() {
		return refunds;
	}

	@JsonProperty("refunds")
	public void setRefunds(List<Refund> refunds) {
		this.refunds = refunds;
	}

	public Order withRefunds(List<Refund> refunds) {
		this.refunds = refunds;
		return this;
	}

	@JsonProperty("payment_details")
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	@JsonProperty("payment_details")
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public Order withPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
		return this;
	}

	@JsonProperty("customer")
	public Customer getCustomer() {
		return customer;
	}

	@JsonProperty("customer")
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Order withCustomer(Customer customer) {
		this.customer = customer;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public Order withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("email", email).append("closedAt", closedAt)
				.append("createdAt", createdAt).append("updatedAt", updatedAt).append("number", number)
				.append("note", note).append("token", token).append("gateway", gateway).append("test", test)
				.append("totalPrice", totalPrice).append("subtotalPrice", subtotalPrice)
				.append("totalWeight", totalWeight).append("totalTax", totalTax).append("taxesIncluded", taxesIncluded)
				.append("currency", currency).append("financialStatus", financialStatus).append("confirmed", confirmed)
				.append("totalDiscounts", totalDiscounts).append("totalLineItemsPrice", totalLineItemsPrice)
				.append("cartToken", cartToken).append("buyerAcceptsMarketing", buyerAcceptsMarketing)
				.append("name", name).append("referringSite", referringSite).append("landingSite", landingSite)
				.append("cancelledAt", cancelledAt).append("cancelReason", cancelReason)
				.append("totalPriceUsd", totalPriceUsd).append("checkoutToken", checkoutToken)
				.append("reference", reference).append("userId", userId).append("locationId", locationId)
				.append("sourceIdentifier", sourceIdentifier).append("sourceUrl", sourceUrl)
				.append("processedAt", processedAt).append("deviceId", deviceId).append("phone", phone)
				.append("customerLocale", customerLocale).append("appId", appId).append("browserIp", browserIp)
				.append("landingSiteRef", landingSiteRef).append("orderNumber", orderNumber)
				.append("discountApplications", discountApplications).append("discountCodes", discountCodes)
				.append("noteAttributes", noteAttributes).append("paymentGatewayNames", paymentGatewayNames)
				.append("processingMethod", processingMethod).append("checkoutId", checkoutId)
				.append("sourceName", sourceName).append("fulfillmentStatus", fulfillmentStatus)
				.append("taxLines", taxLines).append("tags", tags).append("contactEmail", contactEmail)
				.append("orderStatusUrl", orderStatusUrl).append("presentmentCurrency", presentmentCurrency)
				.append("totalLineItemsPriceSet", totalLineItemsPriceSet).append("totalDiscountsSet", totalDiscountsSet)
				.append("totalShippingPriceSet", totalShippingPriceSet).append("subtotalPriceSet", subtotalPriceSet)
				.append("totalPriceSet", totalPriceSet).append("totalTaxSet", totalTaxSet)
				.append("adminGraphqlApiId", adminGraphqlApiId).append("lineItems", lineItems)
				.append("shippingLines", shippingLines).append("billingAddress", billingAddress)
				.append("shippingAddress", shippingAddress).append("fulfillments", fulfillments)
				.append("clientDetails", clientDetails).append("refunds", refunds)
				.append("paymentDetails", paymentDetails).append("customer", customer)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(phone).append(gateway).append(test).append(subtotalPrice)
				.append(totalPriceSet).append(customer).append(totalShippingPriceSet).append(cancelReason)
				.append(totalTaxSet).append(subtotalPriceSet).append(browserIp).append(confirmed).append(userId)
				.append(totalPriceUsd).append(discountApplications).append(cartToken).append(checkoutId)
				.append(presentmentCurrency).append(deviceId).append(processedAt).append(number)
				.append(totalLineItemsPrice).append(email).append(additionalProperties).append(noteAttributes)
				.append(buyerAcceptsMarketing).append(refunds).append(appId).append(closedAt).append(taxLines)
				.append(locationId).append(checkoutToken).append(landingSite).append(paymentDetails).append(sourceUrl)
				.append(taxesIncluded).append(currency).append(id).append(referringSite).append(totalDiscounts)
				.append(token).append(sourceName).append(createdAt).append(name).append(financialStatus)
				.append(shippingAddress).append(lineItems).append(fulfillmentStatus).append(note).append(totalPrice)
				.append(tags).append(fulfillments).append(contactEmail).append(cancelledAt).append(adminGraphqlApiId)
				.append(processingMethod).append(shippingLines).append(sourceIdentifier).append(discountCodes)
				.append(landingSiteRef).append(reference).append(updatedAt).append(totalDiscountsSet)
				.append(orderStatusUrl).append(customerLocale).append(orderNumber).append(totalWeight)
				.append(paymentGatewayNames).append(billingAddress).append(totalLineItemsPriceSet).append(totalTax)
				.append(clientDetails).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Order) == false) {
			return false;
		}
		Order rhs = ((Order) other);
		return new EqualsBuilder().append(phone, rhs.phone).append(gateway, rhs.gateway).append(test, rhs.test)
				.append(subtotalPrice, rhs.subtotalPrice).append(totalPriceSet, rhs.totalPriceSet)
				.append(customer, rhs.customer).append(totalShippingPriceSet, rhs.totalShippingPriceSet)
				.append(cancelReason, rhs.cancelReason).append(totalTaxSet, rhs.totalTaxSet)
				.append(subtotalPriceSet, rhs.subtotalPriceSet).append(browserIp, rhs.browserIp)
				.append(confirmed, rhs.confirmed).append(userId, rhs.userId).append(totalPriceUsd, rhs.totalPriceUsd)
				.append(discountApplications, rhs.discountApplications).append(cartToken, rhs.cartToken)
				.append(checkoutId, rhs.checkoutId).append(presentmentCurrency, rhs.presentmentCurrency)
				.append(deviceId, rhs.deviceId).append(processedAt, rhs.processedAt).append(number, rhs.number)
				.append(totalLineItemsPrice, rhs.totalLineItemsPrice).append(email, rhs.email)
				.append(additionalProperties, rhs.additionalProperties).append(noteAttributes, rhs.noteAttributes)
				.append(buyerAcceptsMarketing, rhs.buyerAcceptsMarketing).append(refunds, rhs.refunds)
				.append(appId, rhs.appId).append(closedAt, rhs.closedAt).append(taxLines, rhs.taxLines)
				.append(locationId, rhs.locationId).append(checkoutToken, rhs.checkoutToken)
				.append(landingSite, rhs.landingSite).append(paymentDetails, rhs.paymentDetails)
				.append(sourceUrl, rhs.sourceUrl).append(taxesIncluded, rhs.taxesIncluded)
				.append(currency, rhs.currency).append(id, rhs.id).append(referringSite, rhs.referringSite)
				.append(totalDiscounts, rhs.totalDiscounts).append(token, rhs.token).append(sourceName, rhs.sourceName)
				.append(createdAt, rhs.createdAt).append(name, rhs.name).append(financialStatus, rhs.financialStatus)
				.append(shippingAddress, rhs.shippingAddress).append(lineItems, rhs.lineItems)
				.append(fulfillmentStatus, rhs.fulfillmentStatus).append(note, rhs.note)
				.append(totalPrice, rhs.totalPrice).append(tags, rhs.tags).append(fulfillments, rhs.fulfillments)
				.append(contactEmail, rhs.contactEmail).append(cancelledAt, rhs.cancelledAt)
				.append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(processingMethod, rhs.processingMethod)
				.append(shippingLines, rhs.shippingLines).append(sourceIdentifier, rhs.sourceIdentifier)
				.append(discountCodes, rhs.discountCodes).append(landingSiteRef, rhs.landingSiteRef)
				.append(reference, rhs.reference).append(updatedAt, rhs.updatedAt)
				.append(totalDiscountsSet, rhs.totalDiscountsSet).append(orderStatusUrl, rhs.orderStatusUrl)
				.append(customerLocale, rhs.customerLocale).append(orderNumber, rhs.orderNumber)
				.append(totalWeight, rhs.totalWeight).append(paymentGatewayNames, rhs.paymentGatewayNames)
				.append(billingAddress, rhs.billingAddress).append(totalLineItemsPriceSet, rhs.totalLineItemsPriceSet)
				.append(totalTax, rhs.totalTax).append(clientDetails, rhs.clientDetails).isEquals();
	}

}
