
package com.shopify.api.contracts.order;

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
    "credit_card_bin",
    "avs_result_code",
    "cvv_result_code",
    "credit_card_number",
    "credit_card_company"
})
public class PaymentDetails implements Serializable
{

    @JsonProperty("credit_card_bin")
    private Object creditCardBin;
    @JsonProperty("avs_result_code")
    private Object avsResultCode;
    @JsonProperty("cvv_result_code")
    private Object cvvResultCode;
    @JsonProperty("credit_card_number")
    private String creditCardNumber;
    @JsonProperty("credit_card_company")
    private String creditCardCompany;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -991065164314476580L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentDetails() {
    }

    /**
     * 
     * @param creditCardBin
     * @param creditCardCompany
     * @param creditCardNumber
     * @param avsResultCode
     * @param cvvResultCode
     */
    public PaymentDetails(Object creditCardBin, Object avsResultCode, Object cvvResultCode, String creditCardNumber, String creditCardCompany) {
        super();
        this.creditCardBin = creditCardBin;
        this.avsResultCode = avsResultCode;
        this.cvvResultCode = cvvResultCode;
        this.creditCardNumber = creditCardNumber;
        this.creditCardCompany = creditCardCompany;
    }

    @JsonProperty("credit_card_bin")
    public Object getCreditCardBin() {
        return creditCardBin;
    }

    @JsonProperty("credit_card_bin")
    public void setCreditCardBin(Object creditCardBin) {
        this.creditCardBin = creditCardBin;
    }

    public PaymentDetails withCreditCardBin(Object creditCardBin) {
        this.creditCardBin = creditCardBin;
        return this;
    }

    @JsonProperty("avs_result_code")
    public Object getAvsResultCode() {
        return avsResultCode;
    }

    @JsonProperty("avs_result_code")
    public void setAvsResultCode(Object avsResultCode) {
        this.avsResultCode = avsResultCode;
    }

    public PaymentDetails withAvsResultCode(Object avsResultCode) {
        this.avsResultCode = avsResultCode;
        return this;
    }

    @JsonProperty("cvv_result_code")
    public Object getCvvResultCode() {
        return cvvResultCode;
    }

    @JsonProperty("cvv_result_code")
    public void setCvvResultCode(Object cvvResultCode) {
        this.cvvResultCode = cvvResultCode;
    }

    public PaymentDetails withCvvResultCode(Object cvvResultCode) {
        this.cvvResultCode = cvvResultCode;
        return this;
    }

    @JsonProperty("credit_card_number")
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @JsonProperty("credit_card_number")
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public PaymentDetails withCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
        return this;
    }

    @JsonProperty("credit_card_company")
    public String getCreditCardCompany() {
        return creditCardCompany;
    }

    @JsonProperty("credit_card_company")
    public void setCreditCardCompany(String creditCardCompany) {
        this.creditCardCompany = creditCardCompany;
    }

    public PaymentDetails withCreditCardCompany(String creditCardCompany) {
        this.creditCardCompany = creditCardCompany;
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

    public PaymentDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("creditCardBin", creditCardBin).append("avsResultCode", avsResultCode).append("cvvResultCode", cvvResultCode).append("creditCardNumber", creditCardNumber).append("creditCardCompany", creditCardCompany).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(creditCardBin).append(additionalProperties).append(creditCardCompany).append(creditCardNumber).append(avsResultCode).append(cvvResultCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PaymentDetails) == false) {
            return false;
        }
        PaymentDetails rhs = ((PaymentDetails) other);
        return new EqualsBuilder().append(creditCardBin, rhs.creditCardBin).append(additionalProperties, rhs.additionalProperties).append(creditCardCompany, rhs.creditCardCompany).append(creditCardNumber, rhs.creditCardNumber).append(avsResultCode, rhs.avsResultCode).append(cvvResultCode, rhs.cvvResultCode).isEquals();
    }

}
