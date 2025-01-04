
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
    "address_line1_check",
    "address_postal_code_check",
    "cvc_check"
})
public class Checks implements Serializable
{

    @JsonProperty("address_line1_check")
    private String addressLine1Check;
    @JsonProperty("address_postal_code_check")
    private String addressPostalCodeCheck;
    @JsonProperty("cvc_check")
    private String cvcCheck;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3132757165490802113L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Checks() {
    }

    /**
     * 
     * @param cvcCheck
     * @param addressPostalCodeCheck
     * @param addressLine1Check
     */
    public Checks(String addressLine1Check, String addressPostalCodeCheck, String cvcCheck) {
        super();
        this.addressLine1Check = addressLine1Check;
        this.addressPostalCodeCheck = addressPostalCodeCheck;
        this.cvcCheck = cvcCheck;
    }

    @JsonProperty("address_line1_check")
    public String getAddressLine1Check() {
        return addressLine1Check;
    }

    @JsonProperty("address_line1_check")
    public void setAddressLine1Check(String addressLine1Check) {
        this.addressLine1Check = addressLine1Check;
    }

    public Checks withAddressLine1Check(String addressLine1Check) {
        this.addressLine1Check = addressLine1Check;
        return this;
    }

    @JsonProperty("address_postal_code_check")
    public String getAddressPostalCodeCheck() {
        return addressPostalCodeCheck;
    }

    @JsonProperty("address_postal_code_check")
    public void setAddressPostalCodeCheck(String addressPostalCodeCheck) {
        this.addressPostalCodeCheck = addressPostalCodeCheck;
    }

    public Checks withAddressPostalCodeCheck(String addressPostalCodeCheck) {
        this.addressPostalCodeCheck = addressPostalCodeCheck;
        return this;
    }

    @JsonProperty("cvc_check")
    public String getCvcCheck() {
        return cvcCheck;
    }

    @JsonProperty("cvc_check")
    public void setCvcCheck(String cvcCheck) {
        this.cvcCheck = cvcCheck;
    }

    public Checks withCvcCheck(String cvcCheck) {
        this.cvcCheck = cvcCheck;
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

    public Checks withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("addressLine1Check", addressLine1Check).append("addressPostalCodeCheck", addressPostalCodeCheck).append("cvcCheck", cvcCheck).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(cvcCheck).append(addressPostalCodeCheck).append(addressLine1Check).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checks) == false) {
            return false;
        }
        Checks rhs = ((Checks) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(cvcCheck, rhs.cvcCheck).append(addressPostalCodeCheck, rhs.addressPostalCodeCheck).append(addressLine1Check, rhs.addressLine1Check).isEquals();
    }

}
