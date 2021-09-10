package com.codegym.week1.day2;

import java.util.Scanner;

public class FirstTwentyPrime {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numbers;
        System.out.println("Enter the number");
      numbers = input.nextInt();
      int count = 0;
      int N = 2;

      while (count < numbers) {
          boolean check = true;
          for (int i = 2;i < Math.sqrt(N); i++) {
              if (N % i == 0) {
                  check = false;
              }
          }
          if (check) {
              System.out.println(" " + N);
              count++;
          }
          N++;
      }
    }
}
