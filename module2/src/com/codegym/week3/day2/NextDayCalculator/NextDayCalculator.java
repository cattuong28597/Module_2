package com.codegym.week3.day2.NextDayCalculator;

public class NextDayCalculator {
    public static String nextDay(int day, int month, int year) {
        String nextDay = "";
        boolean isYear = year > 0;
        boolean isMonth = month <= 12 && month >= 1;

        if (isYear) {
            if (isMonth) {
                int numDay = numberDayOfMonth(month, year);
                boolean isDayOfMonth = day <= numDay && day >= 1;
                boolean isLastDayOfMonth = day == numDay;
                boolean isLastMonthOfYear = month == 12;
                if (isDayOfMonth) {
                    if (isLastDayOfMonth) {
                        nextDay += 1 + "-";
                        if (isLastMonthOfYear) {
                            nextDay += 1 + "-" + (year + 1);
                        } else nextDay += (month + 1) + "-" + year;
                    } else nextDay = (day + 1) + "-" + month + "-" + year;
                } else nextDay = "Not next day !";
            } else nextDay = "Not next day !";
        } else nextDay = "Not next day !";
        return nextDay;
    }

    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400)
                    return true;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int numberDayOfMonth(int month, int year) {
        int numDay;
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    numDay = 29;
                } else {
                    numDay = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDay = 30;
                break;
            default:
                numDay = 31;
        }
        return numDay;
    }
}
