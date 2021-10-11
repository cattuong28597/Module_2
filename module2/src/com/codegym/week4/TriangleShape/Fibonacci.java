package com.codegym.week4.TriangleShape;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        int size = 15;
        int count = 2;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 0; i <= size; i++) {
            n3 = n1+n2;
            count++;
            if (count <= 10) {
                System.out.print(n3 + " ");
            }
            if (count == 13) {
                System.out.print("\nSo thu 13 trong day la: "+n3);
            }
            n1 = n2;
            n2 = n3;
        }
    }
}
