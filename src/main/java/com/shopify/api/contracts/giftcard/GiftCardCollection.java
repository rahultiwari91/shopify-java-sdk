/**
 * @author Rahul Tiwari
 * @version 1.0.0
 * @package com.ignitiv.model
 * @since Aug 27, 2019
 * 
 */

package com.shopify.api.contracts.giftcard;

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
@JsonPropertyOrder({ "gift_cards" })
public class GiftCardCollection implements Serializable {

	@JsonProperty("gift_cards")
	private List<GiftCard> giftCards = new ArrayList<GiftCard>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 7450990066936511269L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public GiftCardCollection() {
	}

	/**
	 * 
	 * @param giftCards
	 */
	public GiftCardCollection(List<GiftCard> giftCards) {
		super();
		this.giftCards = giftCards;
	}

	@JsonProperty("gift_cards")
	public List<GiftCard> getGiftCards() {
		return giftCards;
	}

	@JsonProperty("gift_cards")
	public void setGiftCards(List<GiftCard> giftCards) {
		this.giftCards = giftCards;
	}

	public GiftCardCollection withGiftCards(List<GiftCard> giftCards) {
		this.giftCards = giftCards;
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

	public GiftCardCollection withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("giftCards", giftCards)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(giftCards).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof GiftCardCollection) == false) {
			return false;
		}
		GiftCardCollection rhs = ((GiftCardCollection) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties)
				.append(giftCards, rhs.giftCards).isEquals();
	}

}
