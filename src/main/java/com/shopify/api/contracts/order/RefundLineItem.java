
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
@JsonPropertyOrder({ "id", "quantity", "line_item_id", "location_id", "restock_type", "subtotal", "total_tax",
		"subtotal_set", "total_tax_set", "line_item" })
public class RefundLineItem implements Serializable {

	@JsonProperty("id")
	private long id;
	@JsonProperty("quantity")
	private long quantity;
	@JsonProperty("line_item_id")
	private long lineItemId;
	@JsonProperty("location_id")
	private long locationId;
	@JsonProperty("restock_type")
	private String restockType;
	@JsonProperty("subtotal")
	private double subtotal;
	@JsonProperty("total_tax")
	private double totalTax;
	@JsonProperty("subtotal_set")
	private SubtotalSet subtotalSet;
	@JsonProperty("total_tax_set")
	private TotalTaxSet totalTaxSet;
	@JsonProperty("line_item")
	private LineItem lineItem;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5240564351391272612L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public RefundLineItem() {
	}

	/**
	 * 
	 * @param id
	 * @param restockType
	 * @param locationId
	 * @param lineItem
	 * @param quantity
	 * @param totalTax
	 * @param lineItemId
	 * @param subtotal
	 * @param totalTaxSet
	 * @param subtotalSet
	 */
	public RefundLineItem(long id, long quantity, long lineItemId, long locationId, String restockType, double subtotal,
			double totalTax, SubtotalSet subtotalSet, TotalTaxSet totalTaxSet, LineItem lineItem) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.lineItemId = lineItemId;
		this.locationId = locationId;
		this.restockType = restockType;
		this.subtotal = subtotal;
		this.totalTax = totalTax;
		this.subtotalSet = subtotalSet;
		this.totalTaxSet = totalTaxSet;
		this.lineItem = lineItem;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	public RefundLineItem withId(long id) {
		this.id = id;
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

	public RefundLineItem withQuantity(long quantity) {
		this.quantity = quantity;
		return this;
	}

	@JsonProperty("line_item_id")
	public long getLineItemId() {
		return lineItemId;
	}

	@JsonProperty("line_item_id")
	public void setLineItemId(long lineItemId) {
		this.lineItemId = lineItemId;
	}

	public RefundLineItem withLineItemId(long lineItemId) {
		this.lineItemId = lineItemId;
		return this;
	}

	@JsonProperty("location_id")
	public long getLocationId() {
		return locationId;
	}

	@JsonProperty("location_id")
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public RefundLineItem withLocationId(long locationId) {
		this.locationId = locationId;
		return this;
	}

	@JsonProperty("restock_type")
	public String getRestockType() {
		return restockType;
	}

	@JsonProperty("restock_type")
	public void setRestockType(String restockType) {
		this.restockType = restockType;
	}

	public RefundLineItem withRestockType(String restockType) {
		this.restockType = restockType;
		return this;
	}

	@JsonProperty("subtotal")
	public double getSubtotal() {
		return subtotal;
	}

	@JsonProperty("subtotal")
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public RefundLineItem withSubtotal(double subtotal) {
		this.subtotal = subtotal;
		return this;
	}

	@JsonProperty("total_tax")
	public double getTotalTax() {
		return totalTax;
	}

	@JsonProperty("total_tax")
	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public RefundLineItem withTotalTax(double totalTax) {
		this.totalTax = totalTax;
		return this;
	}

	@JsonProperty("subtotal_set")
	public SubtotalSet getSubtotalSet() {
		return subtotalSet;
	}

	@JsonProperty("subtotal_set")
	public void setSubtotalSet(SubtotalSet subtotalSet) {
		this.subtotalSet = subtotalSet;
	}

	public RefundLineItem withSubtotalSet(SubtotalSet subtotalSet) {
		this.subtotalSet = subtotalSet;
		return this;
	}

	@JsonProperty("total_tax_set")
	public TotalTaxSet getTotalTaxSet() {
		return totalTaxSet;
	}

	@JsonProperty("total_tax_set")
	public void setTotalTaxSet(TotalTaxSet totalTaxSet) {
		this.totalTaxSet = totalTaxSet;
	}

	public RefundLineItem withTotalTaxSet(TotalTaxSet totalTaxSet) {
		this.totalTaxSet = totalTaxSet;
		return this;
	}

	@JsonProperty("line_item")
	public LineItem getLineItem() {
		return lineItem;
	}

	@JsonProperty("line_item")
	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public RefundLineItem withLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
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

	public RefundLineItem withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("quantity", quantity).append("lineItemId", lineItemId)
				.append("locationId", locationId).append("restockType", restockType).append("subtotal", subtotal)
				.append("totalTax", totalTax).append("subtotalSet", subtotalSet).append("totalTaxSet", totalTaxSet)
				.append("lineItem", lineItem).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(restockType).append(additionalProperties).append(locationId)
				.append(lineItem).append(quantity).append(totalTax).append(lineItemId).append(subtotal)
				.append(totalTaxSet).append(subtotalSet).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof RefundLineItem) == false) {
			return false;
		}
		RefundLineItem rhs = ((RefundLineItem) other);
		return new EqualsBuilder().append(id, rhs.id).append(restockType, rhs.restockType)
				.append(additionalProperties, rhs.additionalProperties).append(locationId, rhs.locationId)
				.append(lineItem, rhs.lineItem).append(quantity, rhs.quantity).append(totalTax, rhs.totalTax)
				.append(lineItemId, rhs.lineItemId).append(subtotal, rhs.subtotal).append(totalTaxSet, rhs.totalTaxSet)
				.append(subtotalSet, rhs.subtotalSet).isEquals();
	}

}
