package com.examfinal.demo.dto;

import com.examfinal.demo.enums.ValidationOutcome;

public class ValidationInput {

    private ValidationOutcome outcome;

    private String comment;

    public ValidationInput() {
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
}
