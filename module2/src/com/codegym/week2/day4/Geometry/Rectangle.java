package com.codegym.week2.day4.Geometry;

import com.codegym.week2.day2.oop.Retangle;

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
        return width*length;
    }
    public double getPerimeter() {
        return (width + length) * 2;
    }
    @Override
    public String toString() {
        String str;
        str= "A Rectangle with width = "+getWidth()+" and length "+getLength()+", Which is a subclass of "+super.toString();
        return  str;
    }
}
