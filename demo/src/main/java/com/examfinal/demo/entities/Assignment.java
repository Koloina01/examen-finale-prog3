package com.examfinal.demo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.examfinal.demo.enums.AssignmentStatus;

public class Assignment {
    private int id;
    private Consultant consultant;
    private Mission mission;
    private Integer plannedDays;
    private Integer negotiatedDailyRate;
    private LocalDate startDate;
    private LocalDate endDate;
    private AssignmentStatus status;
    private LocalDateTime createdAt;

    public Assignment() {
    }

    public Assignment(int id, Consultant consultant, Mission mission, Integer plannedDays, Integer negotiatedDays, LocalDate startDate, LocalDate endDate, AssignmentStatus status, LocalDateTime createdAt) {
        this.id = id;
        this.consultant = consultant;
        this.mission = mission;
        this.plannedDays = plannedDays;
        this.negotiatedDailyRate = negotiatedDays;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
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

    public AssignmentStatus getStatus() {
        return status;
    }

    public void setStatus(AssignmentStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
