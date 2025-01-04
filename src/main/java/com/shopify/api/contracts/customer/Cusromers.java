package com.shopify.api.contracts.customer;

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

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 5:39:14 PM
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "customers" })
public class Cusromers implements Serializable {

	@JsonProperty("customers")
	private List<Object> customers = new ArrayList<Object>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2936034983478558097L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Cusromers() {
	}

	/**
	 * 
	 * @param customers
	 */
	public Cusromers(List<Object> customers) {
		super();
		this.customers = customers;
	}

	@JsonProperty("customers")
	public List<Object> getCustomers() {
		return customers;
	}

	@JsonProperty("customers")
	public void setCustomers(List<Object> customers) {
		this.customers = customers;
	}

	public Cusromers withCustomers(List<Object> customers) {
		this.customers = customers;
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

	public Cusromers withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("customers", customers)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).append(customers).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Cusromers) == false) {
			return false;
		}
		Cusromers rhs = ((Cusromers) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties)
				.append(customers, rhs.customers).isEquals();
	}

}