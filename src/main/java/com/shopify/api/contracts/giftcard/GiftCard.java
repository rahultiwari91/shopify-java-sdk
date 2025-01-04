
package com.shopify.api.contracts.giftcard;

import java.io.Serializable;
import java.math.BigDecimal;
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
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "balance", "created_at", "updated_at", "currency", "initial_value", "disabled_at",
		"line_item_id", "api_client_id", "user_id", "customer_id", "note", "expires_on", "template_suffix",
		"last_characters", "code", "order_id" })
public class GiftCard implements Serializable {

	@JsonProperty("id")
	private long id;
	@JsonProperty("balance")
	private BigDecimal balance;
	@JsonProperty("created_at")
	private DateTime createdAt;
	@JsonProperty("updated_at")
	private DateTime updatedAt;
	@JsonProperty("currency")
	private String currency;
	@JsonProperty("initial_value")
	private BigDecimal initialValue;
	@JsonProperty("disabled_at")
	private Object disabledAt;
	@JsonProperty("line_item_id")
	private Object lineItemId;
	@JsonProperty("api_client_id")
	private Object apiClientId;
	@JsonProperty("user_id")
	private Object userId;
	@JsonProperty("customer_id")
	private Object customerId;
	@JsonProperty("note")
	private String note;
	@JsonProperty("expires_on")
	private Object expiresOn;
	@JsonProperty("template_suffix")
	private Object templateSuffix;
	@JsonProperty("last_characters")
	private String lastCharacters;
	@JsonProperty("code")
	private String code;
	@JsonProperty("order_id")
	private Object orderId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -7157109127944997140L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public GiftCard() {
	}

