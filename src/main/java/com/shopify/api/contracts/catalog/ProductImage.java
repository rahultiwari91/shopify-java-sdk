
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
    "position",
    "created_at",
    "updated_at",
    "alt",
    "width",
    "height",
    "src",
    "variant_ids",
    "admin_graphql_api_id"
})
public class ProductImage implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("product_id")
    private long productId;
    @JsonProperty("position")
    private long position;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("alt")
    private Object alt;
    @JsonProperty("width")
    private long width;
    @JsonProperty("height")
    private long height;
    @JsonProperty("src")
    private String src;
    @JsonProperty("variant_ids")
    private List<Long> variantIds = new ArrayList<Long>();
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6745219126350212731L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductImage() {
    }

    /**
     * 
     * @param updatedAt
     * @param position
     * @param id
     * @param height
     * @param alt
     * @param createdAt
     * @param adminGraphqlApiId
     * @param width
     * @param src
     * @param variantIds
     * @param productId
     */
    public ProductImage(long id, long productId, long position, String createdAt, String updatedAt, Object alt, long width, long height, String src, List<Long> variantIds, String adminGraphqlApiId) {
        super();
        this.id = id;
        this.productId = productId;
        this.position = position;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.alt = alt;
        this.width = width;
        this.height = height;
        this.src = src;
        this.variantIds = variantIds;
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public ProductImage withId(long id) {
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

    public ProductImage withProductId(long productId) {
        this.productId = productId;
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

    public ProductImage withPosition(long position) {
        this.position = position;
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

    public ProductImage withCreatedAt(String createdAt) {
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

    public ProductImage withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("alt")
    public Object getAlt() {
        return alt;
    }

    @JsonProperty("alt")
    public void setAlt(Object alt) {
        this.alt = alt;
    }

    public ProductImage withAlt(Object alt) {
        this.alt = alt;
        return this;
    }

    @JsonProperty("width")
    public long getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(long width) {
        this.width = width;
    }

    public ProductImage withWidth(long width) {
        this.width = width;
        return this;
    }

    @JsonProperty("height")
    public long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(long height) {
        this.height = height;
    }

    public ProductImage withHeight(long height) {
        this.height = height;
        return this;
    }

    @JsonProperty("src")
    public String getSrc() {
        return src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    public ProductImage withSrc(String src) {
        this.src = src;
        return this;
    }

    @JsonProperty("variant_ids")
    public List<Long> getVariantIds() {
        return variantIds;
    }

    @JsonProperty("variant_ids")
    public void setVariantIds(List<Long> variantIds) {
        this.variantIds = variantIds;
    }

    public ProductImage withVariantIds(List<Long> variantIds) {
        this.variantIds = variantIds;
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

    public ProductImage withAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
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

    public ProductImage withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("productId", productId).append("position", position).append("createdAt", createdAt).append("updatedAt", updatedAt).append("alt", alt).append("width", width).append("height", height).append("src", src).append("variantIds", variantIds).append("adminGraphqlApiId", adminGraphqlApiId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(position).append(adminGraphqlApiId).append(width).append(variantIds).append(productId).append(updatedAt).append(id).append(height).append(additionalProperties).append(alt).append(createdAt).append(src).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductImage) == false) {
            return false;
        }
        ProductImage rhs = ((ProductImage) other);
        return new EqualsBuilder().append(position, rhs.position).append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(width, rhs.width).append(variantIds, rhs.variantIds).append(productId, rhs.productId).append(updatedAt, rhs.updatedAt).append(id, rhs.id).append(height, rhs.height).append(additionalProperties, rhs.additionalProperties).append(alt, rhs.alt).append(createdAt, rhs.createdAt).append(src, rhs.src).isEquals();
    }

}
