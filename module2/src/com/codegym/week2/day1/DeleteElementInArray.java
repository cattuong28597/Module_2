package com.codegym.week2.day1;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("\n");
        int X = 3;
        int index = -1;
        for (int a = 0; a < array.length; a++) {
            if (array[a] == X) {
                index = a;
                break;
            }
        }
        if (index != -1) {
            for (int b = index; b < array.length-1; b++) {
                array[b] = array[b + 1];
            }
            array[array.length-1] = 0;
        }
        System.out.print("New array: \n");
        for (int c = 0; c < array.length-1; c++) {
            System.out.print(array[c] +"  ");
        }
    }
}
