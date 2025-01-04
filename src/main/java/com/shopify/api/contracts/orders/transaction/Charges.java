
package com.shopify.api.contracts.orders.transaction;

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
    "object",
    "data",
    "has_more",
    "total_count",
    "url"
})
public class Charges implements Serializable
{

    @JsonProperty("object")
    private String object;
    @JsonProperty("data")
    private List<Datum> data = new ArrayList<Datum>();
    @JsonProperty("has_more")
    private boolean hasMore;
    @JsonProperty("total_count")
    private long totalCount;
    @JsonProperty("url")
    private String url;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6018638261357033824L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Charges() {
    }

    /**
     * 
     * @param hasMore
     * @param totalCount
     * @param data
     * @param object
     * @param url
     */
    public Charges(String object, List<Datum> data, boolean hasMore, long totalCount, String url) {
        super();
        this.object = object;
        this.data = data;
        this.hasMore = hasMore;
        this.totalCount = totalCount;
        this.url = url;
    }

    @JsonProperty("object")
    public String getObject() {
        return object;
    }

    @JsonProperty("object")
    public void setObject(String object) {
        this.object = object;
    }

    public Charges withObject(String object) {
        this.object = object;
        return this;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Charges withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    @JsonProperty("has_more")
    public boolean isHasMore() {
        return hasMore;
    }

    @JsonProperty("has_more")
    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Charges withHasMore(boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    @JsonProperty("total_count")
    public long getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public Charges withTotalCount(long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Charges withUrl(String url) {
        this.url = url;
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

    public Charges withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("object", object).append("data", data).append("hasMore", hasMore).append("totalCount", totalCount).append("url", url).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hasMore).append(totalCount).append(additionalProperties).append(data).append(object).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Charges) == false) {
            return false;
        }
        Charges rhs = ((Charges) other);
        return new EqualsBuilder().append(hasMore, rhs.hasMore).append(totalCount, rhs.totalCount).append(additionalProperties, rhs.additionalProperties).append(data, rhs.data).append(object, rhs.object).append(url, rhs.url).isEquals();
    }

}
