package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Person p1 = new Person("a", "a", 12);
        Person p2 = new Person("b", "a", 13);
        Person p3 = new Person("c", "b", 24);
        Person p4 = new Person("d", "b", 19);
        Person p5 = new Person("e", "c", 18);
        Person p6 = new Person("f", "c", 23);
        Person p7 = new Person("g", "d", 32);
        Person p8 = new Person("i", "d", 23);
        Person p9 = new Person("j", "a", 11);
        Person p10 = new Person("k", "a", 19);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
        personList.add(p9);
        personList.add(p10);


        System.out.println("Would you like to search by first name or last name? (first/last)");
        String choice = scanner.nextLine();

        ArrayList<Person> filteredList = new ArrayList<>();
        if (choice.equalsIgnoreCase("first")) {
            System.out.println("Enter the first name you would like to search:");
            String firstName = scanner.nextLine();

            for (Person p : personList) {
                if (p.getFirstName().equalsIgnoreCase(firstName)) {
                    filteredList.add(p);
                }
            }
        } else if (choice.equalsIgnoreCase("last")) {
            System.out.println("Enter the last name you would like to search:");
            String lastName = scanner.nextLine();

            for (Person p : personList) {
                if (p.getLastName().equalsIgnoreCase(lastName)) {
                    filteredList.add(p);
                }
            }
        } else {
            System.out.println("Invalid option!");
        }

        for (Person p : filteredList) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
        }

        int sum = 0;
        int maxAge = personList.get(0).getAge();
        int minAge = personList.get(0).getAge();

        for (Person p : personList) {
            sum += p.getAge();
            maxAge = Math.max(maxAge, p.getAge());
            minAge = Math.min(minAge, p.getAge());
        }

        double avgAge = (double)(sum/personList.size());

        System.out.println("Average age: " + avgAge);
        System.out.println("Oldest age: " + maxAge);
        System.out.println("Youngest age: " + minAge);
        scanner.close();
    }
}