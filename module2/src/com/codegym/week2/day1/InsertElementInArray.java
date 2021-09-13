package com.codegym.week2.day1;

import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Element " + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        int X;
        System.out.print("Enter the number to insert: ");
        X = input.nextInt();
        int index;
        System.out.print("Enter the position wanna insert: ");
        index = input.nextInt();
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("Do not insert this element in array.");
        }
        for (int b = array.length - 1; b > index; b--) {
            array[b] = array[b - 1];
        }
        array[index] = X;
        System.out.print("New array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}
