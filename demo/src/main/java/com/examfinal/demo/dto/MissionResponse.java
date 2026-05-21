package com.examfinal.demo.dto;

import java.time.LocalDate;

public class MissionResponse {

    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public MissionResponse() {
    }

    public MissionResponse(
            String description,
            LocalDate startDate,
            LocalDate endDate
    ) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
