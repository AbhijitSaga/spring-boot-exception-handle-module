package com.excep.exception;

import java.util.Date;

public class ErrorDetailsClass {

    // it use in-side global exception class( class name- ExceptionController)
    // to  response  the exception related  data and other information to the  client

    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetailsClass(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
