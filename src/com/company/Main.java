package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            switch (i % 5){
                case 1 -> cars.add(new Car("Toyota", Color.RED, i * 2));
                case 2 -> cars.add(new Car("Honda", Color.BLUE, i * 3));
                case 3 -> cars.add(new Car("Tesla", Color.GREEN, i * 4));
                case 4 -> cars.add(new Car("BMW", Color.BLACK, i * 5));
                case 0 -> cars.add(new Car("Maserati", Color.WHITE, i * 10));
            }
        }
        Optional<Car> max = cars.stream().filter(col -> col.color == Color.RED).max(Comparator.comparing(car -> car.maxSpeed));
        System.out.println(max);
        System.out.println("=".repeat(50));


        List<Student> students = new ArrayList<>(100);
        for (int j = 1; j <= 100; j++) {
            switch (j % 5){
                case 1 -> students.add(new Student("Pupkin Vasya Sergeevich",j, Group.OO111OO));
                case 2 -> students.add(new Student("Shmidt Petya Olegovich ", j,Group.XD456JU));
                case 3 -> students.add(new Student("Kruz Tom Georgovich",j, Group.ZZ989KK));
                case 4 -> students.add(new Student("Holland Tom Stevenson", j,Group.DS4213LF));
                case 0 -> students.add(new Student("King Edvard Jameson", j,Group.E456YIU));
            }
        }
        List<String> collect = students.stream().
                filter(age -> age.getAge() < 16).
                map(student -> student.getFulName().replaceAll("\\s.*", "")).collect(Collectors.toList());

        for (String s : collect) {
            System.out.println(s);
        }
        System.out.println("=".repeat(50));

        List<Student> students2 = new ArrayList<>(100);
        for (int j = 1; j <= 100; j++) {
            switch (j % 5){
                case 1 -> students2.add(new Student("Pupkin Vasya Sergeevich",j, Group.OO111OO,10));
                case 2 -> students2.add(new Student("Shmidt Petya Olegovich ", j,Group.XD456JU,6));
                case 3 -> students2.add(new Student("Kruz Tom Georgovich",j, Group.ZZ989KK,3));
                case 4 -> students2.add(new Student("Holland Tom Stevenson", j,Group.DS4213LF,12));
                case 0 -> students2.add(new Student("King Edvard Jameson", j,Group.E456YIU,7));
            }
        }
        Integer sum = students2.stream().map(Student::getPoints).reduce(Integer::sum).orElse(0);
        System.out.println(sum/students2.size());

        System.out.println("=".repeat(50));

        List<Employee> employees = students.stream().map(student -> new Employee(student.getFulName().split(" ")[0],student.getFulName().split(" ")[1],student.getFulName().split(" ")[2], student.getAge())).collect(Collectors.toList());

        /*for (Employee employee : employees) {
            String s = employee.toString();
            System.out.println(s);
        }*/
    }


}
