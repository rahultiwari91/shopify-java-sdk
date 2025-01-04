
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
    "variant_id",
    "title",
    "quantity",
    "sku",
    "variant_title",
    "vendor",
    "fulfillment_service",
    "product_id",
    "requires_shipping",
    "taxable",
    "gift_card",
    "name",
    "variant_inventory_management",
    "properties",
    "product_exists",
    "fulfillable_quantity",
    "grams",
    "price",
    "total_discount",
    "fulfillment_status",
    "price_set",
    "total_discount_set",
    "discount_allocations",
    "admin_graphql_api_id",
    "tax_lines"
})
public class LineItem implements Serializable
{

    @JsonProperty("id")
    private long id;
    @JsonProperty("variant_id")
    private long variantId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("quantity")
    private long quantity;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("variant_title")
    private String variantTitle;
    @JsonProperty("vendor")
    private Object vendor;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("product_id")
    private long productId;
    @JsonProperty("requires_shipping")
    private boolean requiresShipping;
    @JsonProperty("taxable")
    private boolean taxable;
    @JsonProperty("gift_card")
    private boolean giftCard;
    @JsonProperty("name")
    private String name;
    @JsonProperty("variant_inventory_management")
    private String variantInventoryManagement;
    @JsonProperty("properties")
    private List<Property> properties = new ArrayList<Property>();
    @JsonProperty("product_exists")
    private boolean productExists;
    @JsonProperty("fulfillable_quantity")
    private long fulfillableQuantity;
    @JsonProperty("grams")
    private long grams;
    @JsonProperty("price")
    private String price;
    @JsonProperty("total_discount")
    private String totalDiscount;
    @JsonProperty("fulfillment_status")
    private Object fulfillmentStatus;
    @JsonProperty("price_set")
    private PriceSet priceSet;
    @JsonProperty("total_discount_set")
    private TotalDiscountSet totalDiscountSet;
    @JsonProperty("discount_allocations")
    private List<Object> discountAllocations = new ArrayList<Object>();
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("tax_lines")
    private List<TaxLine> taxLines = new ArrayList<TaxLine>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6443696520297363436L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LineItem() {
    }

