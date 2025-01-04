
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
@JsonPropertyOrder({ "id", "order_id", "status", "created_at", "service", "updated_at", "tracking_company",
		"shipment_status", "location_id", "tracking_number", "tracking_numbers", "tracking_url", "tracking_urls",
		"receipt", "name", "admin_graphql_api_id", "line_items" })
public class Fulfillment implements Serializable {

	@JsonProperty("id")
	private long id;
	@JsonProperty("order_id")
	private long orderId;
	@JsonProperty("status")
	private String status;
	@JsonProperty("created_at")
	private String createdAt;
	@JsonProperty("service")
	private String service;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("tracking_company")
	private Object trackingCompany;
	@JsonProperty("shipment_status")
	private Object shipmentStatus;
	@JsonProperty("location_id")
	private long locationId;
	@JsonProperty("tracking_number")
	private String trackingNumber;
	@JsonProperty("tracking_numbers")
	private List<String> trackingNumbers = new ArrayList<String>();
	@JsonProperty("tracking_url")
	private String trackingUrl;
	@JsonProperty("tracking_urls")
	private List<String> trackingUrls = new ArrayList<String>();
	@JsonProperty("receipt")
	private Receipt receipt;
	@JsonProperty("name")
	private String name;
	@JsonProperty("admin_graphql_api_id")
	private String adminGraphqlApiId;
	@JsonProperty("line_items")
	private List<LineItem> lineItems = new ArrayList<LineItem>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -467352489804839909L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Fulfillment() {
	}

	/**
	 * 
	 * @param status
	 * @param shipmentStatus
	 * @param adminGraphqlApiId
	 * @param locationId
	 * @param trackingUrls
	 * @param receipt
	 * @param id
	 * @param updatedAt
	 * @param trackingCompany
	 * @param trackingUrl
	 * @param trackingNumber
	 * @param createdAt
	 * @param trackingNumbers
	 * @param name
	 * @param service
	 * @param lineItems
	 * @param orderId
	 */
	public Fulfillment(long id, long orderId, String status, String createdAt, String service, String updatedAt,
			Object trackingCompany, Object shipmentStatus, long locationId, String trackingNumber,
			List<String> trackingNumbers, String trackingUrl, List<String> trackingUrls, Receipt receipt, String name,
			String adminGraphqlApiId, List<LineItem> lineItems) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.status = status;
		this.createdAt = createdAt;
		this.service = service;
		this.updatedAt = updatedAt;
		this.trackingCompany = trackingCompany;
		this.shipmentStatus = shipmentStatus;
		this.locationId = locationId;
		this.trackingNumber = trackingNumber;
		this.trackingNumbers = trackingNumbers;
		this.trackingUrl = trackingUrl;
		this.trackingUrls = trackingUrls;
		this.receipt = receipt;
		this.name = name;
		this.adminGraphqlApiId = adminGraphqlApiId;
		this.lineItems = lineItems;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	public Fulfillment withId(long id) {
		this.id = id;
		return this;
	}

	@JsonProperty("order_id")
	public long getOrderId() {
		return orderId;
	}

