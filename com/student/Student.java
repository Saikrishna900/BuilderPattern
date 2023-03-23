package com.student;

public class Student {
    private String name;
    private int rollNo;
    private int regNo;
    private String section;
    private String School;

    public Student(String name, int rollNo, int regNo, String section, String school) {
        this.name = name;
        this.rollNo = rollNo;
        this.regNo = regNo;
        this.section = section;
        School = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", regNo=" + regNo +
                ", section='" + section + '\'' +
                ", School='" + School + '\'' +
                '}';
    }
}
