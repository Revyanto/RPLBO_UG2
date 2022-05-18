package com.ug11.instapost;

public class EmailException {
    private String errorMessage;
    private int errorCode;

    public EmailException(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
