package com.examfinal.demo.service;

import com.examfinal.demo.dto.TimesheetInput;
import com.examfinal.demo.dto.TimesheetResponse;
import com.examfinal.demo.dto.ValidationInput;
import com.examfinal.demo.dto.ValidationResponse;

import com.examfinal.demo.entities.Timesheet;
import com.examfinal.demo.entities.Validation;

import com.examfinal.demo.enums.TimesheetStatus;

import com.examfinal.demo.mapper.TimesheetMapper;
import com.examfinal.demo.mapper.ValidationMapper;

import com.examfinal.demo.repository.TimesheetRepository;
import com.examfinal.demo.repository.ValidationRepository;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimesheetService {

    private final TimesheetRepository timesheetRepository;

    private final ValidationRepository validationRepository;

    private final TimesheetMapper timesheetMapper;

    private final ValidationMapper validationMapper;

    public TimesheetService() {

        this.timesheetRepository =
                new TimesheetRepository();

        this.validationRepository =
                new ValidationRepository();

        this.timesheetMapper =
                new TimesheetMapper();

        this.validationMapper =
                new ValidationMapper();
    }

    public TimesheetResponse getTimesheet(
            String consultantId,
            String week
    ) {

        Timesheet timesheet =
                timesheetRepository
                        .findByConsultantIdAndWeek(
                                consultantId,
                                week
                        );

        return timesheetMapper.toResponse(
                timesheet
        );
    }

    public TimesheetResponse putTimesheet(
            String consultantId,
            String week,
            TimesheetInput input
    ) {

        Timesheet timesheet =
                new Timesheet();

        timesheet.setConsultantId(
                consultantId
        );

        timesheet.setWeek(
                week
        );

        timesheet.setEntries(
                input.getEntries()
        );

        timesheet.setStatus(
                TimesheetStatus.SUBMITTED
        );

        timesheet.setSubmittedAt(
                LocalDateTime.now()
        );

        Timesheet saved =
                timesheetRepository
                        .save(
                                timesheet
                        );

        return timesheetMapper.toResponse(
                saved
        );
    }

    public ValidationResponse validate(
            String consultantId,
            String week,
            ValidationInput input
    ) {

        Validation validation =
                new Validation();

        validation.setId(
                "VAL-001"
        );

        validation.setOutcome(input.getOutcome());

        validation.setComment(
                input.getComment()
        );

        validation.setValidatedAt(
                LocalDateTime.now()
        );

        Validation savedValidation =
                validationRepository.save(
                        consultantId,
                        week,
                        validation
                );

        return validationMapper.toResponse(
                savedValidation
        );
    }
}