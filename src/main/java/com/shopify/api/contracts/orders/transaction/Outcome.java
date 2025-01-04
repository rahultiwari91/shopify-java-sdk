
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
    "network_status",
    "reason",
    "risk_level",
    "risk_score",
    "seller_message",
    "type"
})
public class Outcome implements Serializable
{

    @JsonProperty("network_status")
    private String networkStatus;
    @JsonProperty("reason")
    private Object reason;
    @JsonProperty("risk_level")
    private String riskLevel;
    @JsonProperty("risk_score")
    private long riskScore;
    @JsonProperty("seller_message")
    private String sellerMessage;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3479964931368795436L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Outcome() {
    }

    /**
     * 
     * @param riskLevel
     * @param reason
     * @param networkStatus
     * @param riskScore
     * @param type
     * @param sellerMessage
     */
    public Outcome(String networkStatus, Object reason, String riskLevel, long riskScore, String sellerMessage, String type) {
        super();
        this.networkStatus = networkStatus;
        this.reason = reason;
        this.riskLevel = riskLevel;
        this.riskScore = riskScore;
        this.sellerMessage = sellerMessage;
        this.type = type;
    }

    @JsonProperty("network_status")
    public String getNetworkStatus() {
        return networkStatus;
    }

    @JsonProperty("network_status")
    public void setNetworkStatus(String networkStatus) {
        this.networkStatus = networkStatus;
    }

    public Outcome withNetworkStatus(String networkStatus) {
        this.networkStatus = networkStatus;
        return this;
    }

    @JsonProperty("reason")
    public Object getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(Object reason) {
        this.reason = reason;
    }

    public Outcome withReason(Object reason) {
        this.reason = reason;
        return this;
    }

    @JsonProperty("risk_level")
    public String getRiskLevel() {
        return riskLevel;
    }

    @JsonProperty("risk_level")
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public Outcome withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    @JsonProperty("risk_score")
    public long getRiskScore() {
        return riskScore;
    }

    @JsonProperty("risk_score")
    public void setRiskScore(long riskScore) {
        this.riskScore = riskScore;
    }

    public Outcome withRiskScore(long riskScore) {
        this.riskScore = riskScore;
        return this;
    }

    @JsonProperty("seller_message")
    public String getSellerMessage() {
        return sellerMessage;
    }

    @JsonProperty("seller_message")
    public void setSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage;
    }

    public Outcome withSellerMessage(String sellerMessage) {
        this.sellerMessage = sellerMessage;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Outcome withType(String type) {
        this.type = type;
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

    public Outcome withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("networkStatus", networkStatus).append("reason", reason).append("riskLevel", riskLevel).append("riskScore", riskScore).append("sellerMessage", sellerMessage).append("type", type).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(riskLevel).append(reason).append(additionalProperties).append(networkStatus).append(riskScore).append(type).append(sellerMessage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Outcome) == false) {
            return false;
        }
        Outcome rhs = ((Outcome) other);
        return new EqualsBuilder().append(riskLevel, rhs.riskLevel).append(reason, rhs.reason).append(additionalProperties, rhs.additionalProperties).append(networkStatus, rhs.networkStatus).append(riskScore, rhs.riskScore).append(type, rhs.type).append(sellerMessage, rhs.sellerMessage).isEquals();
    }

}
