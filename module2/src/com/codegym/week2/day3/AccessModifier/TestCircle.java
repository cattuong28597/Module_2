package com.codegym.week2.day3.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The Circle with radius is: "+ circle.getRadius()+ "\n And The Area is: " + circle.getArea());
    }
}
