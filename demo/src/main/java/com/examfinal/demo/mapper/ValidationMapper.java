package com.examfinal.demo.mapper;

import com.examfinal.demo.dto.ValidationResponse;
import com.examfinal.demo.entities.Validation;
import com.examfinal.demo.enums.ValidationOutcome;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidationMapper {

    public static Validation toEntity(ResultSet rs) {

        try {

            Validation v = new Validation();

            v.setId(
                    rs.getString("id"));

            v.setOutcome(
                    ValidationOutcome.valueOf(
                            rs.getString("outcome")));

            v.setComment(
                    rs.getString("comment"));

            if (rs.getTimestamp("validated_at") != null) {

                v.setValidatedAt(
                        rs.getTimestamp(
                                "validated_at").toLocalDateTime());
            }

            return v;

        } catch (SQLException e) {

            System.out.println(
                    "Erreur mapping Validation : "
                            + e.getMessage());

            return null;
        }
    }

    public ValidationResponse toResponse(
            Validation v) {

        if (v == null) {
            return null;
        }

        ValidationResponse r = new ValidationResponse();

        r.setId(
                v.getId());

        r.setOutcome(
                v.getOutcome());

        r.setComment(
                v.getComment());

        r.setValidatedAt(
                v.getValidatedAt());

        return r;
    }
}