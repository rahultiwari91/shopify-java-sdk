
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
    "id",
    "country_code",
    "province_code",
    "name",
    "address1",
    "address2",
    "city",
    "zip"
})
public class OriginLocation implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("province_code")
    private String provinceCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -661967598328791628L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OriginLocation() {
    }

    /**
     * 
     * @param id
     * @param zip
     * @param name
     * @param provinceCode
     * @param countryCode
     * @param address1
     * @param address2
     * @param city
     */
    public OriginLocation(long id, String countryCode, String provinceCode, String name, String address1, String address2, String city, String zip) {
        super();
        this.id = id;
        this.countryCode = countryCode;
        this.provinceCode = provinceCode;
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.zip = zip;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public OriginLocation withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public OriginLocation withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("province_code")
    public String getProvinceCode() {
        return provinceCode;
    }

    @JsonProperty("province_code")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public OriginLocation withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public OriginLocation withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("address1")
    public String getAddress1() {
        return address1;
    }

    @JsonProperty("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public OriginLocation withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    @JsonProperty("address2")
    public String getAddress2() {
        return address2;
    }

    @JsonProperty("address2")
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public OriginLocation withAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public OriginLocation withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public OriginLocation withZip(String zip) {
        this.zip = zip;
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

    public OriginLocation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("countryCode", countryCode).append("provinceCode", provinceCode).append("name", name).append("address1", address1).append("address2", address2).append("city", city).append("zip", zip).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(zip).append(additionalProperties).append(name).append(provinceCode).append(countryCode).append(address1).append(address2).append(city).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginLocation) == false) {
            return false;
        }
        OriginLocation rhs = ((OriginLocation) other);
        return new EqualsBuilder().append(id, rhs.id).append(zip, rhs.zip).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(provinceCode, rhs.provinceCode).append(countryCode, rhs.countryCode).append(address1, rhs.address1).append(address2, rhs.address2).append(city, rhs.city).isEquals();
    }

}
