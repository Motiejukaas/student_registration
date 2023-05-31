package com.student_registration.data;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;

    public Group() {
        students = new ArrayList<>();
    }

    public Group(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
