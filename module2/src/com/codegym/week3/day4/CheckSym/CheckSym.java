package com.codegym.week3.day4.CheckSym;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckSym {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the expression need checked: ");
        String str = input.nextLine();
        boolean isTrue = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
                
            } else if (str.charAt(i) == ')') {
                if (stack.size() == 0) {
                    isTrue = false;
                    break;
                } else {
                    stack.pop();

                }
            }
        }
        if (stack.size()!= 0) {
            isTrue = false;
        }

        if (isTrue) {
            System.out.println("The expression is good");
        } else System.out.println("???");
    }
}
