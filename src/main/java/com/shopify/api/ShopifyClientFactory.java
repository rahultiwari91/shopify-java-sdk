package com.shopify.api;

import java.lang.reflect.Constructor;

import com.shopify.client.ShopifyClient;

/**
 * @author Rahul Tiwari, Created on Aug 29, 2019 - 4:46:21 PM
 *
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ShopifyClientFactory<TResult> {

	private static final String CLIENT_CLASS_NAME = "com.shopify.client.ShopifyClientImpl";

	public static ShopifyClient<?> getInstance(Class<?> clz) throws Exception {
		Constructor<? extends ShopifyClient> constructor = (Constructor<? extends ShopifyClient>) Class
				.forName(CLIENT_CLASS_NAME).getConstructor(new Class[] { Class.class });
		return (ShopifyClient<?>) constructor.newInstance(clz);
	}

	public static ShopifyClient<?> getInstance(Class<?> clz, String className) throws Exception {
		Constructor<? extends ShopifyClient> constructor = (Constructor<? extends ShopifyClient>) Class
				.forName(className).getConstructor(new Class[] { Class.class });
		return (ShopifyClient<?>) constructor.newInstance(clz);
	}

	public static ShopifyClient<?> getInstance() throws Exception {
		Constructor<? extends ShopifyClient> constructor = (Constructor<? extends ShopifyClient>) Class
				.forName(CLIENT_CLASS_NAME).getConstructor();
		return (ShopifyClient<?>) constructor.newInstance();
	}
}