    /**
     * 
     * @param productExists
     * @param variantInventoryManagement
     * @param fulfillmentService
     * @param totalDiscount
     * @param taxable
     * @param vendor
     * @param adminGraphqlApiId
     * @param taxLines
     * @param properties
     * @param fulfillableQuantity
     * @param variantId
     * @param sku
     * @param productId
     * @param id
     * @param title
     * @param discountAllocations
     * @param price
     * @param giftCard
     * @param name
     * @param grams
     * @param quantity
     * @param priceSet
     * @param requiresShipping
     * @param totalDiscountSet
     * @param fulfillmentStatus
     * @param variantTitle
     */
    public LineItem(long id, long variantId, String title, long quantity, String sku, String variantTitle, Object vendor, String fulfillmentService, long productId, boolean requiresShipping, boolean taxable, boolean giftCard, String name, String variantInventoryManagement, List<Property> properties, boolean productExists, long fulfillableQuantity, long grams, String price, String totalDiscount, Object fulfillmentStatus, PriceSet priceSet, TotalDiscountSet totalDiscountSet, List<Object> discountAllocations, String adminGraphqlApiId, List<TaxLine> taxLines) {
        super();
        this.id = id;
        this.variantId = variantId;
        this.title = title;
        this.quantity = quantity;
        this.sku = sku;
        this.variantTitle = variantTitle;
        this.vendor = vendor;
        this.fulfillmentService = fulfillmentService;
        this.productId = productId;
        this.requiresShipping = requiresShipping;
        this.taxable = taxable;
        this.giftCard = giftCard;
        this.name = name;
        this.variantInventoryManagement = variantInventoryManagement;
        this.properties = properties;
        this.productExists = productExists;
        this.fulfillableQuantity = fulfillableQuantity;
        this.grams = grams;
        this.price = price;
        this.totalDiscount = totalDiscount;
        this.fulfillmentStatus = fulfillmentStatus;
        this.priceSet = priceSet;
        this.totalDiscountSet = totalDiscountSet;
        this.discountAllocations = discountAllocations;
        this.adminGraphqlApiId = adminGraphqlApiId;
        this.taxLines = taxLines;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public LineItem withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("variant_id")
    public long getVariantId() {
        return variantId;
    }

    @JsonProperty("variant_id")
    public void setVariantId(long variantId) {
        this.variantId = variantId;
    }

    public LineItem withVariantId(long variantId) {
        this.variantId = variantId;
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

    public LineItem withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public LineItem withQuantity(long quantity) {
        this.quantity = quantity;
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

    public LineItem withSku(String sku) {
        this.sku = sku;
        return this;
    }

    @JsonProperty("variant_title")
    public String getVariantTitle() {
        return variantTitle;
    }

    @JsonProperty("variant_title")
    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
    }

    public LineItem withVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
        return this;
    }

    @JsonProperty("vendor")
    public Object getVendor() {
        return vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public LineItem withVendor(Object vendor) {
        this.vendor = vendor;
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

    public LineItem withFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
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

    public LineItem withProductId(long productId) {
        this.productId = productId;
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

    public LineItem withRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
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

    public LineItem withTaxable(boolean taxable) {
        this.taxable = taxable;
        return this;
    }

    @JsonProperty("gift_card")
    public boolean isGiftCard() {
        return giftCard;
    }

    @JsonProperty("gift_card")
    public void setGiftCard(boolean giftCard) {
        this.giftCard = giftCard;
    }

    public LineItem withGiftCard(boolean giftCard) {
        this.giftCard = giftCard;
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

    public LineItem withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("variant_inventory_management")
    public String getVariantInventoryManagement() {
        return variantInventoryManagement;
    }

    @JsonProperty("variant_inventory_management")
    public void setVariantInventoryManagement(String variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
    }

    public LineItem withVariantInventoryManagement(String variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
        return this;
    }

    @JsonProperty("properties")
    public List<Property> getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public LineItem withProperties(List<Property> properties) {
        this.properties = properties;
        return this;
    }

    @JsonProperty("product_exists")
    public boolean isProductExists() {
        return productExists;
    }

    @JsonProperty("product_exists")
    public void setProductExists(boolean productExists) {
        this.productExists = productExists;
    }

    public LineItem withProductExists(boolean productExists) {
        this.productExists = productExists;
        return this;
    }

    @JsonProperty("fulfillable_quantity")
    public long getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    @JsonProperty("fulfillable_quantity")
    public void setFulfillableQuantity(long fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public LineItem withFulfillableQuantity(long fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
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

    public LineItem withGrams(long grams) {
        this.grams = grams;
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

    public LineItem withPrice(String price) {
        this.price = price;
        return this;
    }

    @JsonProperty("total_discount")
    public String getTotalDiscount() {
        return totalDiscount;
    }

    @JsonProperty("total_discount")
    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public LineItem withTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
        return this;
    }

    @JsonProperty("fulfillment_status")
    public Object getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    @JsonProperty("fulfillment_status")
    public void setFulfillmentStatus(Object fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public LineItem withFulfillmentStatus(Object fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
        return this;
    }

    @JsonProperty("price_set")
    public PriceSet getPriceSet() {
        return priceSet;
    }

    @JsonProperty("price_set")
    public void setPriceSet(PriceSet priceSet) {
        this.priceSet = priceSet;
    }

    public LineItem withPriceSet(PriceSet priceSet) {
        this.priceSet = priceSet;
        return this;
    }

    @JsonProperty("total_discount_set")
    public TotalDiscountSet getTotalDiscountSet() {
        return totalDiscountSet;
    }

    @JsonProperty("total_discount_set")
    public void setTotalDiscountSet(TotalDiscountSet totalDiscountSet) {
        this.totalDiscountSet = totalDiscountSet;
    }

    public LineItem withTotalDiscountSet(TotalDiscountSet totalDiscountSet) {
        this.totalDiscountSet = totalDiscountSet;
        return this;
    }

    @JsonProperty("discount_allocations")
    public List<Object> getDiscountAllocations() {
        return discountAllocations;
    }

    @JsonProperty("discount_allocations")
    public void setDiscountAllocations(List<Object> discountAllocations) {
        this.discountAllocations = discountAllocations;
    }

    public LineItem withDiscountAllocations(List<Object> discountAllocations) {
        this.discountAllocations = discountAllocations;
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

    public LineItem withAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
        return this;
    }

    @JsonProperty("tax_lines")
    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    @JsonProperty("tax_lines")
    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public LineItem withTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
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

    public LineItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("variantId", variantId).append("title", title).append("quantity", quantity).append("sku", sku).append("variantTitle", variantTitle).append("vendor", vendor).append("fulfillmentService", fulfillmentService).append("productId", productId).append("requiresShipping", requiresShipping).append("taxable", taxable).append("giftCard", giftCard).append("name", name).append("variantInventoryManagement", variantInventoryManagement).append("properties", properties).append("productExists", productExists).append("fulfillableQuantity", fulfillableQuantity).append("grams", grams).append("price", price).append("totalDiscount", totalDiscount).append("fulfillmentStatus", fulfillmentStatus).append("priceSet", priceSet).append("totalDiscountSet", totalDiscountSet).append("discountAllocations", discountAllocations).append("adminGraphqlApiId", adminGraphqlApiId).append("taxLines", taxLines).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(variantInventoryManagement).append(taxLines).append(variantId).append(id).append(title).append(discountAllocations).append(name).append(quantity).append(requiresShipping).append(fulfillmentStatus).append(productExists).append(fulfillmentService).append(totalDiscount).append(taxable).append(vendor).append(adminGraphqlApiId).append(properties).append(fulfillableQuantity).append(sku).append(productId).append(price).append(giftCard).append(additionalProperties).append(grams).append(priceSet).append(totalDiscountSet).append(variantTitle).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineItem) == false) {
            return false;
        }
        LineItem rhs = ((LineItem) other);
        return new EqualsBuilder().append(variantInventoryManagement, rhs.variantInventoryManagement).append(taxLines, rhs.taxLines).append(variantId, rhs.variantId).append(id, rhs.id).append(title, rhs.title).append(discountAllocations, rhs.discountAllocations).append(name, rhs.name).append(quantity, rhs.quantity).append(requiresShipping, rhs.requiresShipping).append(fulfillmentStatus, rhs.fulfillmentStatus).append(productExists, rhs.productExists).append(fulfillmentService, rhs.fulfillmentService).append(totalDiscount, rhs.totalDiscount).append(taxable, rhs.taxable).append(vendor, rhs.vendor).append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(properties, rhs.properties).append(fulfillableQuantity, rhs.fulfillableQuantity).append(sku, rhs.sku).append(productId, rhs.productId).append(price, rhs.price).append(giftCard, rhs.giftCard).append(additionalProperties, rhs.additionalProperties).append(grams, rhs.grams).append(priceSet, rhs.priceSet).append(totalDiscountSet, rhs.totalDiscountSet).append(variantTitle, rhs.variantTitle).isEquals();
    }

}
