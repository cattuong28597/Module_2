package com.codegym.week5.day1.OddAndEven;

import java.util.Scanner;

public class ThreadTest {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            OddThread number1 = new OddThread(n1);
            EvenThread number2 = new EvenThread(n2);
            Thread thread1 = new Thread(number1);
            Thread thread2 = new Thread(number2);
            thread1.start();
            thread2.start();
        } catch (Exception e) {
            System.out.println("It is over");
        }
        System.out.println("");
    }
}
