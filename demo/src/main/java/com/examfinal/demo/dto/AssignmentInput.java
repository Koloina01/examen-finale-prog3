package com.examfinal.demo.dto;

import java.time.LocalDate;

public class AssignmentInput {

    private Integer plannedDays;
    private Integer negotiatedDailyRate;
    private LocalDate startDate;
    private LocalDate endDate;

    public AssignmentInput() {
    }

    public Integer getPlannedDays() {
        return plannedDays;
    }

    public void setPlannedDays(Integer plannedDays) {
        this.plannedDays = plannedDays;
    }

    public Integer getNegotiatedDailyRate() {
        return negotiatedDailyRate;
    }

    public void setNegotiatedDailyRate(Integer negotiatedDailyRate) {
        this.negotiatedDailyRate = negotiatedDailyRate;
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