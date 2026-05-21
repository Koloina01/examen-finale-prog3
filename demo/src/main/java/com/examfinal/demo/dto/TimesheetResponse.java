package com.examfinal.demo.dto;

import com.examfinal.demo.enums.TimesheetStatus;

import java.time.LocalDateTime;
import java.util.List;

public class TimesheetResponse {

    private List<TimesheetEntryDto> entries;

    private String consultantId;

    private String week;

    private TimesheetStatus status;

    private LocalDateTime submittedAt;

    public TimesheetResponse() {
    }

    public List<TimesheetEntryDto> getEntries() {
        return entries;
    }

    public void setEntries(List<TimesheetEntryDto> entries) {
        this.entries = entries;
    }

    public String getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(String consultantId) {
        this.consultantId = consultantId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public TimesheetStatus getStatus() {
        return status;
    }

    public void setStatus(TimesheetStatus status) {
        this.status = status;
    }

    public LocalDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(LocalDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }
}