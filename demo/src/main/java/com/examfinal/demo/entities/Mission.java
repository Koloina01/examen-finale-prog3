package com.examfinal.demo.entities;

import com.examfinal.demo.enums.MissionStatus;
import java.time.LocalDate;
public class Mission {
    private int id;
    private String description;
    private LocalDate startDate;
    private LocalDate planneDate;
    private LocalDate actualEndDate;
    private MissionStatus status;

    public Mission() {
    }
    
    public Mission(int id, String description, LocalDate startDate, LocalDate plannedEndDate, LocalDate actualEndDate, MissionStatus status) {
        this.id = id;
        this.description = description;
        this.startDate = startDate;
        this.planneDate = plannedEndDate;
        this.actualEndDate = actualEndDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getPlannedEndDate() {
        return planneDate;
    }

    public void setPlannedEndDate(LocalDate plannedEndDate) {
        this.planneDate = plannedEndDate;
    }

    public LocalDate getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(LocalDate actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public MissionStatus getStatus() {
        return status;
    }

    public void setStatus(MissionStatus status) {
        this.status = status;
    }
}
