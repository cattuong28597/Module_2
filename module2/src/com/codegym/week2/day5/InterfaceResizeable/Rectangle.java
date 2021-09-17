package com.codegym.week2.day5.InterfaceResizeable;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "A Retangle with width="+getWidth()+ " and length="+getLength()+super.toString()+", Area="+getArea();
    }
    @Override
    public void resize(double percent) {
        this.width = width * (percent/100);
        this.length = length*(percent/100);
    }
}