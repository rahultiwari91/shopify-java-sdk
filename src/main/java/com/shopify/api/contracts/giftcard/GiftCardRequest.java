package com.shopify.api.contracts.giftcard;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * @author Rahul Tiwari, Created on Sep 6, 2019 - 12:14:04 PM
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "gift_card" })
public class GiftCardRequest implements Serializable {

	@JsonProperty("gift_card")
	private GiftCard giftCard;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 1529380300330837681L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public GiftCardRequest() {
	}

	/**
	 * 
	 * @param giftCard
	 */
	public GiftCardRequest(GiftCard giftCard) {
		super();
		this.giftCard = giftCard;
	}

	@JsonProperty("gift_card")
	public GiftCard getGiftCard() {
		return giftCard;
	}

	@JsonProperty("gift_card")
	public void setGiftCard(GiftCard giftCard) {
		this.giftCard = giftCard;
	}

	public GiftCardRequest withGiftCard(GiftCard giftCard) {
		this.giftCard = giftCard;
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

	public GiftCardRequest withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("giftCard", giftCard)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(giftCard).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof GiftCardRequest) == false) {
			return false;
		}
		GiftCardRequest rhs = ((GiftCardRequest) other);
		return new EqualsBuilder().append(giftCard, rhs.giftCard).append(additionalProperties, rhs.additionalProperties)
				.isEquals();
	}

}
