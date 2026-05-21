package com.examfinal.demo.entities;

import java.time.LocalDate;
import com.examfinal.demo.enums.Grade;

public class Consultant {
    private int id;
    private String FirstName;
    private String LastName;
    private Grade grade;
    private LocalDate hireDate;

    public Consultant(int id, String firstName, String lastName, Grade grade, LocalDate hireDate) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        this.grade = grade;
        this.hireDate = hireDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}
