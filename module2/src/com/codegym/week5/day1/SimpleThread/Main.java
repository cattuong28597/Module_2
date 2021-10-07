package com.codegym.week5.day1.SimpleThread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            NumberGenerator num1 = new NumberGenerator(n1);
            NumberGenerator num2 = new NumberGenerator(n2);

            Thread thread1 = new Thread(num1);
            Thread thread2 = new Thread(num2);
            thread1.start();
            thread2.start();
        } catch (Exception e) {
            System.out.println("It is over!");
        }
    }
}
