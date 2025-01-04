
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
    "testcase",
    "authorization"
})
public class Receipt implements Serializable
{

    @JsonProperty("testcase")
    private boolean testcase;
    @JsonProperty("authorization")
    private String authorization;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 900936529155295336L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Receipt() {
    }

    /**
     * 
     * @param authorization
     * @param testcase
     */
    public Receipt(boolean testcase, String authorization) {
        super();
        this.testcase = testcase;
        this.authorization = authorization;
    }

    @JsonProperty("testcase")
    public boolean isTestcase() {
        return testcase;
    }

    @JsonProperty("testcase")
    public void setTestcase(boolean testcase) {
        this.testcase = testcase;
    }

    public Receipt withTestcase(boolean testcase) {
        this.testcase = testcase;
        return this;
    }

    @JsonProperty("authorization")
    public String getAuthorization() {
        return authorization;
    }

    @JsonProperty("authorization")
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public Receipt withAuthorization(String authorization) {
        this.authorization = authorization;
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
        return new ToStringBuilder(this).append("testcase", testcase).append("authorization", authorization).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(authorization).append(testcase).toHashCode();
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
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(authorization, rhs.authorization).append(testcase, rhs.testcase).isEquals();
    }

}
