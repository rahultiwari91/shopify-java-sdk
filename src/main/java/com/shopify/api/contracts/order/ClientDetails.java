
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
    "browser_ip",
    "accept_language",
    "user_agent",
    "session_hash",
    "browser_width",
    "browser_height"
})
public class ClientDetails implements Serializable
{

    @JsonProperty("browser_ip")
    private String browserIp;
    @JsonProperty("accept_language")
    private Object acceptLanguage;
    @JsonProperty("user_agent")
    private Object userAgent;
    @JsonProperty("session_hash")
    private Object sessionHash;
    @JsonProperty("browser_width")
    private Object browserWidth;
    @JsonProperty("browser_height")
    private Object browserHeight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4233056419255911325L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClientDetails() {
    }

    /**
     * 
     * @param browserHeight
     * @param acceptLanguage
     * @param browserIp
     * @param userAgent
     * @param browserWidth
     * @param sessionHash
     */
    public ClientDetails(String browserIp, Object acceptLanguage, Object userAgent, Object sessionHash, Object browserWidth, Object browserHeight) {
        super();
        this.browserIp = browserIp;
        this.acceptLanguage = acceptLanguage;
        this.userAgent = userAgent;
        this.sessionHash = sessionHash;
        this.browserWidth = browserWidth;
        this.browserHeight = browserHeight;
    }

    @JsonProperty("browser_ip")
    public String getBrowserIp() {
        return browserIp;
    }

    @JsonProperty("browser_ip")
    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public ClientDetails withBrowserIp(String browserIp) {
        this.browserIp = browserIp;
        return this;
    }

    @JsonProperty("accept_language")
    public Object getAcceptLanguage() {
        return acceptLanguage;
    }

    @JsonProperty("accept_language")
    public void setAcceptLanguage(Object acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public ClientDetails withAcceptLanguage(Object acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    @JsonProperty("user_agent")
    public Object getUserAgent() {
        return userAgent;
    }

    @JsonProperty("user_agent")
    public void setUserAgent(Object userAgent) {
        this.userAgent = userAgent;
    }

    public ClientDetails withUserAgent(Object userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    @JsonProperty("session_hash")
    public Object getSessionHash() {
        return sessionHash;
    }

    @JsonProperty("session_hash")
    public void setSessionHash(Object sessionHash) {
        this.sessionHash = sessionHash;
    }

    public ClientDetails withSessionHash(Object sessionHash) {
        this.sessionHash = sessionHash;
        return this;
    }

    @JsonProperty("browser_width")
    public Object getBrowserWidth() {
        return browserWidth;
    }

    @JsonProperty("browser_width")
    public void setBrowserWidth(Object browserWidth) {
        this.browserWidth = browserWidth;
    }

    public ClientDetails withBrowserWidth(Object browserWidth) {
        this.browserWidth = browserWidth;
        return this;
    }

    @JsonProperty("browser_height")
    public Object getBrowserHeight() {
        return browserHeight;
    }

    @JsonProperty("browser_height")
    public void setBrowserHeight(Object browserHeight) {
        this.browserHeight = browserHeight;
    }

    public ClientDetails withBrowserHeight(Object browserHeight) {
        this.browserHeight = browserHeight;
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

    public ClientDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("browserIp", browserIp).append("acceptLanguage", acceptLanguage).append("userAgent", userAgent).append("sessionHash", sessionHash).append("browserWidth", browserWidth).append("browserHeight", browserHeight).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(browserHeight).append(acceptLanguage).append(browserIp).append(userAgent).append(additionalProperties).append(browserWidth).append(sessionHash).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientDetails) == false) {
            return false;
        }
        ClientDetails rhs = ((ClientDetails) other);
        return new EqualsBuilder().append(browserHeight, rhs.browserHeight).append(acceptLanguage, rhs.acceptLanguage).append(browserIp, rhs.browserIp).append(userAgent, rhs.userAgent).append(additionalProperties, rhs.additionalProperties).append(browserWidth, rhs.browserWidth).append(sessionHash, rhs.sessionHash).isEquals();
    }

}
