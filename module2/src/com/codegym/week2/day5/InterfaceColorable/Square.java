package com.codegym.week2.day5.InterfaceColorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;

    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + super.toString() + ", Area=" + getArea();
    }
    @Override
    public String howToColor() {
        return "Color all four sides";
    }
}