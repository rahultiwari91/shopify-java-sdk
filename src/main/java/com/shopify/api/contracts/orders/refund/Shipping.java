
package com.shopify.api.contracts.orders.refund;

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
    "full_refund"
})
public class Shipping implements Serializable
{

    @JsonProperty("full_refund")
    private boolean fullRefund;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7089382504895299223L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shipping() {
    }

    /**
     * 
     * @param fullRefund
     */
    public Shipping(boolean fullRefund) {
        super();
        this.fullRefund = fullRefund;
    }

    @JsonProperty("full_refund")
    public boolean isFullRefund() {
        return fullRefund;
    }

    @JsonProperty("full_refund")
    public void setFullRefund(boolean fullRefund) {
        this.fullRefund = fullRefund;
    }

    public Shipping withFullRefund(boolean fullRefund) {
        this.fullRefund = fullRefund;
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

    public Shipping withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fullRefund", fullRefund).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fullRefund).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shipping) == false) {
            return false;
        }
        Shipping rhs = ((Shipping) other);
        return new EqualsBuilder().append(fullRefund, rhs.fullRefund).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
