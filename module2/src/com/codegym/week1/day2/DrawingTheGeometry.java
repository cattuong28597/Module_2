package com.codegym.week1.day2;

import java.util.Scanner;

public class DrawingTheGeometry {
    public static void main(String[] args) {
        int choice = -1;
        String choice1 = "d";
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Draw the rectangle");
            System.out.println("2.Draw the square triangle");
            System.out.println("a.Draw the square triangle has button-left angles");
            System.out.println("b.Draw the square triangle has top-left angles");
            System.out.println("3.Draw the isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter the number: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    for (int i = 1; i < 4; i++) {
                        for (int j = 1; j < 8; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    while (choice1 != "") {
                        System.out.println("a.Draw the square triangle has button-left angles");
                        System.out.println("b.Draw the square triangle has top-left angles");
                        System.out.println("c. Exit");
                        System.out.println("Enter your choice");
                        Scanner scanner = new Scanner(System.in);
                        choice1 = scanner.nextLine();

                        switch (choice1) {
                            case "a":
                                System.out.println("Draw the square triangle has button-left angles");
                                for (int i = 1; i <= 7;i++) {
                                    for (int j = 1; j < i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case "b":
                                System.out.println("Draw the square triangle has top-left angles");
                                for (int i = 7; i >= 1; i--) {
                                    for (int j = 1; j <= i; j++) {
                                        System.out.print(" * ");
                                    }
                                    System.out.println();
                                }
                                break;
                            case "c":
                                System.exit(0);
                            default:
                                System.out.println("No choice!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    for (int i = 1; i <= 7;i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
