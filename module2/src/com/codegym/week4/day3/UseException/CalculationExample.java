package com.codegym.week4.day3.UseException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap x: ");
        String x = "" ;
        try {
            x = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
        }
//        int x = scanner.nextInt();
        System.out.print("Hay nhap y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x + y = "+a);
            System.out.println("Hieu x - y = "+b);
            System.out.println("Tich x * y = "+c);
            System.out.println("Thuong x / y = "+d);
        } catch (InputMismatchException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println("Xay ra ngoai le: " + e.getMessage());
        }
    }

    private void calculate(String x, int y) {
        System.out.println("X= "+x);
        System.out.println("Y= "+y);
    }
}
