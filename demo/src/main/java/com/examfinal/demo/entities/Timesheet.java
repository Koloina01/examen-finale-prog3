package com.examfinal.demo.entities;

import com.examfinal.demo.enums.TimesheetStatus;

import java.time.LocalDateTime;
import java.util.List;

public class Timesheet {

    private String consultantId;
    private String week;

    private List<TimesheetEntry> entries;

    private TimesheetStatus status;

    private LocalDateTime submittedAt;

    public Timesheet() {
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

    public List<TimesheetEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<TimesheetEntry> entries) {
        this.entries = entries;
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
