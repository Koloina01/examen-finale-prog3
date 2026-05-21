package com.examfinal.demo.repository;

import com.examfinal.demo.datasource.DataSource;
import com.examfinal.demo.entities.Assignment;
import com.examfinal.demo.enums.AssignmentStatus;

import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AssignmentRepository {

    private final DataSource dataSource;

    public AssignmentRepository() {

        this.dataSource =
                new DataSource();
    }

    public List<Assignment>
    findAllByMissionId(
            String missionId
    ) {

        List<Assignment> assignments =
                new ArrayList<>();

        String sql = """
                SELECT *
                FROM assignment
                WHERE mission_id = ?
                """;

        try (

                Connection connection =
                        dataSource
                                .getConnection();

                PreparedStatement statement =
                        connection
                                .prepareStatement(
                                        sql
                                )

        ) {

            statement.setString(
                    1,
                    missionId
            );

            ResultSet resultSet =
                    statement.executeQuery();

            while (resultSet.next()) {

                Assignment assignment =
                        new Assignment();

                assignment.setPlannedDays(
                        resultSet.getInt(
                                "planned_days"
                        )
                );

                assignment
                        .setNegotiatedDailyRate(
                                resultSet.getInt(
                                        "negotiated_daily_rate"
                                )
                        );

                assignment.setStatus(
                        AssignmentStatus.valueOf(
                                resultSet.getString(
                                        "status"
                                )
                        )
                );

                assignment.setCreatedAt(
                        resultSet.getTimestamp(
                                "created_at"
                        ).toLocalDateTime()
                );

                assignments.add(
                        assignment
                );
            }

        } catch (SQLException e) {

            throw new RuntimeException(
                    e
            );
        }

        return assignments;
    }
}