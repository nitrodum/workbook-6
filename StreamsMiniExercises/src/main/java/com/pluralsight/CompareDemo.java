package com.pluralsight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {
        Course c1 = new Course("English", 20, 30);
        Course c2 = new Course("Math", 20, 30);
        Course c3 = new Course("Art", 10, 15);

        List<Course> courses = List.of(c1, c2, c3);

        courses.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------------------");

        courses.stream().sorted(Comparator.comparing(Course::getTitle).reversed()).forEach(System.out::println);
        System.out.println("----------------------------------");
        courses.stream().sorted(Comparator.comparing(Course::getMaxStudents)).forEach(System.out::println);
        System.out.println("----------------------------------");
        courses.stream().sorted(Comparator.comparing(Course::getStudyPoints).reversed()).forEach(System.out::println);

    }
}
