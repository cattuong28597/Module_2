package com.codegym.week1.day2;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interstRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter invester amount: ");
        money = scanner.nextDouble();
        System.out.println("Enter number of months: ");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interstRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest += money * (interstRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
