package com.codegym.week2.day1;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
    int [][] matrix= new int[3][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter the Element" + "[" + i + "]" + "[" + j +"]");
                matrix[i][j] = input.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("The max Element in two-dimensional array is: " +max);
    }
}
