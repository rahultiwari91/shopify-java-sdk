
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
    "first_name",
    "address1",
    "phone",
    "city",
    "zip",
    "province",
    "country",
    "last_name",
    "address2",
    "company",
    "latitude",
    "longitude",
    "name",
    "country_code",
    "province_code"
})
public class BillingAddress implements Serializable
{

    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("address1")
    private String address1;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("province")
    private String province;
    @JsonProperty("country")
    private String country;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("address2")
    private String address2;
    @JsonProperty("company")
    private Object company;
    @JsonProperty("latitude")
    private double latitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("name")
    private String name;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("province_code")
    private String provinceCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1427790667837668066L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BillingAddress() {
    }

    /**
     * 
     * @param zip
     * @param lastName
     * @param phone
     * @param provinceCode
     * @param countryCode
     * @param address1
     * @param address2
     * @param city
     * @param country
     * @param name
     * @param company
     * @param province
     * @param longitude
     * @param latitude
     * @param firstName
     */
    public BillingAddress(String firstName, String address1, String phone, String city, String zip, String province, String country, String lastName, String address2, Object company, double latitude, double longitude, String name, String countryCode, String provinceCode) {
        super();
        this.firstName = firstName;
        this.address1 = address1;
        this.phone = phone;
        this.city = city;
        this.zip = zip;
        this.province = province;
        this.country = country;
        this.lastName = lastName;
        this.address2 = address2;
        this.company = company;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.countryCode = countryCode;
        this.provinceCode = provinceCode;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public BillingAddress withFirstName(String firstName) {
        this.firstName = firstName;
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

    public BillingAddress withAddress1(String address1) {
        this.address1 = address1;
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

    public BillingAddress withPhone(String phone) {
        this.phone = phone;
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

    public BillingAddress withCity(String city) {
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

    public BillingAddress withZip(String zip) {
        this.zip = zip;
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

    public BillingAddress withProvince(String province) {
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

    public BillingAddress withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BillingAddress withLastName(String lastName) {
        this.lastName = lastName;
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

    public BillingAddress withAddress2(String address2) {
        this.address2 = address2;
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

    public BillingAddress withCompany(Object company) {
        this.company = company;
        return this;
    }

    @JsonProperty("latitude")
    public double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public BillingAddress withLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    @JsonProperty("longitude")
    public double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public BillingAddress withLongitude(double longitude) {
        this.longitude = longitude;
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

    public BillingAddress withName(String name) {
        this.name = name;
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

    public BillingAddress withCountryCode(String countryCode) {
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

    public BillingAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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

    public BillingAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("firstName", firstName).append("address1", address1).append("phone", phone).append("city", city).append("zip", zip).append("province", province).append("country", country).append("lastName", lastName).append("address2", address2).append("company", company).append("latitude", latitude).append("longitude", longitude).append("name", name).append("countryCode", countryCode).append("provinceCode", provinceCode).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastName).append(zip).append(phone).append(provinceCode).append(countryCode).append(address1).append(address2).append(country).append(city).append(additionalProperties).append(name).append(company).append(province).append(longitude).append(latitude).append(firstName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BillingAddress) == false) {
            return false;
        }
        BillingAddress rhs = ((BillingAddress) other);
        return new EqualsBuilder().append(lastName, rhs.lastName).append(zip, rhs.zip).append(phone, rhs.phone).append(provinceCode, rhs.provinceCode).append(countryCode, rhs.countryCode).append(address1, rhs.address1).append(address2, rhs.address2).append(country, rhs.country).append(city, rhs.city).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(company, rhs.company).append(province, rhs.province).append(longitude, rhs.longitude).append(latitude, rhs.latitude).append(firstName, rhs.firstName).isEquals();
    }

}
