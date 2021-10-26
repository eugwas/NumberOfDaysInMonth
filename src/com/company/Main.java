package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int month = scanner.nextInt();
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();
            System.out.println("Days in month = " + NumberOfDaysInMonth.getDaysInMonth(month, year));
        } else {
            System.out.println("Invalid number");
        }
        scanner.nextLine();
        scanner.close();
    }
}
