package com.examfinal.demo.repository;

import com.examfinal.demo.datasource.DataSource;
import com.examfinal.demo.entities.Timesheet;
import com.examfinal.demo.enums.TimesheetStatus;
import com.examfinal.demo.mapper.TimesheetMapper;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

@Repository
public class TimesheetRepository {

    private final DataSource dataSource;

    public TimesheetRepository() {
        this.dataSource = new DataSource();
    }

    public Timesheet findByConsultantIdAndWeek(String consultantId, String week) {

        String sql = "SELECT consultant_id, week, status, submitted_at " +
                     "FROM timesheet " +
                     "WHERE consultant_id = ? AND week = ?";

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql)
        ) {

            ps.setString(1, consultantId);
            ps.setString(2, week);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return TimesheetMapper.toEntity(rs);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error while fetching timesheet: " + e.getMessage());
        }

        return null;
    }

    public Timesheet save(Timesheet timesheet) {

        String sql = "INSERT INTO timesheet (consultant_id, week, status, submitted_at) " +
                     "VALUES (?, ?, ?, ?)";

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql)
        ) {

            ps.setString(1, timesheet.getConsultantId());
            ps.setString(2, timesheet.getWeek());
            ps.setString(3, timesheet.getStatus().name());

            ps.setTimestamp(
                    4,
                    timesheet.getSubmittedAt() != null
                            ? Timestamp.valueOf(timesheet.getSubmittedAt())
                            : null
            );

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error while saving timesheet: " + e.getMessage());
        }

        return timesheet;
    }

    public void updateStatus(String consultantId, String week, TimesheetStatus status) {

        String sql = "UPDATE timesheet SET status = ? WHERE consultant_id = ? AND week = ?";

        try (
                Connection connection = dataSource.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql)
        ) {

            ps.setString(1, status.name());
            ps.setString(2, consultantId);
            ps.setString(3, week);

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error while updating timesheet status: " + e.getMessage());
        }
    }
}