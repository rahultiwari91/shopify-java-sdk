
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
    "gift_card_id",
    "gift_card_last_characters"
})
public class Receipt implements Serializable
{

    @JsonProperty("gift_card_id")
    private long giftCardId;
    @JsonProperty("gift_card_last_characters")
    private String giftCardLastCharacters;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1586401734326000093L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Receipt() {
    }

    /**
     * 
     * @param giftCardLastCharacters
     * @param giftCardId
     */
    public Receipt(long giftCardId, String giftCardLastCharacters) {
        super();
        this.giftCardId = giftCardId;
        this.giftCardLastCharacters = giftCardLastCharacters;
    }

    @JsonProperty("gift_card_id")
    public long getGiftCardId() {
        return giftCardId;
    }

    @JsonProperty("gift_card_id")
    public void setGiftCardId(long giftCardId) {
        this.giftCardId = giftCardId;
    }

    public Receipt withGiftCardId(long giftCardId) {
        this.giftCardId = giftCardId;
        return this;
    }

    @JsonProperty("gift_card_last_characters")
    public String getGiftCardLastCharacters() {
        return giftCardLastCharacters;
    }

    @JsonProperty("gift_card_last_characters")
    public void setGiftCardLastCharacters(String giftCardLastCharacters) {
        this.giftCardLastCharacters = giftCardLastCharacters;
    }

    public Receipt withGiftCardLastCharacters(String giftCardLastCharacters) {
        this.giftCardLastCharacters = giftCardLastCharacters;
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

    public Receipt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("giftCardId", giftCardId).append("giftCardLastCharacters", giftCardLastCharacters).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(giftCardLastCharacters).append(giftCardId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Receipt) == false) {
            return false;
        }
        Receipt rhs = ((Receipt) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(giftCardLastCharacters, rhs.giftCardLastCharacters).append(giftCardId, rhs.giftCardId).isEquals();
    }

}
