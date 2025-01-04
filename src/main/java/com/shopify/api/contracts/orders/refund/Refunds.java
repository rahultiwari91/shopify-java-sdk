package com.shopify.api.contracts.orders.refund;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 5:35:57 PM
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "refunds" })
public class Refunds implements Serializable {

	@JsonProperty("refunds")
	private List<Refund> refunds = new ArrayList<Refund>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2382453684132637024L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Refunds() {
	}

	/**
	 * 
	 * @param refunds
	 */
	public Refunds(List<Refund> refunds) {
		super();
		this.refunds = refunds;
	}

	@JsonProperty("refunds")
	public List<Refund> getRefunds() {
		return refunds;
	}

	@JsonProperty("refunds")
	public void setRefunds(List<Refund> refunds) {
		this.refunds = refunds;
	}

	public Refunds withRefunds(List<Refund> refunds) {
		this.refunds = refunds;
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

	public Refunds withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("refunds", refunds).append("additionalProperties", additionalProperties)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(refunds).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Refunds) == false) {
			return false;
		}
		Refunds rhs = ((Refunds) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(refunds, rhs.refunds)
				.isEquals();
	}

}
