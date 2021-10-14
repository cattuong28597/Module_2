package com.codegym.week5.day1.PrimeNumber;

public class OptimizedPrimeFactorization implements Runnable{
    private int N;
    public OptimizedPrimeFactorization() {
    }

    public OptimizedPrimeFactorization(int n) {
        this.N = n;
    }

    @Override
    public synchronized void run() {
        try {
            int N = 2;
            int count = 0;
            while (count <= 100) {
                boolean check = true;
                for (int i = 2; i < Math.sqrt(N);i++) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println("OP:" +N +" ");
                }
                N++;
                count++;
            }
        } catch (Exception e) {
            System.out.println("It is over");
        }
        System.out.println("Complete Optimized Primed Factorization");
    }
}
