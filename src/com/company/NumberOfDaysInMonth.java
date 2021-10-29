package com.company;

public class NumberOfDaysInMonth {
    private int month;
    private int year;

    public NumberOfDaysInMonth(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        else if (year % 4 != 0)
            return false;
        else if (year % 100 == 0 && year % 400 != 0)
            return false;
        return true;
    }

    public int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Invalid number of the month");
            return -1;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else if (month == 2 && isLeapYear(year) == true) {
            return 29;
        } else if (month == 2 && isLeapYear(year) == false) {
            return 28;
        }
        return 31;
    }
}
