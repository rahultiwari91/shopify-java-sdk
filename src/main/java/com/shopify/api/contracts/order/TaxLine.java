package com.shopify.api.contracts.order;

import java.io.Serializable;
import java.util.HashMap;
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
@JsonPropertyOrder({ "price", "rate", "title", "price_set" })
public class TaxLine implements Serializable {

	@JsonProperty("price")
	private String price;
	@JsonProperty("rate")
	private double rate;
	@JsonProperty("title")
	private String title;
	@JsonProperty("price_set")
	private PriceSet priceSet;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2500586347667723467L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public TaxLine() {
	}

	/**
	 * 
	 * @param title
	 * @param rate
	 * @param price
	 * @param priceSet
	 */
	public TaxLine(String price, double rate, String title, PriceSet priceSet) {
		super();
		this.price = price;
		this.rate = rate;
		this.title = title;
		this.priceSet = priceSet;
	}

	@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	public TaxLine withPrice(String price) {
		this.price = price;
		return this;
	}

	@JsonProperty("rate")
	public double getRate() {
		return rate;
	}

	@JsonProperty("rate")
	public void setRate(double rate) {
		this.rate = rate;
	}

	public TaxLine withRate(double rate) {
		this.rate = rate;
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

	public TaxLine withTitle(String title) {
		this.title = title;
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

	public TaxLine withPriceSet(PriceSet priceSet) {
		this.priceSet = priceSet;
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

	public TaxLine withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("price", price).append("rate", rate).append("title", title)
				.append("priceSet", priceSet).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(title).append(rate).append(price).append(additionalProperties)
				.append(priceSet).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TaxLine) == false) {
			return false;
		}
		TaxLine rhs = ((TaxLine) other);
		return new EqualsBuilder().append(title, rhs.title).append(rate, rhs.rate).append(price, rhs.price)
				.append(additionalProperties, rhs.additionalProperties).append(priceSet, rhs.priceSet).isEquals();
	}

}
