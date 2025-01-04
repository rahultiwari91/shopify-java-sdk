
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
    "brand",
    "checks",
    "country",
    "exp_month",
    "exp_year",
    "fingerprint",
    "funding",
    "last4",
    "moto",
    "three_d_secure",
    "wallet"
})
public class Card implements Serializable
{

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("checks")
    private Checks checks;
    @JsonProperty("country")
    private String country;
    @JsonProperty("exp_month")
    private long expMonth;
    @JsonProperty("exp_year")
    private long expYear;
    @JsonProperty("fingerprint")
    private String fingerprint;
    @JsonProperty("funding")
    private String funding;
    @JsonProperty("last4")
    private String last4;
    @JsonProperty("moto")
    private Object moto;
    @JsonProperty("three_d_secure")
    private Object threeDSecure;
    @JsonProperty("wallet")
    private Object wallet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -960101115161776323L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Card() {
    }

    /**
     * 
     * @param fingerprint
     * @param expMonth
     * @param funding
     * @param expYear
     * @param moto
     * @param brand
     * @param threeDSecure
     * @param checks
     * @param last4
     * @param wallet
     * @param country
     */
    public Card(String brand, Checks checks, String country, long expMonth, long expYear, String fingerprint, String funding, String last4, Object moto, Object threeDSecure, Object wallet) {
        super();
        this.brand = brand;
        this.checks = checks;
        this.country = country;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.fingerprint = fingerprint;
        this.funding = funding;
        this.last4 = last4;
        this.moto = moto;
        this.threeDSecure = threeDSecure;
        this.wallet = wallet;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Card withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @JsonProperty("checks")
    public Checks getChecks() {
        return checks;
    }

    @JsonProperty("checks")
    public void setChecks(Checks checks) {
        this.checks = checks;
    }

    public Card withChecks(Checks checks) {
        this.checks = checks;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Card withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("exp_month")
    public long getExpMonth() {
        return expMonth;
    }

    @JsonProperty("exp_month")
    public void setExpMonth(long expMonth) {
        this.expMonth = expMonth;
    }

    public Card withExpMonth(long expMonth) {
        this.expMonth = expMonth;
        return this;
    }

    @JsonProperty("exp_year")
    public long getExpYear() {
        return expYear;
    }

    @JsonProperty("exp_year")
    public void setExpYear(long expYear) {
        this.expYear = expYear;
    }

    public Card withExpYear(long expYear) {
        this.expYear = expYear;
        return this;
    }

    @JsonProperty("fingerprint")
    public String getFingerprint() {
        return fingerprint;
    }

    @JsonProperty("fingerprint")
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Card withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    @JsonProperty("funding")
    public String getFunding() {
        return funding;
    }

    @JsonProperty("funding")
    public void setFunding(String funding) {
        this.funding = funding;
    }

    public Card withFunding(String funding) {
        this.funding = funding;
        return this;
    }

    @JsonProperty("last4")
    public String getLast4() {
        return last4;
    }

    @JsonProperty("last4")
    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public Card withLast4(String last4) {
        this.last4 = last4;
        return this;
    }

    @JsonProperty("moto")
    public Object getMoto() {
        return moto;
    }

    @JsonProperty("moto")
    public void setMoto(Object moto) {
        this.moto = moto;
    }

    public Card withMoto(Object moto) {
        this.moto = moto;
        return this;
    }

    @JsonProperty("three_d_secure")
    public Object getThreeDSecure() {
        return threeDSecure;
    }

    @JsonProperty("three_d_secure")
    public void setThreeDSecure(Object threeDSecure) {
        this.threeDSecure = threeDSecure;
    }

    public Card withThreeDSecure(Object threeDSecure) {
        this.threeDSecure = threeDSecure;
        return this;
    }

    @JsonProperty("wallet")
    public Object getWallet() {
        return wallet;
    }

    @JsonProperty("wallet")
    public void setWallet(Object wallet) {
        this.wallet = wallet;
    }

    public Card withWallet(Object wallet) {
        this.wallet = wallet;
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

    public Card withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("brand", brand).append("checks", checks).append("country", country).append("expMonth", expMonth).append("expYear", expYear).append("fingerprint", fingerprint).append("funding", funding).append("last4", last4).append("moto", moto).append("threeDSecure", threeDSecure).append("wallet", wallet).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(funding).append(expYear).append(threeDSecure).append(checks).append(wallet).append(country).append(fingerprint).append(expMonth).append(additionalProperties).append(moto).append(brand).append(last4).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Card) == false) {
            return false;
        }
        Card rhs = ((Card) other);
        return new EqualsBuilder().append(funding, rhs.funding).append(expYear, rhs.expYear).append(threeDSecure, rhs.threeDSecure).append(checks, rhs.checks).append(wallet, rhs.wallet).append(country, rhs.country).append(fingerprint, rhs.fingerprint).append(expMonth, rhs.expMonth).append(additionalProperties, rhs.additionalProperties).append(moto, rhs.moto).append(brand, rhs.brand).append(last4, rhs.last4).isEquals();
    }

}
