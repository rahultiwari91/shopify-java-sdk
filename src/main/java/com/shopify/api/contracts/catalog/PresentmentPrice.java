
package com.shopify.api.contracts.catalog;

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
    "price",
    "compare_at_price"
})
public class PresentmentPrice implements Serializable
{

    @JsonProperty("price")
    private ProductPrice price;
    @JsonProperty("compare_at_price")
    private Object compareAtPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5793903627009269319L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PresentmentPrice() {
    }

    /**
     * 
     * @param price
     * @param compareAtPrice
     */
    public PresentmentPrice(ProductPrice price, Object compareAtPrice) {
        super();
        this.price = price;
        this.compareAtPrice = compareAtPrice;
    }

    @JsonProperty("price")
    public ProductPrice getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(ProductPrice price) {
        this.price = price;
    }

    public PresentmentPrice withPrice(ProductPrice price) {
        this.price = price;
        return this;
    }

    @JsonProperty("compare_at_price")
    public Object getCompareAtPrice() {
        return compareAtPrice;
    }

    @JsonProperty("compare_at_price")
    public void setCompareAtPrice(Object compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    public PresentmentPrice withCompareAtPrice(Object compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
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

    public PresentmentPrice withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("price", price).append("compareAtPrice", compareAtPrice).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(price).append(additionalProperties).append(compareAtPrice).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PresentmentPrice) == false) {
            return false;
        }
        PresentmentPrice rhs = ((PresentmentPrice) other);
        return new EqualsBuilder().append(price, rhs.price).append(additionalProperties, rhs.additionalProperties).append(compareAtPrice, rhs.compareAtPrice).isEquals();
    }

}
