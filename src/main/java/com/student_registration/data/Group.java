package com.student_registration.data;

import java.util.List;

public class Group {
    private String name;
    private List<Student> students;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }
}
