package com.codegym.week2.day4.ShapeCircle;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(8.0);
        System.out.println(cylinder);
        cylinder = new Cylinder(7.0, 2.3, "purple");
        System.out.println(cylinder);
    }
}
