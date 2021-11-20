package com.company;

public class Student {
    private String fulName;
    private int age;
    private Group group;
    private int points;

    public Student(String fulName, int age, Group group) {
        this.fulName = fulName;
        this.age = age;
        this.group = group;
    }

    public Student(String fulName, int age, Group group, int points) {
        this.fulName = fulName;
        this.age = age;
        this.group = group;
        this.points = points;
    }

    public String getFulName() {
        return fulName;
    }

    public int getAge() {
        return age;
    }

    public Group getGroup() {
        return group;
    }

    public int getPoints() {
        return points;
    }
}
