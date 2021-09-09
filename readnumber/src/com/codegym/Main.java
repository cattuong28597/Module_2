package com.codegym;

import java.util.Scanner;

public class Main {
    public static  String readOneToNine (int a) {
        String str = "";
        switch (a) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
        }
        return str;
    }
    public static String readTenToNineteen (int b) {
        String str = "";
        switch (b) {
            case 0:
                str = "ten";
                break;
            case 1:
                str = "elevent";
                break;
            case 2:
                str = "twelve";
                break;
            case 3:
                str = "thirteen";
                break;
            case 5:
                str = "fifteen";
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                str = readOneToNine(b) + "teen";
                break;
        }
        return str;
    }
    public static String readTwentyToNinety (int c) {
        String str = "";
        switch (c) {
            case 2:
                str = "twenty";
                break;
            case 3:
                str = "thirty";
                break;
            case 5:
                str = "fifty";
                break;
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
                str = readOneToNine(c) + "ty";
                break;
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String readNumber = "";
        int number = scanner.nextInt();
        int hundred = number / 100;
        int dozen = number % 100;
        int unit = dozen % 10;
        if (hundred != 0) {
            if (number % 100 == 0) {
                readNumber += readOneToNine(hundred) + " hundred ";
            } else {
                readNumber += readOneToNine(hundred) + " hundred and ";
            }
        }
        if (dozen >= 20) {
            if (dozen % 10 == 0) {
                readNumber += readTwentyToNinety(dozen / 10);
            } else {
                readNumber += readTwentyToNinety(dozen / 10) + " " + readOneToNine(unit);
            }
        } else {
            if (dozen >= 10) {
                readNumber += readTenToNineteen(unit);
            } else {
                readNumber += readOneToNine(unit);
            }
        }
        System.out.print(readNumber);
    }
}
