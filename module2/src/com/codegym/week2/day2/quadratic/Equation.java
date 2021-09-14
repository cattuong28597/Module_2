package com.codegym.week2.day2.quadratic;

public class Equation {
    double a, b, c;
    public Equation() {
    }
    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
       double delta =  this.b * this.b - 4 * this.a * this.c;
       return delta;
    }
    public double getRoot1() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        double r1 = (- this.b + Math.pow(delta, 0.5)) / 2 * this.a;
        return r1;
    }
    public double getRoot2() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        double r2 = (- this.b - Math.pow(delta, 0.5)) / 2 * this.a;
        return r2;
    }
}
