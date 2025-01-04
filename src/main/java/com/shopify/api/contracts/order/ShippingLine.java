
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
@JsonPropertyOrder({ "id", "title", "price", "code", "source", "phone", "requested_fulfillment_service_id",
		"delivery_category", "carrier_identifier", "discounted_price", "price_set", "discounted_price_set",
		"discount_allocations", "tax_lines" })
public class ShippingLine implements Serializable {

	@JsonProperty("id")
	private long id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("price")
	private String price;
	@JsonProperty("code")
	private String code;
	@JsonProperty("source")
	private String source;
	@JsonProperty("phone")
	private Object phone;
	@JsonProperty("requested_fulfillment_service_id")
	private Object requestedFulfillmentServiceId;
	@JsonProperty("delivery_category")
	private Object deliveryCategory;
	@JsonProperty("carrier_identifier")
	private Object carrierIdentifier;
	@JsonProperty("discounted_price")
	private String discountedPrice;
	@JsonProperty("price_set")
	private PriceSet priceSet;
	@JsonProperty("discounted_price_set")
	private DiscountedPriceSet discountedPriceSet;
	@JsonProperty("discount_allocations")
	private List<Object> discountAllocations = new ArrayList<Object>();
	@JsonProperty("tax_lines")
	private List<Object> taxLines = new ArrayList<Object>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8794695353560191984L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public ShippingLine() {
	}

