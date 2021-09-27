package com.codegym.week3.day2.AbsoluteNumberCalculator;

public class AbsoluteNumberCalculator {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }

    public static int findAbsolute(int number) {
        if (number >= 0) {
            number = number;
        } else {
            number = -number;
        }
        return number;
    }
}
