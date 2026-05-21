package com.examfinal.demo.controller;

import com.examfinal.demo.dto.TimesheetInput;
import com.examfinal.demo.dto.TimesheetResponse;
import com.examfinal.demo.dto.ValidationInput;
import com.examfinal.demo.dto.ValidationResponse;
import com.examfinal.demo.service.TimesheetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimesheetController {

    private final TimesheetService
            timesheetService;

    public TimesheetController() {

        this.timesheetService =
                new TimesheetService();
    }

    @GetMapping(
            "/consultants/{consultantId}/timesheets/{week}"
    )
    public TimesheetResponse getTimesheet(
            @PathVariable String consultantId,

            @PathVariable String week
    ) {

        return timesheetService
                .getTimesheet(
                        consultantId,
                        week
                );
    }

    @PutMapping(
            "/consultants/{consultantId}/timesheets/{week}"
    )
    public TimesheetResponse putTimesheet(
            @PathVariable String consultantId,

            @PathVariable String week,

            @RequestBody TimesheetInput input
    ) {

        return timesheetService
                .putTimesheet(
                        consultantId,
                        week,
                        input
                );
    }

    @PutMapping(
            "/consultants/{consultantId}/timesheets/{week}/validation"
    )
    public ValidationResponse validate(
            @PathVariable String consultantId,

            @PathVariable String week,

            @RequestBody ValidationInput input
    ) {

        return timesheetService
                .validate(
                        consultantId,
                        week,
                        input
                );
    }
}
