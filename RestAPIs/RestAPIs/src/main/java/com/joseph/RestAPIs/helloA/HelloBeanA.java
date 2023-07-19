package com.joseph.RestAPIs.helloA;


public class HelloBeanA {
    private String message;

    public HelloBeanA(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloBeanA{" +
                "message='" + message + '\'' +
                '}';
    }
}
