package com.codegym.week2.day5.InterfaceResizeable;

public class Square extends Shape {
    private double side ;

    public Square() {}
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
        return side*side;
    }

    public double getPerimeter() {
        return 4*side;
    }
    @Override
    public String toString() {
        return "A Square with side="+getSide()+super.toString()+", Area="+getArea();
    }
    @Override
    public void resize(double percent) {
        this.side = side * (percent/100);
    }
}
