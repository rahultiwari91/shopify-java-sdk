package com.shopify.api;

/**
 * @author Rahul Tiwari, Created on Aug 21, 2019 - 4:40:11 PM
 *
 */
public class ApiException extends RuntimeException {
    /** Default Serial Version UID  */
    private static final long serialVersionUID = 1L;
    protected int HttpStatusCode;
    
    public ApiException(String message) {
        super(message);
    }
    
    public ApiException(String message, int httpStatusCode) {
        super(message);
        this.HttpStatusCode = httpStatusCode;
    }

    public int getHttpStatusCode() {
        return HttpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        HttpStatusCode = httpStatusCode;
    }
}
