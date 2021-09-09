package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the USD money to change: ");
        usd = scanner.nextDouble();
        double change = usd * 23000;
        System.out.print("Change value in VND:" + change);
    }
}
