package com.codegym.week1.day2;

public class PrimeUnder100 {
    public static void main(String[] args) {
        int N = 2;
        System.out.println("Những số nguyên tố nhỏ hơn 100: ");
        while (N <= 100) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(" " + N);
            }
            N++;
        }
    }
}
