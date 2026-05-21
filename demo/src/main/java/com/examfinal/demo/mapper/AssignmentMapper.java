package com.examfinal.demo.mapper;

import com.examfinal.demo.dto.AssignmentResponse;
import com.examfinal.demo.entities.Assignment;

public class AssignmentMapper {

    public AssignmentResponse toResponse(
            Assignment assignment
    ) {

        AssignmentResponse response =
                new AssignmentResponse();

        response.setPlannedDays(
                assignment.getPlannedDays()
        );

        response.setNegotiatedDailyRate(
                assignment
                        .getNegotiatedDailyRate()
        );

        response.setStartDate(
                assignment.getStartDate()
        );

        response.setEndDate(
                assignment.getEndDate()
        );

        response.setStatus(
                assignment.getStatus()
        );

        response.setCreatedAt(
                assignment.getCreatedAt()
        );

        return response;
    }
}
