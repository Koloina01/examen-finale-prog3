package com.examfinal.demo.dto;

import java.util.List;

public class ErrorResponse {

    private String code;

    private String message;

    private List<String> details;

    public ErrorResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(
            List<String> details
    ) {
        this.details = details;
    }
}