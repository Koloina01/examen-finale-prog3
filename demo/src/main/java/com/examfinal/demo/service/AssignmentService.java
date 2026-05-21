package com.examfinal.demo.service;

import com.examfinal.demo.dto.AssignmentResponse;
import com.examfinal.demo.entities.Assignment;
import com.examfinal.demo.dto.AssignmentInput;
import com.examfinal.demo.mapper.AssignmentMapper;

import com.examfinal.demo.repository.AssignmentRepository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssignmentService {

    private final AssignmentRepository
            assignmentRepository;

    private final AssignmentMapper
            assignmentMapper;

    public AssignmentService() {

        this.assignmentRepository =
                new AssignmentRepository();

        this.assignmentMapper =
                new AssignmentMapper();
    }

    public List<AssignmentResponse>
    getAssignments(
            String missionId
    ) {

        List<Assignment> assignments =
                assignmentRepository
                        .findAllByMissionId(
                                missionId
                        );

        List<AssignmentResponse>
                responses =
                new ArrayList<>();

        for (
                Assignment assignment
                        : assignments
        ) {

            responses.add(
                    assignmentMapper
                            .toResponse(
                                    assignment
                            )
            );
        }

        return responses;
    }

    public AssignmentResponse
    putAssignment(
            String missionId,

            String consultantId,

            AssignmentInput input
    ) {

        Assignment assignment =
                new Assignment();

        assignment.setPlannedDays(
                input.getPlannedDays()
        );

        assignment
                .setNegotiatedDailyRate(
                        input
                                .getNegotiatedDailyRate()
                );

        assignment.setStartDate(
                input.getStartDate()
        );

        assignment.setEndDate(
                input.getEndDate()
        );

        AssignmentResponse response =
                assignmentMapper
                        .toResponse(
                                assignment
                        );

        return response;
    }
}