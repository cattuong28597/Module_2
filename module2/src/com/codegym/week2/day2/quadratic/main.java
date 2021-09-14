package com.codegym.week2.day2.quadratic;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.println(a+ "x2+"+b+"x+"+ c+ "=0" );
        Equation quadraticEquation = new Equation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.print("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.print("The equation has one root is "+quadraticEquation.getRoot1());
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.print("The equation has two roots \n r1: "+quadraticEquation.getRoot1()+"\n r2: "+quadraticEquation.getRoot2());
        }
    }
}
