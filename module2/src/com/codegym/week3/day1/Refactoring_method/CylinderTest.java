package com.codegym.week3.day1.Refactoring_method;

public class CylinderTest {
    public static void main(String[] args) {
        int radius = 1;
        int height = 2;
        double expected = 18.849;

        double result = Cylinder.getVolume(radius, height);
        if (expected == result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
