package com.codegym.week3.day4.ReversStack;

import java.util.Collections;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }



//        System.out.println("Before reverse: "+stack);
//        System.out.print("After reverse: ");
//        reverse(stack);
    }

//    public static void reverse(Stack<Integer> arr) {
//        arr.sort(Collections.reverseOrder());
//        System.out.print(arr);
//    }
}
