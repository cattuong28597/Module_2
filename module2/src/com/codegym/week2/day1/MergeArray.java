package com.codegym.week2.day1;

import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        int size3 ;
        int [] arr1;
        int [] arr2;
        int [] arr3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size arr1: ");
        size1 = input.nextInt();
        System.out.print("Enter the size arr2: ");
        size2 = input.nextInt();
        size3 = size1 + size2;
        System.out.println("Enter the size arr3: "+size3);
        arr1 = new int[size1];
        int i = 0;
        while (i < arr1.length) {
            System.out.println("Element " +(i+1)+ " in arr1: ");
            arr1[i] = input.nextInt();
            i++;
        }
        arr2 = new int[size2];
        int j = 0;
        while (j < arr2.length) {
            System.out.println("Element "+(j +1) +" in arr2: ");
            arr2[j] = input.nextInt();
            j++;
        }
        arr3 = new int[size3];
        for (int z = 0;z < arr1.length; z++) {
            arr3[z] = arr1[z];
        }
        for (int t = 0; t < arr2.length; t++) {
            arr3[t+ arr1.length] = arr2[t];
        }
        System.out.println("Array 3 consists: ");
        System.out.println(Arrays.toString(arr3));
    }
}
