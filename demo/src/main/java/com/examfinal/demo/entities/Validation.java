package com.examfinal.demo.entities;

import java.time.LocalDateTime;

public class Validation {

    private String id;

    private String outcome;

    private String comment;

    private LocalDateTime validatedAt;

    public Validation() {
    }

    public String getId() {
        return id;
    }

    public void setId(
            String id
    ) {
        this.id = id;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(
            String outcome
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
