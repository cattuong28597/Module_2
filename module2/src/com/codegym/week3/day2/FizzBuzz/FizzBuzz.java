package com.codegym.week3.day2.FizzBuzz;

public class FizzBuzz {
    public static String translate(int number) {
        String translateNumber = "";
        if (number % 3 == 0 && number % 5 == 0) {
            translateNumber = "FizzBuzz";
        } else if (number % 3 == 0) {
            translateNumber = "Fizz";
        } else if (number % 5 == 0) {
            translateNumber = "Buzz";
        } else {
            translateNumber = "" + number;
        }
        return translateNumber;
    }

    public static String checkNumber(int number) {
        String checkNumber = "";
        if ((number / 10 == 3 || number % 10 == 3) && (number / 5 == 1 || number % 10 == 5)) {
            checkNumber = "FizzBuzz";
        } else if (number / 10 == 3 || number % 10 == 3) {
            checkNumber = "Fizz";
        } else if (number / 10 == 5 || number % 10 == 5) {
            checkNumber = "Buzz";
        } else {
            checkNumber = readNumber(number);
        }
        return checkNumber;
    }
    public static String readNumber(int number) {
        boolean evenDozen = number % 10 == 0;
        boolean unit = number < 10;
        String str = "";
        if (unit) {
            str =  readUnitNumber(number);
        } else if (evenDozen) {
            if(number / 10 == 1) {
                str = "mười";
            } else {
                str = readUnitNumber(number / 10) + "mươi";
            }
        } else {
            str = readUnitNumber(number / 10) + " mươi " + readUnitNumber(number % 10);
        }
       return str;
    }
    public static String readUnitNumber( int number) {
        String str = "";
        switch (number) {
            case 1:
                str = "một";
                break;
            case 2:
                str = "hai";
                break;
            case 3:
                str = "ba";
                break;
            case 4:
                str = "bốn";
                break;
            case 5:
                str = "năm";
                break;
            case 6:
                str = "sáu";
                break;
            case 7:
                str = "bảy";
                break;
            case 8:
                str = "tám";
                break;
            case 9:
                str = "chín";
                break;
        }
        return str;
    }
}