	/**
	 * 
	 * @param lastCharacters
	 * @param disabledAt
	 * @param templateSuffix
	 * @param apiClientId
	 * @param lineItemId
	 * @param currency
	 * @param id
	 * @param updatedAt
	 * @param balance
	 * @param customerId
	 * @param expiresOn
	 * @param createdAt
	 * @param initialValue
	 * @param userId
	 * @param orderId
	 * @param note
	 */
	public GiftCard(long id, BigDecimal balance, DateTime createdAt, DateTime updatedAt, String currency, BigDecimal initialValue,
			Object disabledAt, Object lineItemId, Object apiClientId, Object userId, Object customerId, String note,
			Object expiresOn, Object templateSuffix, String lastCharacters, Object orderId) {
		super();
		this.id = id;
		this.balance = balance;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.currency = currency;
		this.initialValue = initialValue;
		this.disabledAt = disabledAt;
		this.lineItemId = lineItemId;
		this.apiClientId = apiClientId;
		this.userId = userId;
		this.customerId = customerId;
		this.note = note;
		this.expiresOn = expiresOn;
		this.templateSuffix = templateSuffix;
		this.lastCharacters = lastCharacters;
		this.orderId = orderId;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	public GiftCard withId(long id) {
		this.id = id;
		return this;
	}

	@JsonProperty("balance")
	public BigDecimal getBalance() {
		return balance;
	}

	@JsonProperty("balance")
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public GiftCard withBalance(BigDecimal balance) {
		this.balance = balance;
		return this;
	}

	@JsonProperty("created_at")
	public DateTime getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("created_at")
	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public GiftCard withCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@JsonProperty("updated_at")
	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updated_at")
	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public GiftCard withUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	@JsonProperty("currency")
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public GiftCard withCurrency(String currency) {
		this.currency = currency;
		return this;
	}

	@JsonProperty("initial_value")
	public BigDecimal getInitialValue() {
		return initialValue;
	}

	@JsonProperty("initial_value")
	public void setInitialValue(BigDecimal initialValue) {
		this.initialValue = initialValue;
	}

	public GiftCard withInitialValue(BigDecimal initialValue) {
		this.initialValue = initialValue;
		return this;
	}

	@JsonProperty("disabled_at")
	public Object getDisabledAt() {
		return disabledAt;
	}

	@JsonProperty("disabled_at")
	public void setDisabledAt(Object disabledAt) {
		this.disabledAt = disabledAt;
	}

	public GiftCard withDisabledAt(Object disabledAt) {
		this.disabledAt = disabledAt;
		return this;
	}

	@JsonProperty("line_item_id")
	public Object getLineItemId() {
		return lineItemId;
	}

	@JsonProperty("line_item_id")
	public void setLineItemId(Object lineItemId) {
		this.lineItemId = lineItemId;
	}

	public GiftCard withLineItemId(Object lineItemId) {
		this.lineItemId = lineItemId;
		return this;
	}

	@JsonProperty("api_client_id")
	public Object getApiClientId() {
		return apiClientId;
	}

	@JsonProperty("api_client_id")
	public void setApiClientId(Object apiClientId) {
		this.apiClientId = apiClientId;
	}

	public GiftCard withApiClientId(Object apiClientId) {
		this.apiClientId = apiClientId;
		return this;
	}

	@JsonProperty("user_id")
	public Object getUserId() {
		return userId;
	}

	@JsonProperty("user_id")
	public void setUserId(Object userId) {
		this.userId = userId;
	}

	public GiftCard withUserId(Object userId) {
		this.userId = userId;
		return this;
	}

	@JsonProperty("customer_id")
	public Object getCustomerId() {
		return customerId;
	}

	@JsonProperty("customer_id")
	public void setCustomerId(Object customerId) {
		this.customerId = customerId;
	}

	public GiftCard withCustomerId(Object customerId) {
		this.customerId = customerId;
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

	public GiftCard withNote(String note) {
		this.note = note;
		return this;
	}

	@JsonProperty("expires_on")
	public Object getExpiresOn() {
		return expiresOn;
	}

	@JsonProperty("expires_on")
	public void setExpiresOn(Object expiresOn) {
		this.expiresOn = expiresOn;
	}

	public GiftCard withExpiresOn(Object expiresOn) {
		this.expiresOn = expiresOn;
		return this;
	}

	@JsonProperty("template_suffix")
	public Object getTemplateSuffix() {
		return templateSuffix;
	}

	@JsonProperty("template_suffix")
	public void setTemplateSuffix(Object templateSuffix) {
		this.templateSuffix = templateSuffix;
	}

	public GiftCard withTemplateSuffix(Object templateSuffix) {
		this.templateSuffix = templateSuffix;
		return this;
	}

	@JsonProperty("last_characters")
	public String getLastCharacters() {
		return lastCharacters;
	}

	@JsonProperty("last_characters")
	public void setLastCharacters(String lastCharacters) {
		this.lastCharacters = lastCharacters;
	}

	public GiftCard withLastCharacters(String lastCharacters) {
		this.lastCharacters = lastCharacters;
		return this;
	}

	@JsonProperty("code")
	public String getCode() {
		return code;
	}

	@JsonProperty("code")
	public void setCode(String code) {
		this.code = code;
	}

	public GiftCard withCode(String code) {
		this.code = code;
		return this;
	}

	@JsonProperty("order_id")
	public Object getOrderId() {
		return orderId;
	}

	@JsonProperty("order_id")
	public void setOrderId(Object orderId) {
		this.orderId = orderId;
	}

	public GiftCard withOrderId(Object orderId) {
		this.orderId = orderId;
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

	public GiftCard withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("balance", balance).append("createdAt", createdAt)
				.append("updatedAt", updatedAt).append("currency", currency).append("initialValue", initialValue)
				.append("disabledAt", disabledAt).append("lineItemId", lineItemId).append("apiClientId", apiClientId)
				.append("userId", userId).append("customerId", customerId).append("note", note)
				.append("expiresOn", expiresOn).append("templateSuffix", templateSuffix)
				.append("lastCharacters", lastCharacters).append("code", code).append("orderId", orderId)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(code).append(lastCharacters).append(disabledAt).append(templateSuffix)
				.append(apiClientId).append(lineItemId).append(currency).append(updatedAt).append(id).append(balance)
				.append(customerId).append(additionalProperties).append(expiresOn).append(createdAt).append(userId)
				.append(initialValue).append(orderId).append(note).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof GiftCard) == false) {
			return false;
		}
		GiftCard rhs = ((GiftCard) other);
		return new EqualsBuilder().append(code, rhs.code).append(code, rhs.code).append(disabledAt, rhs.disabledAt)
				.append(templateSuffix, rhs.templateSuffix).append(apiClientId, rhs.apiClientId)
				.append(lineItemId, rhs.lineItemId).append(currency, rhs.currency).append(updatedAt, rhs.updatedAt)
				.append(id, rhs.id).append(balance, rhs.balance).append(customerId, rhs.customerId)
				.append(additionalProperties, rhs.additionalProperties).append(expiresOn, rhs.expiresOn)
				.append(createdAt, rhs.createdAt).append(userId, rhs.userId).append(initialValue, rhs.initialValue)
				.append(orderId, rhs.orderId).append(note, rhs.note).isEquals();
	}

}
