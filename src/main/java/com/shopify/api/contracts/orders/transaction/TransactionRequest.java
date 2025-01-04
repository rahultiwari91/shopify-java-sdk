package com.shopify.api.contracts.orders.transaction;

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
 * @author Rahul Tiwari, Created on Sep 15, 2019 - 12:14:04 PM
 *
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "transaction" })
public class TransactionRequest implements Serializable {

	@JsonProperty("transaction")
	private Transaction transaction;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -1943785335405507639L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public TransactionRequest() {
	}

	/**
	 * 
	 * @param transaction
	 */
	public TransactionRequest(Transaction transaction) {
		super();
		this.transaction = transaction;
	}

	@JsonProperty("transaction")
	public Transaction getTransaction() {
		return transaction;
	}

	@JsonProperty("transaction")
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public TransactionRequest withTransaction(Transaction transaction) {
		this.transaction = transaction;
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

	public TransactionRequest withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("transaction", transaction)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(transaction).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof TransactionRequest) == false) {
			return false;
		}
		TransactionRequest rhs = ((TransactionRequest) other);
		return new EqualsBuilder().append(transaction, rhs.transaction)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}
