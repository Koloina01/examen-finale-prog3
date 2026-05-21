package com.examfinal.demo.controller;

import com.examfinal.demo.dto.AssignmentInput;
import com.examfinal.demo.dto.AssignmentResponse;

import com.examfinal.demo.service.AssignmentService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentController {

    private final AssignmentService assignmentService;

    public AssignmentController() {

        this.assignmentService =
                new AssignmentService();
    }

    @GetMapping(
            "/missions/{missionId}/assignments"
    )
    public List<AssignmentResponse>
    listMissionAssignments(
            @PathVariable String missionId
    ) {

        return assignmentService
                .getAssignments(
                        missionId
                );
    }

    @PutMapping(
            "/missions/{missionId}/assignments/{consultantId}"
    )
    public AssignmentResponse putAssignment(
            @PathVariable String missionId,

            @PathVariable String consultantId,

            @RequestBody AssignmentInput input
    ) {

        return assignmentService
                .putAssignment(
                        missionId,
                        consultantId,
                        input
                );
    }
}