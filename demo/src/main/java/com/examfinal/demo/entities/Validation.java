package com.examfinal.demo.entities;

import java.time.LocalDateTime;

import com.examfinal.demo.enums.ValidationOutcome;

public class Validation {

    private String id;

    private ValidationOutcome outcome;

    private String comment;

    private LocalDateTime validatedAt;

    public Validation() {
    }

    public Validation(
            String id,
            ValidationOutcome outcome,
            String comment,
            LocalDateTime validatedAt
    ) {
        this.id = id;
        this.outcome = outcome;
        this.comment = comment;
        this.validatedAt = validatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(
            String id
    ) {
        this.id = id;
    }
    public ValidationOutcome getOutcome() {
        return outcome;
    }
    public void setOutcome(
            ValidationOutcome outcome
    ) {
        this.outcome = outcome;
    }
    public String getComment() {
        return comment;
    }

    public void setComment(
            String comment
    ) {
        this.comment = comment;
    }

    public LocalDateTime getValidatedAt() {
        return validatedAt;
    }

    public void setValidatedAt(
            LocalDateTime validatedAt
    ) {
        this.validatedAt = validatedAt;
    }
}
