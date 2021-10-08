package com.codegym.week5.day2.ValidateClass;

public class TestClass {
    private static Class testClass;

    public static final String[] checkClass = new String[] {"C0318G", "M0318G", "P0323A"};

    public static void main(String[] args) {
        testClass = new Class();
        for (String cl: checkClass) {
            boolean isvalid = testClass.validate(cl);
            System.out.println("Class is " + cl+ " is valid " + isvalid);
        }
    }
}
