package com.xxx.response;

import java.io.Serializable;

public class OrderResponse implements Serializable{
    private static final long serialVersionUID = 3308568957164490299L;

    private boolean success;

    private String message;

    public OrderResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

