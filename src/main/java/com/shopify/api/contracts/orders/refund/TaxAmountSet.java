
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
import com.shopify.api.contracts.order.PresentmentMoney;
import com.shopify.api.contracts.order.ShopMoney;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "shop_money",
    "presentment_money"
})
public class TaxAmountSet implements Serializable
{

    @JsonProperty("shop_money")
    private ShopMoney shopMoney;
    @JsonProperty("presentment_money")
    private PresentmentMoney presentmentMoney;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4172071090491761992L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TaxAmountSet() {
    }

    /**
     * 
     * @param presentmentMoney
     * @param shopMoney
     */
    public TaxAmountSet(ShopMoney shopMoney, PresentmentMoney presentmentMoney) {
        super();
        this.shopMoney = shopMoney;
        this.presentmentMoney = presentmentMoney;
    }

    @JsonProperty("shop_money")
    public ShopMoney getShopMoney() {
        return shopMoney;
    }

    @JsonProperty("shop_money")
    public void setShopMoney(ShopMoney shopMoney) {
        this.shopMoney = shopMoney;
    }

    public TaxAmountSet withShopMoney(ShopMoney shopMoney) {
        this.shopMoney = shopMoney;
        return this;
    }

    @JsonProperty("presentment_money")
    public PresentmentMoney getPresentmentMoney() {
        return presentmentMoney;
    }

    @JsonProperty("presentment_money")
    public void setPresentmentMoney(PresentmentMoney presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
    }

    public TaxAmountSet withPresentmentMoney(PresentmentMoney presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
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

    public TaxAmountSet withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("shopMoney", shopMoney).append("presentmentMoney", presentmentMoney).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(presentmentMoney).append(additionalProperties).append(shopMoney).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaxAmountSet) == false) {
            return false;
        }
        TaxAmountSet rhs = ((TaxAmountSet) other);
        return new EqualsBuilder().append(presentmentMoney, rhs.presentmentMoney).append(additionalProperties, rhs.additionalProperties).append(shopMoney, rhs.shopMoney).isEquals();
    }

}
