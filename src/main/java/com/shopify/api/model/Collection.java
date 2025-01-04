/**
 * @author Rahul Tiwari
 * @version 1.0.0
 * @package com.ignitiv.model
 * @since Aug 27, 2019
 * 
 */

package com.shopify.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

/**
 * @author Rahul Tiwari
 * @version 1.0.0
 * @param <T>
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Collection<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * The total number of pages of the results divided per the `pageSize`.
     */
    protected Integer pageCount;

    public Integer getPageCount() {

        return this.pageCount;
    }

    public void setPageCount(final Integer pageCount) {

        this.pageCount = pageCount;
    }

    /**
     * The number of results to display on each page when creating paged results from a query. The
     * amount is divided and displayed on the `pageCount `amount of pages. The default is 20 and
     * maximum value is 200 per page.
     */
    protected Integer pageSize;

    public Integer getPageSize() {

        return this.pageSize;
    }

    public void setPageSize(final Integer pageSize) {

        this.pageSize = pageSize;
    }

    /**
     * When creating paged results from a query, this value indicates the zero-based offset in the
     * complete result set where the returned entities begin. For example, with a `pageSize `of 25,
     * to get the 51st through the 75th items, use `startIndex=50`.
     */
    protected Integer startIndex;

    public Integer getStartIndex() {

        return this.startIndex;
    }

    public void setStartIndex(final Integer startIndex) {

        this.startIndex = startIndex;
    }

    /**
     * The total number of items in the list.
     */
    protected Integer totalCount;

    public Integer getTotalCount() {

        return this.totalCount;
    }

    public void setTotalCount(final Integer totalCount) {

        this.totalCount = totalCount;
    }

    /**
     * A list of requested items. All returned data is provided in an items array.For a failed
     * request, the returned response may be success with an empty item array.
     */
    protected List<T> items;

    public List<T> getItems() {

        return this.items;
    }

    public void setItems(final List<T> items) {

        this.items = items;
    }

}