	/**
	 * 
	 * @param discountedPrice
	 * @param phone
	 * @param deliveryCategory
	 * @param taxLines
	 * @param discountedPriceSet
	 * @param code
	 * @param requestedFulfillmentServiceId
	 * @param id
	 * @param carrierIdentifier
	 * @param title
	 * @param discountAllocations
	 * @param price
	 * @param source
	 * @param priceSet
	 */
	public ShippingLine(long id, String title, String price, String code, String source, Object phone,
			Object requestedFulfillmentServiceId, Object deliveryCategory, Object carrierIdentifier,
			String discountedPrice, PriceSet priceSet, DiscountedPriceSet discountedPriceSet,
			List<Object> discountAllocations, List<Object> taxLines) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.code = code;
		this.source = source;
		this.phone = phone;
		this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
		this.deliveryCategory = deliveryCategory;
		this.carrierIdentifier = carrierIdentifier;
		this.discountedPrice = discountedPrice;
		this.priceSet = priceSet;
		this.discountedPriceSet = discountedPriceSet;
		this.discountAllocations = discountAllocations;
		this.taxLines = taxLines;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	public ShippingLine withId(long id) {
		this.id = id;
		return this;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	public ShippingLine withTitle(String title) {
		this.title = title;
		return this;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	public ShippingLine withPrice(String price) {
		this.price = price;
		return this;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	public ShippingLine withCode(String code) {
		this.code = code;
		return this;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonProperty("source")
	public void setSource(String source) {
		this.source = source;
	}

	public ShippingLine withSource(String source) {
		this.source = source;
		return this;
	}

	@JsonProperty("phone")
	public Object getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(Object phone) {
		this.phone = phone;
	}

	public ShippingLine withPhone(Object phone) {
		this.phone = phone;
		return this;
	}

	@JsonProperty("requested_fulfillment_service_id")
	public Object getRequestedFulfillmentServiceId() {
		return requestedFulfillmentServiceId;
	}

	@JsonProperty("requested_fulfillment_service_id")
	public void setRequestedFulfillmentServiceId(Object requestedFulfillmentServiceId) {
		this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
	}

	public ShippingLine withRequestedFulfillmentServiceId(Object requestedFulfillmentServiceId) {
		this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
		return this;
	}

	@JsonProperty("delivery_category")
	public Object getDeliveryCategory() {
		return deliveryCategory;
	}

	@JsonProperty("delivery_category")
	public void setDeliveryCategory(Object deliveryCategory) {
		this.deliveryCategory = deliveryCategory;
	}

	public ShippingLine withDeliveryCategory(Object deliveryCategory) {
		this.deliveryCategory = deliveryCategory;
		return this;
	}

	@JsonProperty("carrier_identifier")
	public Object getCarrierIdentifier() {
		return carrierIdentifier;
	}

	@JsonProperty("carrier_identifier")
	public void setCarrierIdentifier(Object carrierIdentifier) {
		this.carrierIdentifier = carrierIdentifier;
	}

	public ShippingLine withCarrierIdentifier(Object carrierIdentifier) {
		this.carrierIdentifier = carrierIdentifier;
		return this;
	}

	@JsonProperty("discounted_price")
	public String getDiscountedPrice() {
		return discountedPrice;
	}

	@JsonProperty("discounted_price")
	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public ShippingLine withDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
		return this;
	}

	@JsonProperty("price_set")
	public PriceSet getPriceSet() {
		return priceSet;
	}

	@JsonProperty("price_set")
	public void setPriceSet(PriceSet priceSet) {
		this.priceSet = priceSet;
	}

	public ShippingLine withPriceSet(PriceSet priceSet) {
		this.priceSet = priceSet;
		return this;
	}

	@JsonProperty("discounted_price_set")
	public DiscountedPriceSet getDiscountedPriceSet() {
		return discountedPriceSet;
	}

	@JsonProperty("discounted_price_set")
	public void setDiscountedPriceSet(DiscountedPriceSet discountedPriceSet) {
		this.discountedPriceSet = discountedPriceSet;
	}

	public ShippingLine withDiscountedPriceSet(DiscountedPriceSet discountedPriceSet) {
		this.discountedPriceSet = discountedPriceSet;
		return this;
	}

	@JsonProperty("discount_allocations")
	public List<Object> getDiscountAllocations() {
		return discountAllocations;
	}

	@JsonProperty("discount_allocations")
	public void setDiscountAllocations(List<Object> discountAllocations) {
		this.discountAllocations = discountAllocations;
	}

	public ShippingLine withDiscountAllocations(List<Object> discountAllocations) {
		this.discountAllocations = discountAllocations;
		return this;
	}

	@JsonProperty("tax_lines")
	public List<Object> getTaxLines() {
		return taxLines;
	}

	@JsonProperty("tax_lines")
	public void setTaxLines(List<Object> taxLines) {
		this.taxLines = taxLines;
	}

	public ShippingLine withTaxLines(List<Object> taxLines) {
		this.taxLines = taxLines;
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

	public ShippingLine withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("title", title).append("price", price)
				.append("code", code).append("source", source).append("phone", phone)
				.append("requestedFulfillmentServiceId", requestedFulfillmentServiceId)
				.append("deliveryCategory", deliveryCategory).append("carrierIdentifier", carrierIdentifier)
				.append("discountedPrice", discountedPrice).append("priceSet", priceSet)
				.append("discountedPriceSet", discountedPriceSet).append("discountAllocations", discountAllocations)
				.append("taxLines", taxLines).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(discountedPrice).append(deliveryCategory).append(phone).append(taxLines)
				.append(discountedPriceSet).append(code).append(requestedFulfillmentServiceId).append(carrierIdentifier)
				.append(id).append(title).append(discountAllocations).append(price).append(source)
				.append(additionalProperties).append(priceSet).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ShippingLine) == false) {
			return false;
		}
		ShippingLine rhs = ((ShippingLine) other);
		return new EqualsBuilder().append(discountedPrice, rhs.discountedPrice)
				.append(deliveryCategory, rhs.deliveryCategory).append(phone, rhs.phone).append(taxLines, rhs.taxLines)
				.append(discountedPriceSet, rhs.discountedPriceSet).append(code, rhs.code)
				.append(requestedFulfillmentServiceId, rhs.requestedFulfillmentServiceId)
				.append(carrierIdentifier, rhs.carrierIdentifier).append(id, rhs.id).append(title, rhs.title)
				.append(discountAllocations, rhs.discountAllocations).append(price, rhs.price)
				.append(source, rhs.source).append(additionalProperties, rhs.additionalProperties)
				.append(priceSet, rhs.priceSet).isEquals();
	}

}
