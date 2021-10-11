package com.codegym.week4.TriangleShape;

import java.util.Scanner;

public class QuadraticEquation {
    private Integer a, b, c;
    private double delta ;

    public QuadraticEquation() {
        a=b=c=null;

    }

    Scanner scanner = new Scanner(System.in);
    public void input() {
        do {
            System.out.print("Enter a:");
            a = scanner.nextInt();
            if (a == 0) {
                System.out.println("a need difference 0");
            }
        } while (a == 0);
        System.out.print("Enter b:");
        b = scanner.nextInt();
        System.out.print("Enter c:");
        c = scanner.nextInt();

    }

    public void quadratic() {
        if (a == null && b == null && c == null) {
            System.out.println("Enter the element");
            return;
        }

       // input();
//        System.out.println(delta);
        delta= b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: "+ -b/(2*a));
        } else if (delta > 0) {
             double x1 = (-b + Math.sqrt(delta)) / (2 * a);
             double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm:\nx1 = "+x1+ "\nx2 = "+x2);
        }
    }
}
