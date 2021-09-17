package com.codegym.week3.day1.Refactoring_renaming;

import java.util.Scanner;

public class TestFizzBuzz {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = input.nextInt();
        System.out.println("number is: "+number);
        FizzBuzz.fizzBuzz(number);
        System.out.println(FizzBuzz.fizzBuzz(number));
    }


}
