package com.shopify.api.contracts.order;

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
 * @author Rahul Tiwari, Created on Sep 6, 2019 - 12:14:26 PM
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "order" })
public class OrderResponse implements Serializable {

	@JsonProperty("order")
	private Order order;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 1L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public OrderResponse() {
	}

	/**
	 * 
	 * @param order
	 */
	public OrderResponse(Order order) {
		super();
		this.order = order;
	}

	@JsonProperty("order")
	public Order getOrder() {
		return order;
	}

	@JsonProperty("order")
	public void setOrder(Order order) {
		this.order = order;
	}

	public OrderResponse withOrder(Order order) {
		this.order = order;
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

	public OrderResponse withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("order", order)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(order).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof OrderResponse) == false) {
			return false;
		}
		OrderResponse rhs = ((OrderResponse) other);
		return new EqualsBuilder().append(order, rhs.order)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}
}
