package com.codegym.week5.day1.PrimeNumber;

public class LazyPrimeFactorization implements Runnable {
    private int N;
    public LazyPrimeFactorization() {
    }

    public LazyPrimeFactorization(int n) {
        this.N = n;
    }

    @Override
    public void run() {
        try {
            int N = 2;
            int count = 0;
            while (count <= 100) {
                boolean check = true;
                for (int i = 2; i < N;i++) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println( "LP:" +N +" ");
                }
                N++;
                count++;
            }
        } catch (Exception e) {
            System.out.println("It is over");
        }
        System.out.println("Complete Lazy Prime Factorization");
    }
}
