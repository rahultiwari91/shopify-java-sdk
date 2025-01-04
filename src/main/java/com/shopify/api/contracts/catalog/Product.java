
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
    "title",
    "body_html",
    "vendor",
    "product_type",
    "created_at",
    "handle",
    "updated_at",
    "published_at",
    "template_suffix",
    "tags",
    "published_scope",
    "admin_graphql_api_id",
    "variants",
    "options",
    "images",
    "image"
})
public class Product implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body_html")
    private String bodyHtml;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("product_type")
    private String productType;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("handle")
    private String handle;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("template_suffix")
    private Object templateSuffix;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("published_scope")
    private String publishedScope;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("variants")
    private List<ProductVariant> variants = new ArrayList<ProductVariant>();
    @JsonProperty("options")
    private List<ProductOption> options = new ArrayList<ProductOption>();
    @JsonProperty("images")
    private List<ProductImage> images = new ArrayList<ProductImage>();
    @JsonProperty("image")
    private ProductImage image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 129105075173625084L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param tags
     * @param publishedScope
     * @param handle
     * @param vendor
     * @param adminGraphqlApiId
     * @param image
     * @param templateSuffix
     * @param productType
     * @param id
     * @param updatedAt
     * @param publishedAt
     * @param title
     * @param bodyHtml
     * @param createdAt
     * @param images
     * @param variants
     * @param options
     */
    public Product(long id, String title, String bodyHtml, String vendor, String productType, String createdAt, String handle, String updatedAt, String publishedAt, Object templateSuffix, String tags, String publishedScope, String adminGraphqlApiId, List<ProductVariant> variants, List<ProductOption> options, List<ProductImage> images, ProductImage image) {
        super();
        this.id = id;
        this.title = title;
        this.bodyHtml = bodyHtml;
        this.vendor = vendor;
        this.productType = productType;
        this.createdAt = createdAt;
        this.handle = handle;
        this.updatedAt = updatedAt;
        this.publishedAt = publishedAt;
        this.templateSuffix = templateSuffix;
        this.tags = tags;
        this.publishedScope = publishedScope;
        this.adminGraphqlApiId = adminGraphqlApiId;
        this.variants = variants;
        this.options = options;
        this.images = images;
        this.image = image;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Product withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Product withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("body_html")
    public String getBodyHtml() {
        return bodyHtml;
    }

    @JsonProperty("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public Product withBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
        return this;
    }

    @JsonProperty("vendor")
    public String getVendor() {
        return vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public Product withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    @JsonProperty("product_type")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("product_type")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Product withProductType(String productType) {
        this.productType = productType;
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

    public Product withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("handle")
    public String getHandle() {
        return handle;
    }

    @JsonProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Product withHandle(String handle) {
        this.handle = handle;
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

    public Product withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Product withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @JsonProperty("template_suffix")
    public Object getTemplateSuffix() {
        return templateSuffix;
    }

    @JsonProperty("template_suffix")
    public void setTemplateSuffix(Object templateSuffix) {
        this.templateSuffix = templateSuffix;
    }

    public Product withTemplateSuffix(Object templateSuffix) {
        this.templateSuffix = templateSuffix;
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

    public Product withTags(String tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("published_scope")
    public String getPublishedScope() {
        return publishedScope;
    }

    @JsonProperty("published_scope")
    public void setPublishedScope(String publishedScope) {
        this.publishedScope = publishedScope;
    }

    public Product withPublishedScope(String publishedScope) {
        this.publishedScope = publishedScope;
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

    public Product withAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
        return this;
    }

    @JsonProperty("variants")
    public List<ProductVariant> getVariants() {
        return variants;
    }

    @JsonProperty("variants")
    public void setVariants(List<ProductVariant> variants) {
        this.variants = variants;
    }

    public Product withVariants(List<ProductVariant> variants) {
        this.variants = variants;
        return this;
    }

    @JsonProperty("options")
    public List<ProductOption> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<ProductOption> options) {
        this.options = options;
    }

    public Product withOptions(List<ProductOption> options) {
        this.options = options;
        return this;
    }

    @JsonProperty("images")
    public List<ProductImage> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<ProductImage> images) {
        this.images = images;
    }

    public Product withImages(List<ProductImage> images) {
        this.images = images;
        return this;
    }

    @JsonProperty("image")
    public ProductImage getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(ProductImage image) {
        this.image = image;
    }

    public Product withImage(ProductImage image) {
        this.image = image;
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

    public Product withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("title", title).append("bodyHtml", bodyHtml).append("vendor", vendor).append("productType", productType).append("createdAt", createdAt).append("handle", handle).append("updatedAt", updatedAt).append("publishedAt", publishedAt).append("templateSuffix", templateSuffix).append("tags", tags).append("publishedScope", publishedScope).append("adminGraphqlApiId", adminGraphqlApiId).append("variants", variants).append("options", options).append("images", images).append("image", image).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(publishedScope).append(tags).append(handle).append(vendor).append(adminGraphqlApiId).append(image).append(templateSuffix).append(productType).append(publishedAt).append(updatedAt).append(id).append(title).append(bodyHtml).append(additionalProperties).append(createdAt).append(images).append(variants).append(options).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Product) == false) {
            return false;
        }
        Product rhs = ((Product) other);
        return new EqualsBuilder().append(publishedScope, rhs.publishedScope).append(tags, rhs.tags).append(handle, rhs.handle).append(vendor, rhs.vendor).append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(image, rhs.image).append(templateSuffix, rhs.templateSuffix).append(productType, rhs.productType).append(publishedAt, rhs.publishedAt).append(updatedAt, rhs.updatedAt).append(id, rhs.id).append(title, rhs.title).append(bodyHtml, rhs.bodyHtml).append(additionalProperties, rhs.additionalProperties).append(createdAt, rhs.createdAt).append(images, rhs.images).append(variants, rhs.variants).append(options, rhs.options).isEquals();
    }

}
