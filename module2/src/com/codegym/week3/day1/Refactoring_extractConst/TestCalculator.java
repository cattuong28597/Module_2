package com.codegym.week3.day1.Refactoring_extractConst;

public class TestCalculator {
    public static void main(String[] args) {
      int firstOperand = 1;
      int secondOperand = 1;
      char operator = '+';
      int expected = 2;
      int result = Calculator.calculate(firstOperand, secondOperand, operator);
      if (result == expected) {
          System.out.println("true");
      } else {
          System.out.println("false");
      }
    }
}