	@JsonProperty("order_id")
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Fulfillment withOrderId(long orderId) {
		this.orderId = orderId;
		return this;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	public Fulfillment withStatus(String status) {
		this.status = status;
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

	public Fulfillment withCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	@JsonProperty("service")
	public String getService() {
		return service;
	}

	@JsonProperty("service")
	public void setService(String service) {
		this.service = service;
	}

	public Fulfillment withService(String service) {
		this.service = service;
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

	public Fulfillment withUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	@JsonProperty("tracking_company")
	public Object getTrackingCompany() {
		return trackingCompany;
	}

	@JsonProperty("tracking_company")
	public void setTrackingCompany(Object trackingCompany) {
		this.trackingCompany = trackingCompany;
	}

	public Fulfillment withTrackingCompany(Object trackingCompany) {
		this.trackingCompany = trackingCompany;
		return this;
	}

	@JsonProperty("shipment_status")
	public Object getShipmentStatus() {
		return shipmentStatus;
	}

	@JsonProperty("shipment_status")
	public void setShipmentStatus(Object shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public Fulfillment withShipmentStatus(Object shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
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

	public Fulfillment withLocationId(long locationId) {
		this.locationId = locationId;
		return this;
	}

	@JsonProperty("tracking_number")
	public String getTrackingNumber() {
		return trackingNumber;
	}

	@JsonProperty("tracking_number")
	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public Fulfillment withTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
		return this;
	}

	@JsonProperty("tracking_numbers")
	public List<String> getTrackingNumbers() {
		return trackingNumbers;
	}

	@JsonProperty("tracking_numbers")
	public void setTrackingNumbers(List<String> trackingNumbers) {
		this.trackingNumbers = trackingNumbers;
	}

	public Fulfillment withTrackingNumbers(List<String> trackingNumbers) {
		this.trackingNumbers = trackingNumbers;
		return this;
	}

	@JsonProperty("tracking_url")
	public String getTrackingUrl() {
		return trackingUrl;
	}

	@JsonProperty("tracking_url")
	public void setTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
	}

	public Fulfillment withTrackingUrl(String trackingUrl) {
		this.trackingUrl = trackingUrl;
		return this;
	}

	@JsonProperty("tracking_urls")
	public List<String> getTrackingUrls() {
		return trackingUrls;
	}

	@JsonProperty("tracking_urls")
	public void setTrackingUrls(List<String> trackingUrls) {
		this.trackingUrls = trackingUrls;
	}

	public Fulfillment withTrackingUrls(List<String> trackingUrls) {
		this.trackingUrls = trackingUrls;
		return this;
	}

	@JsonProperty("receipt")
	public Receipt getReceipt() {
		return receipt;
	}

	@JsonProperty("receipt")
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	public Fulfillment withReceipt(Receipt receipt) {
		this.receipt = receipt;
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

	public Fulfillment withName(String name) {
		this.name = name;
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

	public Fulfillment withAdminGraphqlApiId(String adminGraphqlApiId) {
		this.adminGraphqlApiId = adminGraphqlApiId;
		return this;
	}

	@JsonProperty("line_items")
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	@JsonProperty("line_items")
	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Fulfillment withLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
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

	public Fulfillment withAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("orderId", orderId).append("status", status)
				.append("createdAt", createdAt).append("service", service).append("updatedAt", updatedAt)
				.append("trackingCompany", trackingCompany).append("shipmentStatus", shipmentStatus)
				.append("locationId", locationId).append("trackingNumber", trackingNumber)
				.append("trackingNumbers", trackingNumbers).append("trackingUrl", trackingUrl)
				.append("trackingUrls", trackingUrls).append("receipt", receipt).append("name", name)
				.append("adminGraphqlApiId", adminGraphqlApiId).append("lineItems", lineItems)
				.append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(shipmentStatus).append(status).append(adminGraphqlApiId).append(locationId)
				.append(trackingUrls).append(receipt).append(updatedAt).append(id).append(trackingCompany)
				.append(trackingUrl).append(trackingNumber).append(additionalProperties).append(trackingNumbers)
				.append(createdAt).append(name).append(service).append(lineItems).append(orderId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Fulfillment) == false) {
			return false;
		}
		Fulfillment rhs = ((Fulfillment) other);
		return new EqualsBuilder().append(shipmentStatus, rhs.shipmentStatus).append(status, rhs.status)
				.append(adminGraphqlApiId, rhs.adminGraphqlApiId).append(locationId, rhs.locationId)
				.append(trackingUrls, rhs.trackingUrls).append(receipt, rhs.receipt).append(updatedAt, rhs.updatedAt)
				.append(id, rhs.id).append(trackingCompany, rhs.trackingCompany).append(trackingUrl, rhs.trackingUrl)
				.append(trackingNumber, rhs.trackingNumber).append(additionalProperties, rhs.additionalProperties)
				.append(trackingNumbers, rhs.trackingNumbers).append(createdAt, rhs.createdAt).append(name, rhs.name)
				.append(service, rhs.service).append(lineItems, rhs.lineItems).append(orderId, rhs.orderId).isEquals();
	}

}
