package com.company;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String surName;
    private String patronymic;
    private int age;

    public Employee(String name, String surName, String patronymic, int age) {
        this.name = name;
        this.surName = surName;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                '}';
    }
}
