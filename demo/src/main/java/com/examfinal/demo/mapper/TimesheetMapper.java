package com.examfinal.demo.mapper;

import com.examfinal.demo.dto.TimesheetResponse;
import com.examfinal.demo.entities.Timesheet;
import com.examfinal.demo.enums.TimesheetStatus;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TimesheetMapper {

    public static Timesheet toEntity(ResultSet rs) {

        try {
            Timesheet t = new Timesheet();

            t.setConsultantId(rs.getString("consultant_id"));
            t.setWeek(rs.getString("week"));
            t.setStatus(TimesheetStatus.valueOf(rs.getString("status")));

            if (rs.getTimestamp("submitted_at") != null) {
                t.setSubmittedAt(rs.getTimestamp("submitted_at").toLocalDateTime());
            }

            return t;

        } catch (SQLException e) {
            System.out.println("Erreur mapping Timesheet : " + e.getMessage());
            return null;
        }
    }

    public TimesheetResponse toResponse(Timesheet t) {

        if (t == null)
            return null;

        TimesheetResponse r = new TimesheetResponse();

        r.setConsultantId(t.getConsultantId());
        r.setWeek(t.getWeek());
        r.setStatus(t.getStatus());
        r.setSubmittedAt(t.getSubmittedAt());

        return r;
    }
}
