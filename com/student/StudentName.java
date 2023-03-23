package com.student;

public class StudentName {
    public static void main(String[] args) {
        Student s = new StudentBuilderPattern().setName("John").setRegNo(123455).getStudentProperties();
        System.out.println(s);
    }
}
