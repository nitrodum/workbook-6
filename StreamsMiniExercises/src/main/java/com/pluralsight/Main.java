package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream(".txt");
            Scanner scanner = new Scanner(fis);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}