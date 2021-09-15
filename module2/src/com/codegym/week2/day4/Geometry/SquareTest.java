package com.codegym.week2.day4.Geometry;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(2.3, "yellow", true);
        System.out.println(square);
    }
}
