package com.examfinal.demo.repository;

import com.examfinal.demo.datasource.DataSource;
import com.examfinal.demo.entities.Validation;
import com.examfinal.demo.mapper.ValidationMapper;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

@Repository
public class ValidationRepository {

    private final DataSource dataSource;

    public ValidationRepository() {

        this.dataSource =
                new DataSource();
    }

    public Validation save(
            String consultantId,
            String week,
            Validation validation
    ) {

        String sql = """
                INSERT INTO Validation(
                    consultant_id,
                    week,
                    outcome,
                    comment,
                    validated_at
                )
                VALUES (?, ?, ?, ?, ?)
                """;

        try (

                Connection connection =
                        dataSource.getConnection();

                PreparedStatement ps =
                        connection.prepareStatement(sql)

        ) {

            ps.setString(
                    1,
                    consultantId
            );

            ps.setString(
                    2,
                    week
            );

            ps.setString(
                    3,
                    validation
                            .getOutcome()
                            .name()
            );

            ps.setString(
                    4,
                    validation.getComment()
            );

            ps.setTimestamp(
                    5,

                    validation.getValidatedAt() != null

                            ? Timestamp.valueOf(
                                    validation.getValidatedAt()
                            )

                            : new Timestamp(
                                    System.currentTimeMillis()
                            )
            );

            ps.executeUpdate();

        } catch (SQLException e) {

            throw new RuntimeException(
                    "Error while saving validation : "
                            + e.getMessage()
            );
        }

        return validation;
    }

    public Validation findByConsultantIdAndWeek(
            String consultantId,
            String week
    ) {

        String sql = """
                SELECT
                    id,
                    consultant_id,
                    week,
                    outcome,
                    comment,
                    validated_at
                FROM Validation
                WHERE consultant_id = ?
                AND week = ?
                """;

        try (

                Connection connection =
                        dataSource.getConnection();

                PreparedStatement ps =
                        connection.prepareStatement(sql)

        ) {

            ps.setString(
                    1,
                    consultantId
            );

            ps.setString(
                    2,
                    week
            );

            ResultSet rs =
                    ps.executeQuery();

            if (rs.next()) {

                return ValidationMapper
                        .toEntity(rs);
            }

        } catch (SQLException e) {

            throw new RuntimeException(
                    "Error while fetching validation : "
                            + e.getMessage()
            );
        }

        return null;
    }
}