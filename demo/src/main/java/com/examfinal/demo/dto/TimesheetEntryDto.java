package com.examfinal.demo.dto;

import java.time.LocalDate;

public class TimesheetEntryDto {

    private LocalDate date;

    private String missionId;

    private Double dayFraction;

    public TimesheetEntryDto() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public Double getDayFraction() {
        return dayFraction;
    }

    public void setDayFraction(Double dayFraction) {
        this.dayFraction = dayFraction;
    }
}