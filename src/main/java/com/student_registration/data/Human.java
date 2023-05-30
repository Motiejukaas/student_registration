package com.student_registration.data;

public abstract class Human {
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human() {
        this.name = "";
        this.surname = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
