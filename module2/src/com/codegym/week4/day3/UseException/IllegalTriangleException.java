package com.codegym.week4.day3.UseException;


import java.util.Scanner;

public class IllegalTriangleException extends Throwable {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        double firstSide = scanner.nextDouble();
        System.out.print("Enter the second side: ");
        double secondSide = scanner.nextDouble();
        System.out.print("Enter the third side: ");
        double thirdSide = scanner.nextDouble();

        try {
            if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0|| firstSide+secondSide < thirdSide|| secondSide+thirdSide<firstSide|| firstSide+thirdSide<secondSide) {
                throw new IllegalTriangleException();
            }
            System.out.println("This is a triangle");
        } catch (IllegalTriangleException e){
            System.out.println("This is not a triangle");
        }

//        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0|| firstSide+secondSide < thirdSide|| secondSide+thirdSide<firstSide|| firstSide+thirdSide<secondSide) {
//            throw new IllegalTriangleException();
//        } else {
//            System.out.println("This is a Triangle");
//        }
    }
}
