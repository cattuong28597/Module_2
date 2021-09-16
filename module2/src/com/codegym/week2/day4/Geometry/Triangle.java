package com.codegym.week2.day4.Geometry;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = side1 + side2 + side3;
        return Math.sqrt(s * (s - side1) * (s - side2) + (s - side3));
    }
    public boolean checkTriangle() {
        if (getSide1()+getSide2() > getSide3() && getSide3()+getSide2() > getSide1() && getSide3()+getSide1() > getSide2()) {
            return true;
        }
        return false;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "A Triangle with side1: " + getSide1() + ", side2: " + getSide2() + ", side3: " + getSide3()
                + "\nThis Area: "+getArea()+", This Perimeter: "+getPerimeter()
                + "\nWhich is subclass of " + super.toString();
    }
}
