
package com.shopify.api.contracts.orders.transaction;

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
@JsonPropertyOrder({
    "id",
    "order_id",
    "kind",
    "gateway",
    "status",
    "message",
    "created_at",
    "test",
    "authorization",
    "location_id",
    "user_id",
    "parent_id",
    "processed_at",
    "device_id",
    "receipt",
    "error_code",
    "source_name",
    "amount",
    "currency",
    "admin_graphql_api_id",
    "payment_details"
})
public class Transaction implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("order_id")
    private long orderId;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("status")
    private String status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("test")
    private boolean test;
    @JsonProperty("authorization")
    private String authorization;
    @JsonProperty("location_id")
    private Object locationId;
    @JsonProperty("user_id")
    private Object userId;
    @JsonProperty("parent_id")
    private Object parentId;
    @JsonProperty("processed_at")
    private String processedAt;
    @JsonProperty("device_id")
    private Object deviceId;
    @JsonProperty("receipt")
    private Receipt receipt;
    @JsonProperty("error_code")
    private Object errorCode;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("payment_details")
    private PaymentDetails paymentDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5111298342364001593L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction() {
    }

    /**
     * 
     * @param gateway
     * @param status
     * @param test
     * @param adminGraphqlApiId
     * @param locationId
     * @param receipt
     * @param authorization
     * @param paymentDetails
     * @param kind
     * @param currency
     * @param amount
     * @param id
     * @param message
     * @param parentId
     * @param sourceName
     * @param createdAt
     * @param userId
     * @param errorCode
     * @param deviceId
     * @param processedAt
     * @param orderId
     */
    public Transaction(long id, long orderId, String kind, String gateway, String status, String message, String createdAt, boolean test, String authorization, Object locationId, Object userId, Object parentId, String processedAt, Object deviceId, Receipt receipt, Object errorCode, String sourceName, String amount, String currency, String adminGraphqlApiId, PaymentDetails paymentDetails) {
        super();
        this.id = id;
        this.orderId = orderId;
        this.kind = kind;
        this.gateway = gateway;
        this.status = status;
        this.message = message;
        this.createdAt = createdAt;
        this.test = test;
        this.authorization = authorization;
        this.locationId = locationId;
        this.userId = userId;
        this.parentId = parentId;
        this.processedAt = processedAt;
        this.deviceId = deviceId;
        this.receipt = receipt;
        this.errorCode = errorCode;
        this.sourceName = sourceName;
        this.amount = amount;
        this.currency = currency;
        this.adminGraphqlApiId = adminGraphqlApiId;
        this.paymentDetails = paymentDetails;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Transaction withId(long id) {
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

    public Transaction withOrderId(long orderId) {
        this.orderId = orderId;
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

    public Transaction withKind(String kind) {
        this.kind = kind;
        return this;
    }

    @JsonProperty("gateway")
    public String getGateway() {
        return gateway;
    }

    @JsonProperty("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public Transaction withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Transaction withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Transaction withMessage(String message) {
        this.message = message;
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

    public Transaction withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("test")
    public boolean isTest() {
        return test;
    }

    @JsonProperty("test")
    public void setTest(boolean test) {
        this.test = test;
    }

    public Transaction withTest(boolean test) {
        this.test = test;
        return this;
    }

    @JsonProperty("authorization")
    public String getAuthorization() {
        return authorization;
    }

    @JsonProperty("authorization")
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public Transaction withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    @JsonProperty("location_id")
    public Object getLocationId() {
        return locationId;
    }

    @JsonProperty("location_id")
    public void setLocationId(Object locationId) {
        this.locationId = locationId;
    }

    public Transaction withLocationId(Object locationId) {
        this.locationId = locationId;
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

    public Transaction withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("parent_id")
    public Object getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Transaction withParentId(Object parentId) {
        this.parentId = parentId;
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

    public Transaction withProcessedAt(String processedAt) {
        this.processedAt = processedAt;
        return this;
    }

    @JsonProperty("device_id")
    public Object getDeviceId() {
        return deviceId;
    }

    @JsonProperty("device_id")
    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public Transaction withDeviceId(Object deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @JsonProperty("receipt")
    public Receipt getReceipt() {
        return receipt;
    }

    @JsonProperty("receipt")
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Transaction withReceipt(Receipt receipt) {
        this.receipt = receipt;
        return this;
    }

    @JsonProperty("error_code")
    public Object getErrorCode() {
        return errorCode;
    }

    @JsonProperty("error_code")
    public void setErrorCode(Object errorCode) {
        this.errorCode = errorCode;
    }

    public Transaction withErrorCode(Object errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    @JsonProperty("source_name")
    public String getSourceName() {
        return sourceName;
    }

    @JsonProperty("source_name")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Transaction withSourceName(String sourceName) {
        this.sourceName = sourceName;
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

    public Transaction withAmount(String amount) {
        this.amount = amount;
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

    public Transaction withCurrency(String currency) {
        this.currency = currency;
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

    public Transaction withAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
        return this;
    }

    @JsonProperty("payment_details")
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    @JsonProperty("payment_details")
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public Transaction withPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
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

    public Transaction withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("orderId", orderId).append("kind", kind).append("gateway", gateway).append("status", status).append("message", message).append("createdAt", createdAt).append("test", test).append("authorization", authorization).append("locationId", locationId).append("userId", userId).append("parentId", parentId).append("processedAt", processedAt).append("deviceId", deviceId).append("receipt", receipt).append("errorCode", errorCode).append("sourceName", sourceName).append("amount", amount).append("currency", currency).append("adminGraphqlApiId", adminGraphqlApiId).append("paymentDetails", paymentDetails).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(gateway).append(test).append(status).append(adminGraphqlApiId).append(locationId).append(receipt).append(authorization).append(paymentDetails).append(kind).append(currency).append(amount).append(message).append(id).append(parentId).append(additionalProperties).append(sourceName).append(createdAt).append(userId).append(errorCode).append(deviceId).append(processedAt).append(orderId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transaction) == false) {
            return false;
        }
        Transaction rhs = ((Transaction) other);
        return new EqualsBuilder().append(gateway, rhs.gateway).append(test, rhs.test).append(status, rhs.status).append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(locationId, rhs.locationId).append(receipt, rhs.receipt).append(authorization, rhs.authorization).append(paymentDetails, rhs.paymentDetails).append(kind, rhs.kind).append(currency, rhs.currency).append(amount, rhs.amount).append(message, rhs.message).append(id, rhs.id).append(parentId, rhs.parentId).append(additionalProperties, rhs.additionalProperties).append(sourceName, rhs.sourceName).append(createdAt, rhs.createdAt).append(userId, rhs.userId).append(errorCode, rhs.errorCode).append(deviceId, rhs.deviceId).append(processedAt, rhs.processedAt).append(orderId, rhs.orderId).isEquals();
    }

}
