package com.student_registration.data;

public class Student extends Human{

    private String studentId;

    public Student(String name, String surname, String studentId) {
        super(name, surname);
        this.studentId = studentId;
    }

}
