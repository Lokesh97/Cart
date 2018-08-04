package com.paytm.ExceptionHandling;

public class notEnoughItemAvailableException extends Exception {

    public notEnoughItemAvailableException(String message) {
        super(message);
    }
}
