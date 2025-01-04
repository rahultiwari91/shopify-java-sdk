
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
    "title",
    "price",
    "sku",
    "position",
    "inventory_policy",
    "compare_at_price",
    "fulfillment_service",
    "inventory_management",
    "option1",
    "option2",
    "option3",
    "created_at",
    "updated_at",
    "taxable",
    "barcode",
    "grams",
    "image_id",
    "weight",
    "weight_unit",
    "inventory_item_id",
    "inventory_quantity",
    "old_inventory_quantity",
    "requires_shipping",
    "admin_graphql_api_id",
    "presentment_prices"
})
public class ProductVariant implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("product_id")
    private long productId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private String price;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("position")
    private long position;
    @JsonProperty("inventory_policy")
    private String inventoryPolicy;
    @JsonProperty("compare_at_price")
    private Object compareAtPrice;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("inventory_management")
    private String inventoryManagement;
    @JsonProperty("option1")
    private String option1;
    @JsonProperty("option2")
    private Object option2;
    @JsonProperty("option3")
    private Object option3;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("taxable")
    private boolean taxable;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("grams")
    private long grams;
    @JsonProperty("image_id")
    private Object imageId;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("weight_unit")
    private String weightUnit;
    @JsonProperty("inventory_item_id")
    private long inventoryItemId;
    @JsonProperty("inventory_quantity")
    private long inventoryQuantity;
    @JsonProperty("old_inventory_quantity")
    private long oldInventoryQuantity;
    @JsonProperty("requires_shipping")
    private boolean requiresShipping;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("presentment_prices")
    private List<PresentmentPrice> presentmentPrices = new ArrayList<PresentmentPrice>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1592007514736221034L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductVariant() {
    }

    /**
     * 
     * @param position
     * @param weight
     * @param oldInventoryQuantity
     * @param inventoryPolicy
     * @param option1
     * @param id
     * @param option2
     * @param title
     * @param option3
     * @param imageId
     * @param createdAt
     * @param inventoryItemId
     * @param requiresShipping
     * @param compareAtPrice
     * @param fulfillmentService
     * @param taxable
     * @param weightUnit
     * @param inventoryManagement
     * @param adminGraphqlApiId
     * @param inventoryQuantity
     * @param barcode
     * @param sku
     * @param productId
     * @param updatedAt
     * @param price
     * @param grams
     * @param presentmentPrices
     */
    public ProductVariant(long id, long productId, String title, String price, String sku, long position, String inventoryPolicy, Object compareAtPrice, String fulfillmentService, String inventoryManagement, String option1, Object option2, Object option3, String createdAt, String updatedAt, boolean taxable, String barcode, long grams, Object imageId, double weight, String weightUnit, long inventoryItemId, long inventoryQuantity, long oldInventoryQuantity, boolean requiresShipping, String adminGraphqlApiId, List<PresentmentPrice> presentmentPrices) {
        super();
        this.id = id;
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.sku = sku;
        this.position = position;
        this.inventoryPolicy = inventoryPolicy;
        this.compareAtPrice = compareAtPrice;
        this.fulfillmentService = fulfillmentService;
        this.inventoryManagement = inventoryManagement;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.taxable = taxable;
        this.barcode = barcode;
        this.grams = grams;
        this.imageId = imageId;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.inventoryItemId = inventoryItemId;
        this.inventoryQuantity = inventoryQuantity;
        this.oldInventoryQuantity = oldInventoryQuantity;
        this.requiresShipping = requiresShipping;
        this.adminGraphqlApiId = adminGraphqlApiId;
        this.presentmentPrices = presentmentPrices;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public ProductVariant withId(long id) {
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

    public ProductVariant withProductId(long productId) {
        this.productId = productId;
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

    public ProductVariant withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    public ProductVariant withPrice(String price) {
        this.price = price;
        return this;
    }

    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    public ProductVariant withSku(String sku) {
        this.sku = sku;
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

    public ProductVariant withPosition(long position) {
        this.position = position;
        return this;
    }

    @JsonProperty("inventory_policy")
    public String getInventoryPolicy() {
        return inventoryPolicy;
    }

    @JsonProperty("inventory_policy")
    public void setInventoryPolicy(String inventoryPolicy) {
        this.inventoryPolicy = inventoryPolicy;
    }

    public ProductVariant withInventoryPolicy(String inventoryPolicy) {
        this.inventoryPolicy = inventoryPolicy;
        return this;
    }

    @JsonProperty("compare_at_price")
    public Object getCompareAtPrice() {
        return compareAtPrice;
    }

    @JsonProperty("compare_at_price")
    public void setCompareAtPrice(Object compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    public ProductVariant withCompareAtPrice(Object compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
        return this;
    }

    @JsonProperty("fulfillment_service")
    public String getFulfillmentService() {
        return fulfillmentService;
    }

    @JsonProperty("fulfillment_service")
    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public ProductVariant withFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
        return this;
    }

    @JsonProperty("inventory_management")
    public String getInventoryManagement() {
        return inventoryManagement;
    }

    @JsonProperty("inventory_management")
    public void setInventoryManagement(String inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    public ProductVariant withInventoryManagement(String inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
        return this;
    }

    @JsonProperty("option1")
    public String getOption1() {
        return option1;
    }

    @JsonProperty("option1")
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public ProductVariant withOption1(String option1) {
        this.option1 = option1;
        return this;
    }

    @JsonProperty("option2")
    public Object getOption2() {
        return option2;
    }

    @JsonProperty("option2")
    public void setOption2(Object option2) {
        this.option2 = option2;
    }

    public ProductVariant withOption2(Object option2) {
        this.option2 = option2;
        return this;
    }

    @JsonProperty("option3")
    public Object getOption3() {
        return option3;
    }

    @JsonProperty("option3")
    public void setOption3(Object option3) {
        this.option3 = option3;
    }

    public ProductVariant withOption3(Object option3) {
        this.option3 = option3;
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

    public ProductVariant withCreatedAt(String createdAt) {
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

    public ProductVariant withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("taxable")
    public boolean isTaxable() {
        return taxable;
    }

    @JsonProperty("taxable")
    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public ProductVariant withTaxable(boolean taxable) {
        this.taxable = taxable;
        return this;
    }

    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public ProductVariant withBarcode(String barcode) {
        this.barcode = barcode;
        return this;
    }

    @JsonProperty("grams")
    public long getGrams() {
        return grams;
    }

    @JsonProperty("grams")
    public void setGrams(long grams) {
        this.grams = grams;
    }

    public ProductVariant withGrams(long grams) {
        this.grams = grams;
        return this;
    }

    @JsonProperty("image_id")
    public Object getImageId() {
        return imageId;
    }

    @JsonProperty("image_id")
    public void setImageId(Object imageId) {
        this.imageId = imageId;
    }

    public ProductVariant withImageId(Object imageId) {
        this.imageId = imageId;
        return this;
    }

    @JsonProperty("weight")
    public double getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ProductVariant withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    @JsonProperty("weight_unit")
    public String getWeightUnit() {
        return weightUnit;
    }

    @JsonProperty("weight_unit")
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public ProductVariant withWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
        return this;
    }

    @JsonProperty("inventory_item_id")
    public long getInventoryItemId() {
        return inventoryItemId;
    }

    @JsonProperty("inventory_item_id")
    public void setInventoryItemId(long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public ProductVariant withInventoryItemId(long inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    @JsonProperty("inventory_quantity")
    public long getInventoryQuantity() {
        return inventoryQuantity;
    }

    @JsonProperty("inventory_quantity")
    public void setInventoryQuantity(long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public ProductVariant withInventoryQuantity(long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
        return this;
    }

    @JsonProperty("old_inventory_quantity")
    public long getOldInventoryQuantity() {
        return oldInventoryQuantity;
    }

    @JsonProperty("old_inventory_quantity")
    public void setOldInventoryQuantity(long oldInventoryQuantity) {
        this.oldInventoryQuantity = oldInventoryQuantity;
    }

    public ProductVariant withOldInventoryQuantity(long oldInventoryQuantity) {
        this.oldInventoryQuantity = oldInventoryQuantity;
        return this;
    }

    @JsonProperty("requires_shipping")
    public boolean isRequiresShipping() {
        return requiresShipping;
    }

    @JsonProperty("requires_shipping")
    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public ProductVariant withRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
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

    public ProductVariant withAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
        return this;
    }

    @JsonProperty("presentment_prices")
    public List<PresentmentPrice> getPresentmentPrices() {
        return presentmentPrices;
    }

    @JsonProperty("presentment_prices")
    public void setPresentmentPrices(List<PresentmentPrice> presentmentPrices) {
        this.presentmentPrices = presentmentPrices;
    }

    public ProductVariant withPresentmentPrices(List<PresentmentPrice> presentmentPrices) {
        this.presentmentPrices = presentmentPrices;
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

    public ProductVariant withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("productId", productId).append("title", title).append("price", price).append("sku", sku).append("position", position).append("inventoryPolicy", inventoryPolicy).append("compareAtPrice", compareAtPrice).append("fulfillmentService", fulfillmentService).append("inventoryManagement", inventoryManagement).append("option1", option1).append("option2", option2).append("option3", option3).append("createdAt", createdAt).append("updatedAt", updatedAt).append("taxable", taxable).append("barcode", barcode).append("grams", grams).append("imageId", imageId).append("weight", weight).append("weightUnit", weightUnit).append("inventoryItemId", inventoryItemId).append("inventoryQuantity", inventoryQuantity).append("oldInventoryQuantity", oldInventoryQuantity).append("requiresShipping", requiresShipping).append("adminGraphqlApiId", adminGraphqlApiId).append("presentmentPrices", presentmentPrices).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(position).append(weight).append(oldInventoryQuantity).append(inventoryPolicy).append(option1).append(id).append(option2).append(option3).append(title).append(imageId).append(createdAt).append(inventoryItemId).append(requiresShipping).append(compareAtPrice).append(fulfillmentService).append(weightUnit).append(taxable).append(inventoryManagement).append(adminGraphqlApiId).append(inventoryQuantity).append(barcode).append(sku).append(productId).append(updatedAt).append(price).append(additionalProperties).append(grams).append(presentmentPrices).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductVariant) == false) {
            return false;
        }
        ProductVariant rhs = ((ProductVariant) other);
        return new EqualsBuilder().append(position, rhs.position).append(weight, rhs.weight).append(oldInventoryQuantity, rhs.oldInventoryQuantity).append(inventoryPolicy, rhs.inventoryPolicy).append(option1, rhs.option1).append(id, rhs.id).append(option2, rhs.option2).append(option3, rhs.option3).append(title, rhs.title).append(imageId, rhs.imageId).append(createdAt, rhs.createdAt).append(inventoryItemId, rhs.inventoryItemId).append(requiresShipping, rhs.requiresShipping).append(compareAtPrice, rhs.compareAtPrice).append(fulfillmentService, rhs.fulfillmentService).append(weightUnit, rhs.weightUnit).append(taxable, rhs.taxable).append(inventoryManagement, rhs.inventoryManagement).append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(inventoryQuantity, rhs.inventoryQuantity).append(barcode, rhs.barcode).append(sku, rhs.sku).append(productId, rhs.productId).append(updatedAt, rhs.updatedAt).append(price, rhs.price).append(additionalProperties, rhs.additionalProperties).append(grams, rhs.grams).append(presentmentPrices, rhs.presentmentPrices).isEquals();
    }

}
