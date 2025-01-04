package com.shopify.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Rahul Tiwari, Created on Aug 27, 2019 - 4:06:14 PM
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Count implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer count;

	/**
	 * @return the count
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
