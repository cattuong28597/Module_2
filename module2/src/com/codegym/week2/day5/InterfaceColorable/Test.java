package com.codegym.week2.day5.InterfaceColorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle(1.2, "yellow", false);
        shape[1] = new Square(4.0, "black", true);
        for (Shape a : shape) {
            System.out.println(a);

        if (a instanceof Square) {
            Colorable b = (Square) a;
            System.out.println(b.howToColor());
        }
        }
    }
}
