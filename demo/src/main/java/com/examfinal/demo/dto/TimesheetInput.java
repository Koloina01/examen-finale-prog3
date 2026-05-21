package com.examfinal.demo.dto;

import com.examfinal.demo.entities.TimesheetEntry;
import java.util.List;

public class TimesheetInput {

    private List<TimesheetEntry> entries;

    public TimesheetInput() {
    }

    public List<TimesheetEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<TimesheetEntry> entries) {
        this.entries = entries;
    }
}