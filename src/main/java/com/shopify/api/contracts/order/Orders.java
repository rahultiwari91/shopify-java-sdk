package com.shopify.api.contracts.order;

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 5:33:16 PM
 *
 */

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
@JsonPropertyOrder({ "orders" })
public class Orders implements Serializable {

	@JsonProperty("orders")
	private List<Order> orders = new ArrayList<Order>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 53611750401898573L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Orders() {
	}

	/**
	 * 
	 * @param orders
	 */
	public Orders(List<Order> orders) {
		super();
		this.orders = orders;
	}

	@JsonProperty("orders")
	public List<Order> getOrders() {
		return orders;
	}

	@JsonProperty("orders")
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Orders withOrders(List<Order> orders) {
		this.orders = orders;
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

	public Orders withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("orders", orders).append("additionalProperties", additionalProperties)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(orders).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Orders) == false) {
			return false;
		}
		Orders rhs = ((Orders) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(orders, rhs.orders)
				.isEquals();
	}

}