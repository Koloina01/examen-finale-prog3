package com.examfinal.demo.dto;

import java.util.List;

public class TimesheetInput {

    private List<TimesheetEntryDto> entries;

    public TimesheetInput() {
    }

    public List<TimesheetEntryDto> getEntries() {
        return entries;
    }

    public void setEntries(List<TimesheetEntryDto> entries) {
        this.entries = entries;
    }
}
