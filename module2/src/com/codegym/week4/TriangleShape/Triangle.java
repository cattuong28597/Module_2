package com.codegym.week4.TriangleShape;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("The triangle under left:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("The triangle top left: ");
        for (int a = 6; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

}
