package com.examfinal.demo.dto;

import com.examfinal.demo.enums.ConsultantGrade;

public class ConsultantResponse {

    private String id;
    private String name;
    private ConsultantGrade grade;

    public ConsultantResponse() {
    }

    public ConsultantResponse(
            String id,
            String name,
            ConsultantGrade grade
    ) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConsultantGrade getGrade() {
        return grade;
    }

    public void setGrade(ConsultantGrade grade) {
        this.grade = grade;
    }
}
