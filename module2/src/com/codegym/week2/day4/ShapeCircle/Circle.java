package com.codegym.week2.day4.ShapeCircle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {}
    public Circle(double radius, String color) {
        this.color = color;
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String toString() {
        String str;
        str = "The radius is "+getRadius()+" and color is "+getColor();
        return str;
    }
}
