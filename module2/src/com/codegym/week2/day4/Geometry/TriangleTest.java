package com.codegym.week2.day4.Geometry;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3, "pink", true);
        if (triangle.checkTriangle()) {
            triangle.getArea();
            System.out.println(triangle.toString());
        } else {
            System.out.println("This is not a Triangle");
        }
    }
}
