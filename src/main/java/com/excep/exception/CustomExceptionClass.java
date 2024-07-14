package com.excep.exception;

public class CustomExceptionClass extends   RuntimeException {
// this is custom exception class and this class is to handle the exception
    public CustomExceptionClass(String message) {
        super(message);
    }
}
