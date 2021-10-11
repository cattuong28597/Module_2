package com.codegym.week4.TriangleShape;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Enter the a, b, c ");
            System.out.println("2.Solve the equation");
            System.out.println("3.Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                   quadraticEquation.input();
                   break;
                case 2:
                    quadraticEquation.quadratic();
                    break;
                case 3 :
                    System.exit(0);
            }
        }
    }
}
