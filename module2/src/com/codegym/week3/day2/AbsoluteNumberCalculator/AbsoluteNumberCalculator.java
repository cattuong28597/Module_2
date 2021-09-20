package com.codegym.week3.day2.AbsoluteNumberCalculator;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        if (number >= 0) {
            number = number;
        } else {
            number = -number;
        }
        return number;
    }
}
