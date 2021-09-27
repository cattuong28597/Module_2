package com.codegym.week3.day4.Palindrome;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        LinkedList queue = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string need checked: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char splitString = string.charAt(i);
            stack.push(splitString);
            queue.addFirst(splitString);
        }
        String lastStringQueue = "";
        while (!queue.isEmpty()) {
            lastStringQueue += queue.pollLast();
        }

        String lastString = "";
        while (!stack.isEmpty()) {
            lastString += stack.pop();
        }
        System.out.println(lastString);

        if (lastString.equals(lastStringQueue)) {
            System.out.println("String is Palindrome");
        } else System.out.println("String is not Palindrome");
    }
}
