package com.codegym.week3.day4.ConvertBinary;

import java.util.LinkedList;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("The number need converted: ");
        int number = input.nextInt();
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.pop();
        }
        System.out.println("The number in Binary: (" + str+ ")B");
    }
}
