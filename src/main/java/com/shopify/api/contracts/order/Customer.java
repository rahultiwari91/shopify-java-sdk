
package com.shopify.api.contracts.order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "email",
    "accepts_marketing",
    "created_at",
    "updated_at",
    "first_name",
    "last_name",
    "orders_count",
    "state",
    "total_spent",
    "last_order_id",
    "note",
    "verified_email",
    "multipass_identifier",
    "tax_exempt",
    "phone",
    "tags",
    "last_order_name",
    "currency",
    "accepts_marketing_updated_at",
    "marketing_opt_in_level",
    "tax_exemptions",
    "admin_graphql_api_id",
    "default_address"
})
public class Customer implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("accepts_marketing")
    private boolean acceptsMarketing;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("orders_count")
    private long ordersCount;
    @JsonProperty("state")
    private String state;
    @JsonProperty("total_spent")
    private String totalSpent;
    @JsonProperty("last_order_id")
    private long lastOrderId;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("verified_email")
    private boolean verifiedEmail;
    @JsonProperty("multipass_identifier")
    private Object multipassIdentifier;
    @JsonProperty("tax_exempt")
    private boolean taxExempt;
    @JsonProperty("phone")
    private Object phone;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("last_order_name")
    private String lastOrderName;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("accepts_marketing_updated_at")
    private String acceptsMarketingUpdatedAt;
    @JsonProperty("marketing_opt_in_level")
    private Object marketingOptInLevel;
    @JsonProperty("tax_exemptions")
    private List<Object> taxExemptions = new ArrayList<Object>();
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("default_address")
    private DefaultAddress defaultAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8483566445512275886L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Customer() {
    }

    /**
     * 
     * @param tags
     * @param lastName
     * @param phone
     * @param totalSpent
     * @param taxExemptions
     * @param adminGraphqlApiId
     * @param multipassIdentifier
     * @param state
     * @param marketingOptInLevel
     * @param lastOrderId
     * @param verifiedEmail
     * @param currency
     * @param id
     * @param updatedAt
     * @param acceptsMarketingUpdatedAt
     * @param email
     * @param createdAt
     * @param lastOrderName
     * @param defaultAddress
     * @param acceptsMarketing
     * @param firstName
     * @param note
     * @param taxExempt
     * @param ordersCount
     */
    public Customer(long id, String email, boolean acceptsMarketing, String createdAt, String updatedAt, String firstName, String lastName, long ordersCount, String state, String totalSpent, long lastOrderId, Object note, boolean verifiedEmail, Object multipassIdentifier, boolean taxExempt, Object phone, String tags, String lastOrderName, String currency, String acceptsMarketingUpdatedAt, Object marketingOptInLevel, List<Object> taxExemptions, String adminGraphqlApiId, DefaultAddress defaultAddress) {
        super();
        this.id = id;
        this.email = email;
        this.acceptsMarketing = acceptsMarketing;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ordersCount = ordersCount;
        this.state = state;
        this.totalSpent = totalSpent;
        this.lastOrderId = lastOrderId;
        this.note = note;
        this.verifiedEmail = verifiedEmail;
        this.multipassIdentifier = multipassIdentifier;
        this.taxExempt = taxExempt;
        this.phone = phone;
        this.tags = tags;
        this.lastOrderName = lastOrderName;
        this.currency = currency;
        this.acceptsMarketingUpdatedAt = acceptsMarketingUpdatedAt;
        this.marketingOptInLevel = marketingOptInLevel;
        this.taxExemptions = taxExemptions;
        this.adminGraphqlApiId = adminGraphqlApiId;
        this.defaultAddress = defaultAddress;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Customer withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Customer withEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("accepts_marketing")
    public boolean isAcceptsMarketing() {
        return acceptsMarketing;
    }

    @JsonProperty("accepts_marketing")
    public void setAcceptsMarketing(boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    public Customer withAcceptsMarketing(boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Customer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Customer withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Customer withFirstName(String firstName) {
        this.firstName = firstName;
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

    public Customer withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("orders_count")
    public long getOrdersCount() {
        return ordersCount;
    }

    @JsonProperty("orders_count")
    public void setOrdersCount(long ordersCount) {
        this.ordersCount = ordersCount;
    }

    public Customer withOrdersCount(long ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Customer withState(String state) {
        this.state = state;
        return this;
    }

    @JsonProperty("total_spent")
    public String getTotalSpent() {
        return totalSpent;
    }

    @JsonProperty("total_spent")
    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Customer withTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
        return this;
    }

    @JsonProperty("last_order_id")
    public long getLastOrderId() {
        return lastOrderId;
    }

    @JsonProperty("last_order_id")
    public void setLastOrderId(long lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public Customer withLastOrderId(long lastOrderId) {
        this.lastOrderId = lastOrderId;
        return this;
    }

    @JsonProperty("note")
    public Object getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Object note) {
        this.note = note;
    }

    public Customer withNote(Object note) {
        this.note = note;
        return this;
    }

    @JsonProperty("verified_email")
    public boolean isVerifiedEmail() {
        return verifiedEmail;
    }

    @JsonProperty("verified_email")
    public void setVerifiedEmail(boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

    public Customer withVerifiedEmail(boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
        return this;
    }

    @JsonProperty("multipass_identifier")
    public Object getMultipassIdentifier() {
        return multipassIdentifier;
    }

    @JsonProperty("multipass_identifier")
    public void setMultipassIdentifier(Object multipassIdentifier) {
        this.multipassIdentifier = multipassIdentifier;
    }

    public Customer withMultipassIdentifier(Object multipassIdentifier) {
        this.multipassIdentifier = multipassIdentifier;
        return this;
    }

    @JsonProperty("tax_exempt")
    public boolean isTaxExempt() {
        return taxExempt;
    }

    @JsonProperty("tax_exempt")
    public void setTaxExempt(boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public Customer withTaxExempt(boolean taxExempt) {
        this.taxExempt = taxExempt;
        return this;
    }

    @JsonProperty("phone")
    public Object getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Customer withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public Customer withTags(String tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("last_order_name")
    public String getLastOrderName() {
        return lastOrderName;
    }

    @JsonProperty("last_order_name")
    public void setLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
    }

    public Customer withLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("accepts_marketing_updated_at")
    public String getAcceptsMarketingUpdatedAt() {
        return acceptsMarketingUpdatedAt;
    }

    @JsonProperty("accepts_marketing_updated_at")
    public void setAcceptsMarketingUpdatedAt(String acceptsMarketingUpdatedAt) {
        this.acceptsMarketingUpdatedAt = acceptsMarketingUpdatedAt;
    }

    public Customer withAcceptsMarketingUpdatedAt(String acceptsMarketingUpdatedAt) {
        this.acceptsMarketingUpdatedAt = acceptsMarketingUpdatedAt;
        return this;
    }

    @JsonProperty("marketing_opt_in_level")
    public Object getMarketingOptInLevel() {
        return marketingOptInLevel;
    }

    @JsonProperty("marketing_opt_in_level")
    public void setMarketingOptInLevel(Object marketingOptInLevel) {
        this.marketingOptInLevel = marketingOptInLevel;
    }

    public Customer withMarketingOptInLevel(Object marketingOptInLevel) {
        this.marketingOptInLevel = marketingOptInLevel;
        return this;
    }

    @JsonProperty("tax_exemptions")
    public List<Object> getTaxExemptions() {
        return taxExemptions;
    }

    @JsonProperty("tax_exemptions")
    public void setTaxExemptions(List<Object> taxExemptions) {
        this.taxExemptions = taxExemptions;
    }

    public Customer withTaxExemptions(List<Object> taxExemptions) {
        this.taxExemptions = taxExemptions;
        return this;
    }

    @JsonProperty("admin_graphql_api_id")
    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    @JsonProperty("admin_graphql_api_id")
    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    public Customer withAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
        return this;
    }

    @JsonProperty("default_address")
    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    @JsonProperty("default_address")
    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public Customer withDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
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

    public Customer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("email", email).append("acceptsMarketing", acceptsMarketing).append("createdAt", createdAt).append("updatedAt", updatedAt).append("firstName", firstName).append("lastName", lastName).append("ordersCount", ordersCount).append("state", state).append("totalSpent", totalSpent).append("lastOrderId", lastOrderId).append("note", note).append("verifiedEmail", verifiedEmail).append("multipassIdentifier", multipassIdentifier).append("taxExempt", taxExempt).append("phone", phone).append("tags", tags).append("lastOrderName", lastOrderName).append("currency", currency).append("acceptsMarketingUpdatedAt", acceptsMarketingUpdatedAt).append("marketingOptInLevel", marketingOptInLevel).append("taxExemptions", taxExemptions).append("adminGraphqlApiId", adminGraphqlApiId).append("defaultAddress", defaultAddress).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(phone).append(state).append(lastOrderId).append(currency).append(id).append(acceptsMarketingUpdatedAt).append(createdAt).append(acceptsMarketing).append(firstName).append(note).append(taxExempt).append(ordersCount).append(tags).append(lastName).append(totalSpent).append(taxExemptions).append(adminGraphqlApiId).append(multipassIdentifier).append(marketingOptInLevel).append(verifiedEmail).append(updatedAt).append(email).append(additionalProperties).append(lastOrderName).append(defaultAddress).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customer) == false) {
            return false;
        }
        Customer rhs = ((Customer) other);
        return new EqualsBuilder().append(phone, rhs.phone).append(state, rhs.state).append(lastOrderId, rhs.lastOrderId).append(currency, rhs.currency).append(id, rhs.id).append(acceptsMarketingUpdatedAt, rhs.acceptsMarketingUpdatedAt).append(createdAt, rhs.createdAt).append(acceptsMarketing, rhs.acceptsMarketing).append(firstName, rhs.firstName).append(note, rhs.note).append(taxExempt, rhs.taxExempt).append(ordersCount, rhs.ordersCount).append(tags, rhs.tags).append(lastName, rhs.lastName).append(totalSpent, rhs.totalSpent).append(taxExemptions, rhs.taxExemptions).append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(multipassIdentifier, rhs.multipassIdentifier).append(marketingOptInLevel, rhs.marketingOptInLevel).append(verifiedEmail, rhs.verifiedEmail).append(updatedAt, rhs.updatedAt).append(email, rhs.email).append(additionalProperties, rhs.additionalProperties).append(lastOrderName, rhs.lastOrderName).append(defaultAddress, rhs.defaultAddress).isEquals();
    }

}
