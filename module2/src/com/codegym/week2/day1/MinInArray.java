package com.codegym.week2.day1;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = input.nextInt();
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Element " + (i +1) + " :");
            arr[i] = input.nextInt();
            i++;
        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("Min in the array is " + min);
    }
}
