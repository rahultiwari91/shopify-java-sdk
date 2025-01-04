
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
    "type",
    "value",
    "value_type",
    "allocation_method",
    "target_selection",
    "target_type",
    "code"
})
public class DiscountApplication implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("value")
    private String value;
    @JsonProperty("value_type")
    private String valueType;
    @JsonProperty("allocation_method")
    private String allocationMethod;
    @JsonProperty("target_selection")
    private String targetSelection;
    @JsonProperty("target_type")
    private String targetType;
    @JsonProperty("code")
    private String code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 9137063591626762628L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscountApplication() {
    }

    /**
     * 
     * @param allocationMethod
     * @param value
     * @param targetSelection
     * @param valueType
     * @param code
     * @param type
     * @param targetType
     */
    public DiscountApplication(String type, String value, String valueType, String allocationMethod, String targetSelection, String targetType, String code) {
        super();
        this.type = type;
        this.value = value;
        this.valueType = valueType;
        this.allocationMethod = allocationMethod;
        this.targetSelection = targetSelection;
        this.targetType = targetType;
        this.code = code;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public DiscountApplication withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public DiscountApplication withValue(String value) {
        this.value = value;
        return this;
    }

    @JsonProperty("value_type")
    public String getValueType() {
        return valueType;
    }

    @JsonProperty("value_type")
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public DiscountApplication withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    @JsonProperty("allocation_method")
    public String getAllocationMethod() {
        return allocationMethod;
    }

    @JsonProperty("allocation_method")
    public void setAllocationMethod(String allocationMethod) {
        this.allocationMethod = allocationMethod;
    }

    public DiscountApplication withAllocationMethod(String allocationMethod) {
        this.allocationMethod = allocationMethod;
        return this;
    }

    @JsonProperty("target_selection")
    public String getTargetSelection() {
        return targetSelection;
    }

    @JsonProperty("target_selection")
    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    public DiscountApplication withTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
        return this;
    }

    @JsonProperty("target_type")
    public String getTargetType() {
        return targetType;
    }

    @JsonProperty("target_type")
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public DiscountApplication withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DiscountApplication withCode(String code) {
        this.code = code;
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

    public DiscountApplication withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("value", value).append("valueType", valueType).append("allocationMethod", allocationMethod).append("targetSelection", targetSelection).append("targetType", targetType).append("code", code).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allocationMethod).append(additionalProperties).append(value).append(targetSelection).append(valueType).append(code).append(type).append(targetType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscountApplication) == false) {
            return false;
        }
        DiscountApplication rhs = ((DiscountApplication) other);
        return new EqualsBuilder().append(allocationMethod, rhs.allocationMethod).append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).append(targetSelection, rhs.targetSelection).append(valueType, rhs.valueType).append(code, rhs.code).append(type, rhs.type).append(targetType, rhs.targetType).isEquals();
    }

}
