package com.examfinal.demo.dto;

import com.examfinal.demo.enums.ValidationOutcome;

import java.time.LocalDateTime;

public class ValidationResponse {

    private String id;

    private ValidationOutcome outcome;

    private String comment;

    private LocalDateTime validatedAt;

    public ValidationResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ValidationOutcome getOutcome() {
        return outcome;
    }

    public void setOutcome(ValidationOutcome outcome) {
        this.outcome = outcome;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getValidatedAt() {
        return validatedAt;
    }

    public void setValidatedAt(LocalDateTime validatedAt) {
        this.validatedAt = validatedAt;
    }
}
