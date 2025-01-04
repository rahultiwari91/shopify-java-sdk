
package com.shopify.api.contracts.customer;

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
    "customer_id",
    "first_name",
    "last_name",
    "company",
    "address1",
    "address2",
    "city",
    "province",
    "country",
    "zip",
    "phone",
    "name",
    "province_code",
    "country_code",
    "country_name",
    "default"
})
public class DefaultAddress implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("customer_id")
    private long customerId;
    @JsonProperty("first_name")
    private Object firstName;
    @JsonProperty("last_name")
    private Object lastName;
    @JsonProperty("company")
    private Object company;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("province")
    private String province;
    @JsonProperty("country")
    private String country;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("name")
    private String name;
    @JsonProperty("province_code")
    private String provinceCode;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("default")
    private boolean _default;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5253808288706929724L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DefaultAddress() {
    }

    /**
     * 
     * @param lastName
     * @param zip
     * @param countryName
     * @param phone
     * @param provinceCode
     * @param countryCode
     * @param address1
     * @param address2
     * @param city
     * @param country
     * @param id
     * @param customerId
     * @param _default
     * @param name
     * @param company
     * @param province
     * @param firstName
     */
    public DefaultAddress(long id, long customerId, Object firstName, Object lastName, Object company, String address1, String address2, String city, String province, String country, String zip, String phone, String name, String provinceCode, String countryCode, String countryName, boolean _default) {
        super();
        this.id = id;
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.province = province;
        this.country = country;
        this.zip = zip;
        this.phone = phone;
        this.name = name;
        this.provinceCode = provinceCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this._default = _default;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public DefaultAddress withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("customer_id")
    public long getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public DefaultAddress withCustomerId(long customerId) {
        this.customerId = customerId;
        return this;
    }

    @JsonProperty("first_name")
    public Object getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    public DefaultAddress withFirstName(Object firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("last_name")
    public Object getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public DefaultAddress withLastName(Object lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("company")
    public Object getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Object company) {
        this.company = company;
    }

    public DefaultAddress withCompany(Object company) {
        this.company = company;
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

    public DefaultAddress withAddress1(String address1) {
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

    public DefaultAddress withAddress2(String address2) {
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

    public DefaultAddress withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    public DefaultAddress withProvince(String province) {
        this.province = province;
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

    public DefaultAddress withCountry(String country) {
        this.country = country;
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

    public DefaultAddress withZip(String zip) {
        this.zip = zip;
        return this;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DefaultAddress withPhone(String phone) {
        this.phone = phone;
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

    public DefaultAddress withName(String name) {
        this.name = name;
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

    public DefaultAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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

    public DefaultAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public DefaultAddress withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    @JsonProperty("default")
    public boolean isDefault() {
        return _default;
    }

    @JsonProperty("default")
    public void setDefault(boolean _default) {
        this._default = _default;
    }

    public DefaultAddress withDefault(boolean _default) {
        this._default = _default;
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

    public DefaultAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("customerId", customerId).append("firstName", firstName).append("lastName", lastName).append("company", company).append("address1", address1).append("address2", address2).append("city", city).append("province", province).append("country", country).append("zip", zip).append("phone", phone).append("name", name).append("provinceCode", provinceCode).append("countryCode", countryCode).append("countryName", countryName).append("_default", _default).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zip).append(lastName).append(countryName).append(phone).append(provinceCode).append(countryCode).append(address1).append(address2).append(country).append(city).append(id).append(customerId).append(additionalProperties).append(_default).append(name).append(company).append(province).append(firstName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultAddress) == false) {
            return false;
        }
        DefaultAddress rhs = ((DefaultAddress) other);
        return new EqualsBuilder().append(zip, rhs.zip).append(lastName, rhs.lastName).append(countryName, rhs.countryName).append(phone, rhs.phone).append(provinceCode, rhs.provinceCode).append(countryCode, rhs.countryCode).append(address1, rhs.address1).append(address2, rhs.address2).append(country, rhs.country).append(city, rhs.city).append(id, rhs.id).append(customerId, rhs.customerId).append(additionalProperties, rhs.additionalProperties).append(_default, rhs._default).append(name, rhs.name).append(company, rhs.company).append(province, rhs.province).append(firstName, rhs.firstName).isEquals();
    }

}
