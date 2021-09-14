package com.codegym.week2.day3.AccessModifier2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Jame");
        student.setClasses("B03");
        System.out.println(student.toString());
    }
}
