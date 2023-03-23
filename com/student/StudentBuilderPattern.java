package com.student;


public class StudentBuilderPattern {
    private String name;
    private int rollNo;
    private int regNo;
    private String section;
    private String School;

    public StudentBuilderPattern setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilderPattern setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilderPattern setRegNo(int regNo) {
        this.regNo = regNo;
        return this;
    }

    public StudentBuilderPattern setSection(String section) {
        this.section = section;
        return this;
    }

    public StudentBuilderPattern setSchool(String school) {
        School = school;
        return this;
    }
    public Student getStudentProperties(){
        return new Student(name,rollNo,regNo,section,School);
    }
}
