
package com.shopify.api.contracts.orders.refund;

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
@JsonPropertyOrder({
    "currency",
    "shipping",
    "refund_line_items"
})
public class RefundCalculate implements Serializable
{

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("shipping")
    private Shipping shipping;
    @JsonProperty("refund_line_items")
    private List<RefundLineItem> refundLineItems = new ArrayList<RefundLineItem>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -9210607005770871435L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RefundCalculate() {
    }

    /**
     * 
     * @param shipping
     * @param refundLineItems
     * @param currency
     */
    public RefundCalculate(String currency, Shipping shipping, List<RefundLineItem> refundLineItems) {
        super();
        this.currency = currency;
        this.shipping = shipping;
        this.refundLineItems = refundLineItems;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public RefundCalculate withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("shipping")
    public Shipping getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public RefundCalculate withShipping(Shipping shipping) {
        this.shipping = shipping;
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

    public RefundCalculate withRefundLineItems(List<RefundLineItem> refundLineItems) {
        this.refundLineItems = refundLineItems;
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

    public RefundCalculate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("currency", currency).append("shipping", shipping).append("refundLineItems", refundLineItems).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shipping).append(additionalProperties).append(refundLineItems).append(currency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RefundCalculate) == false) {
            return false;
        }
        RefundCalculate rhs = ((RefundCalculate) other);
        return new EqualsBuilder().append(shipping, rhs.shipping).append(additionalProperties, rhs.additionalProperties).append(refundLineItems, rhs.refundLineItems).append(currency, rhs.currency).isEquals();
    }

}
