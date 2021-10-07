package com.codegym.week5.day1.PrimeNumber;

public class Main {
    public static void main(String[] args) {
        try {
            LazyPrimeFactorization n1 = new LazyPrimeFactorization(2);
            OptimizedPrimeFactorization n2 = new OptimizedPrimeFactorization(2);
            Thread thread1 = new Thread(n1);
            Thread thread2 = new Thread(n2);
            thread1.start();
            thread2.start();
        } catch (Exception e) {
            System.out.println("It is over");
        }
        System.out.println("Main thread complete");
    }
}
