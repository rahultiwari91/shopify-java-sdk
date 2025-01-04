
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
@JsonPropertyOrder({ "id", "order_id", "created_at", "note", "user_id", "processed_at", "restock",
		"admin_graphql_api_id", "refund_line_items", "transactions", "order_adjustments" })
public class Refund implements Serializable {

	@JsonProperty("id")
	private long id;
	@JsonProperty("order_id")
	private long orderId;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("note")
	private String note;
	@JsonProperty("user_id")
	private long userId;
	@JsonProperty("processed_at")
	private String processedAt;
	@JsonProperty("restock")
	private boolean restock;
	@JsonProperty("admin_graphql_api_id")
	private String adminGraphqlApiId;
	@JsonProperty("refund_line_items")
	private List<RefundLineItem> refundLineItems = new ArrayList<RefundLineItem>();
	@JsonProperty("transactions")
	private List<Transaction> transactions = new ArrayList<Transaction>();
	@JsonProperty("order_adjustments")
	private List<Object> orderAdjustments = new ArrayList<Object>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 9190788648279913471L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Refund() {
	}

	/**
	 * 
	 * @param id
	 * @param transactions
	 * @param createdAt
	 * @param orderAdjustments
	 * @param adminGraphqlApiId
	 * @param userId
	 * @param refundLineItems
	 * @param restock
	 * @param processedAt
	 * @param note
	 * @param orderId
	 */
	public Refund(long id, long orderId, String createdAt, String note, long userId, String processedAt,
			boolean restock, String adminGraphqlApiId, List<RefundLineItem> refundLineItems,
			List<Transaction> transactions, List<Object> orderAdjustments) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.createdAt = createdAt;
		this.note = note;
		this.userId = userId;
		this.processedAt = processedAt;
		this.restock = restock;
		this.adminGraphqlApiId = adminGraphqlApiId;
		this.refundLineItems = refundLineItems;
		this.transactions = transactions;
		this.orderAdjustments = orderAdjustments;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	public Refund withId(long id) {
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

	public Refund withOrderId(long orderId) {
		this.orderId = orderId;
		return this;
	}

	@JsonProperty("created_at")
	public String getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Refund withCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@JsonProperty("note")
	public String getNote() {
		return note;
	}

	@JsonProperty("note")
	public void setNote(String note) {
		this.note = note;
	}

	public Refund withNote(String note) {
		this.note = note;
		return this;
	}

	@JsonProperty("user_id")
	public long getUserId() {
		return userId;
	}

	@JsonProperty("user_id")
	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Refund withUserId(long userId) {
		this.userId = userId;
		return this;
	}

	@JsonProperty("processed_at")
	public String getProcessedAt() {
		return processedAt;
	}

	@JsonProperty("processed_at")
	public void setProcessedAt(String processedAt) {
		this.processedAt = processedAt;
	}

	public Refund withProcessedAt(String processedAt) {
		this.processedAt = processedAt;
		return this;
	}

	@JsonProperty("restock")
	public boolean isRestock() {
		return restock;
	}

	@JsonProperty("restock")
	public void setRestock(boolean restock) {
		this.restock = restock;
	}

	public Refund withRestock(boolean restock) {
		this.restock = restock;
		return this;
	}

	@JsonProperty("admin_graphql_api_id")
	public String getAdminGraphqlApiId() {
		return adminGraphqlApiId;
	}

	@JsonProperty("admin_graphql_api_id")
	public void setAdminGraphqlApiId(String adminGraphqlApiId) {
		this.adminGraphqlApiId = adminGraphqlApiId;
	}

	public Refund withAdminGraphqlApiId(String adminGraphqlApiId) {
		this.adminGraphqlApiId = adminGraphqlApiId;
		return this;
	}

	@JsonProperty("refund_line_items")
	public List<RefundLineItem> getRefundLineItems() {
		return refundLineItems;
	}

	@JsonProperty("refund_line_items")
	public void setRefundLineItems(List<RefundLineItem> refundLineItems) {
		this.refundLineItems = refundLineItems;
	}

	public Refund withRefundLineItems(List<RefundLineItem> refundLineItems) {
		this.refundLineItems = refundLineItems;
		return this;
	}

	@JsonProperty("transactions")
	public List<Transaction> getTransactions() {
		return transactions;
	}

	@JsonProperty("transactions")
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Refund withTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
		return this;
	}

	@JsonProperty("order_adjustments")
	public List<Object> getOrderAdjustments() {
		return orderAdjustments;
	}

	@JsonProperty("order_adjustments")
	public void setOrderAdjustments(List<Object> orderAdjustments) {
		this.orderAdjustments = orderAdjustments;
	}

	public Refund withOrderAdjustments(List<Object> orderAdjustments) {
		this.orderAdjustments = orderAdjustments;
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

	public Refund withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("orderId", orderId).append("createdAt", createdAt)
				.append("note", note).append("userId", userId).append("processedAt", processedAt)
				.append("restock", restock).append("adminGraphqlApiId", adminGraphqlApiId)
				.append("refundLineItems", refundLineItems).append("transactions", transactions)
				.append("orderAdjustments", orderAdjustments).append("additionalProperties", additionalProperties)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(transactions).append(orderAdjustments).append(adminGraphqlApiId).append(id)
				.append(additionalProperties).append(createdAt).append(userId).append(refundLineItems).append(restock)
				.append(processedAt).append(note).append(orderId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Refund) == false) {
			return false;
		}
		Refund rhs = ((Refund) other);
		return new EqualsBuilder().append(transactions, rhs.transactions).append(orderAdjustments, rhs.orderAdjustments)
				.append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(id, rhs.id)
				.append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt)
				.append(userId, rhs.userId).append(refundLineItems, rhs.refundLineItems).append(restock, rhs.restock)
				.append(processedAt, rhs.processedAt).append(note, rhs.note).append(orderId, rhs.orderId).isEquals();
	}

}
