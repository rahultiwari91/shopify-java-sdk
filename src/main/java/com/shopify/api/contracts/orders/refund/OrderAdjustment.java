
package com.shopify.api.contracts.orders.refund;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "order_id", "refund_id", "amount", "tax_amount", "kind", "reason", "amount_set",
		"tax_amount_set" })
public class OrderAdjustment implements Serializable {

	@JsonProperty("id")
	private long id;
	@JsonProperty("order_id")
	private long orderId;
	@JsonProperty("refund_id")
	private long refundId;
	@JsonProperty("amount")
	private String amount;
	@JsonProperty("tax_amount")
	private String taxAmount;
	@JsonProperty("kind")
	private String kind;
	@JsonProperty("reason")
	private String reason;
	@JsonProperty("amount_set")
	private AmountSet amountSet;
	@JsonProperty("tax_amount_set")
	private TaxAmountSet taxAmountSet;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -7527990412134376874L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public OrderAdjustment() {
	}

	/**
	 * 
	 * @param taxAmountSet
	 * @param amount
	 * @param id
	 * @param taxAmount
	 * @param refundId
	 * @param amountSet
	 * @param reason
	 * @param kind
	 * @param orderId
	 */
	public OrderAdjustment(long id, long orderId, long refundId, String amount, String taxAmount, String kind,
			String reason, AmountSet amountSet, TaxAmountSet taxAmountSet) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.refundId = refundId;
		this.amount = amount;
		this.taxAmount = taxAmount;
		this.kind = kind;
		this.reason = reason;
		this.amountSet = amountSet;
		this.taxAmountSet = taxAmountSet;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	public OrderAdjustment withId(long id) {
		this.id = id;
		return this;
	}

	@JsonProperty("order_id")
	public long getOrderId() {
		return orderId;
	}

	@JsonProperty("order_id")
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public OrderAdjustment withOrderId(long orderId) {
		this.orderId = orderId;
		return this;
	}

	@JsonProperty("refund_id")
	public long getRefundId() {
		return refundId;
	}

	@JsonProperty("refund_id")
	public void setRefundId(long refundId) {
		this.refundId = refundId;
	}

	public OrderAdjustment withRefundId(long refundId) {
		this.refundId = refundId;
		return this;
	}

	@JsonProperty("amount")
	public String getAmount() {
		return amount;
	}

	@JsonProperty("amount")
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public OrderAdjustment withAmount(String amount) {
		this.amount = amount;
		return this;
	}

	@JsonProperty("tax_amount")
	public String getTaxAmount() {
		return taxAmount;
	}

	@JsonProperty("tax_amount")
	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public OrderAdjustment withTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
		return this;
	}

	@JsonProperty("kind")
	public String getKind() {
		return kind;
	}

	@JsonProperty("kind")
	public void setKind(String kind) {
		this.kind = kind;
	}

	public OrderAdjustment withKind(String kind) {
		this.kind = kind;
		return this;
	}

	@JsonProperty("reason")
	public String getReason() {
		return reason;
	}

	@JsonProperty("reason")
	public void setReason(String reason) {
		this.reason = reason;
	}

	public OrderAdjustment withReason(String reason) {
		this.reason = reason;
		return this;
	}

	@JsonProperty("amount_set")
	public AmountSet getAmountSet() {
		return amountSet;
	}

	@JsonProperty("amount_set")
	public void setAmountSet(AmountSet amountSet) {
		this.amountSet = amountSet;
	}

	public OrderAdjustment withAmountSet(AmountSet amountSet) {
		this.amountSet = amountSet;
		return this;
	}

	@JsonProperty("tax_amount_set")
	public TaxAmountSet getTaxAmountSet() {
		return taxAmountSet;
	}

	@JsonProperty("tax_amount_set")
	public void setTaxAmountSet(TaxAmountSet taxAmountSet) {
		this.taxAmountSet = taxAmountSet;
	}

	public OrderAdjustment withTaxAmountSet(TaxAmountSet taxAmountSet) {
		this.taxAmountSet = taxAmountSet;
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

	public OrderAdjustment withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("orderId", orderId).append("refundId", refundId)
				.append("amount", amount).append("taxAmount", taxAmount).append("kind", kind).append("reason", reason)
				.append("amountSet", amountSet).append("taxAmountSet", taxAmountSet)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(taxAmountSet).append(amount).append(id).append(taxAmount).append(refundId)
				.append(amountSet).append(reason).append(additionalProperties).append(kind).append(orderId)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof OrderAdjustment) == false) {
			return false;
		}
		OrderAdjustment rhs = ((OrderAdjustment) other);
		return new EqualsBuilder().append(taxAmountSet, rhs.taxAmountSet).append(amount, rhs.amount).append(id, rhs.id)
				.append(taxAmount, rhs.taxAmount).append(refundId, rhs.refundId).append(amountSet, rhs.amountSet)
				.append(reason, rhs.reason).append(additionalProperties, rhs.additionalProperties)
				.append(kind, rhs.kind).append(orderId, rhs.orderId).isEquals();
	}

}
