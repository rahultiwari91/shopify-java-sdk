
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
    "shop_id",
    "shop_name",
    "payments_charge_id",
    "order_transaction_id",
    "manual_entry"
})
public class Metadata implements Serializable
{

    @JsonProperty("shop_id")
    private String shopId;
    @JsonProperty("shop_name")
    private String shopName;
    @JsonProperty("payments_charge_id")
    private String paymentsChargeId;
    @JsonProperty("order_transaction_id")
    private String orderTransactionId;
    @JsonProperty("manual_entry")
    private String manualEntry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6935587338790310572L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metadata() {
    }

    /**
     * 
     * @param orderTransactionId
     * @param shopName
     * @param shopId
     * @param manualEntry
     * @param paymentsChargeId
     */
    public Metadata(String shopId, String shopName, String paymentsChargeId, String orderTransactionId, String manualEntry) {
        super();
        this.shopId = shopId;
        this.shopName = shopName;
        this.paymentsChargeId = paymentsChargeId;
        this.orderTransactionId = orderTransactionId;
        this.manualEntry = manualEntry;
    }

    @JsonProperty("shop_id")
    public String getShopId() {
        return shopId;
    }

    @JsonProperty("shop_id")
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Metadata withShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }

    @JsonProperty("shop_name")
    public String getShopName() {
        return shopName;
    }

    @JsonProperty("shop_name")
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Metadata withShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    @JsonProperty("payments_charge_id")
    public String getPaymentsChargeId() {
        return paymentsChargeId;
    }

    @JsonProperty("payments_charge_id")
    public void setPaymentsChargeId(String paymentsChargeId) {
        this.paymentsChargeId = paymentsChargeId;
    }

    public Metadata withPaymentsChargeId(String paymentsChargeId) {
        this.paymentsChargeId = paymentsChargeId;
        return this;
    }

    @JsonProperty("order_transaction_id")
    public String getOrderTransactionId() {
        return orderTransactionId;
    }

    @JsonProperty("order_transaction_id")
    public void setOrderTransactionId(String orderTransactionId) {
        this.orderTransactionId = orderTransactionId;
    }

    public Metadata withOrderTransactionId(String orderTransactionId) {
        this.orderTransactionId = orderTransactionId;
        return this;
    }

    @JsonProperty("manual_entry")
    public String getManualEntry() {
        return manualEntry;
    }

    @JsonProperty("manual_entry")
    public void setManualEntry(String manualEntry) {
        this.manualEntry = manualEntry;
    }

    public Metadata withManualEntry(String manualEntry) {
        this.manualEntry = manualEntry;
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

    public Metadata withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("shopId", shopId).append("shopName", shopName).append("paymentsChargeId", paymentsChargeId).append("orderTransactionId", orderTransactionId).append("manualEntry", manualEntry).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(orderTransactionId).append(additionalProperties).append(shopName).append(shopId).append(manualEntry).append(paymentsChargeId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return new EqualsBuilder().append(orderTransactionId, rhs.orderTransactionId).append(additionalProperties, rhs.additionalProperties).append(shopName, rhs.shopName).append(shopId, rhs.shopId).append(manualEntry, rhs.manualEntry).append(paymentsChargeId, rhs.paymentsChargeId).isEquals();
    }

}
