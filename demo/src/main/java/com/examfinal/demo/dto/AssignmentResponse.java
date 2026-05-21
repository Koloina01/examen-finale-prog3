package com.examfinal.demo.dto;

import com.examfinal.demo.enums.AssignmentStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AssignmentResponse {

    private Integer plannedDays;
    private Integer negotiatedDailyRate;

    private LocalDate startDate;
    private LocalDate endDate;

    private MissionResponse mission;
    private ConsultantResponse consultant;

    private AssignmentStatus status;

    private LocalDateTime createdAt;

    public AssignmentResponse() {
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

    public MissionResponse getMission() {
        return mission;
    }

    public void setMission(MissionResponse mission) {
        this.mission = mission;
    }

    public ConsultantResponse getConsultant() {
        return consultant;
    }

    public void setConsultant(ConsultantResponse consultant) {
        this.consultant = consultant;
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