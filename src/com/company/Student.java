package com.company;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surename;
    private LocalDate birthdate;
    private String studentNumber;

    public Student(String name, String surename, LocalDate birthdate, String studentNumber) {
        this.name = name;
        this.surename = surename;
        this.birthdate = birthdate;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }
    public String getFullName() {
        return getName() +" " + getSurename();
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFullInfo()
    {
        return getStudentNumber()+" "+getFullName()+" "+"("+getBirthdate().getYear()+")";
    }
}
