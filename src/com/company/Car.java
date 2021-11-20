package com.company;

public class Car {
    String name;
    Color color;
    int maxSpeed;

    public Car(String name, Color color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
