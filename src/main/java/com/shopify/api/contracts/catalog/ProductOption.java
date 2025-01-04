
package com.shopify.api.contracts.catalog;

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
    "product_id",
    "name",
    "position",
    "values"
})
public class ProductOption implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("product_id")
    private long productId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("position")
    private long position;
    @JsonProperty("values")
    private List<String> values = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8537189905955645047L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductOption() {
    }

    /**
     * 
     * @param position
     * @param id
     * @param values
     * @param name
     * @param productId
     */
    public ProductOption(long id, long productId, String name, long position, List<String> values) {
        super();
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.position = position;
        this.values = values;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public ProductOption withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("product_id")
    public long getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(long productId) {
        this.productId = productId;
    }

    public ProductOption withProductId(long productId) {
        this.productId = productId;
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

    public ProductOption withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("position")
    public long getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(long position) {
        this.position = position;
    }

    public ProductOption withPosition(long position) {
        this.position = position;
        return this;
    }

    @JsonProperty("values")
    public List<String> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
    }

    public ProductOption withValues(List<String> values) {
        this.values = values;
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

    public ProductOption withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("productId", productId).append("name", name).append("position", position).append("values", values).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(position).append(id).append(values).append(additionalProperties).append(name).append(productId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductOption) == false) {
            return false;
        }
        ProductOption rhs = ((ProductOption) other);
        return new EqualsBuilder().append(position, rhs.position).append(id, rhs.id).append(values, rhs.values).append(additionalProperties, rhs.additionalProperties).append(name, rhs.name).append(productId, rhs.productId).isEquals();
    }

}
