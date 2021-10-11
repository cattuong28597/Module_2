package com.codegym.week4.TriangleShape;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Population {
    private static class NotNumber extends Exception{
        public NotNumber(int number) {
            super("phai lon hon khong");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people;
//        double people = 6000000;
        try {
            people = input.nextInt();
            if (people<=0) {
                throw new NotNumber(people);
            }
            double population;
            double i = Math.pow((1+1.8/100),10);
            population = people * i;
            System.out.println(population);
        } catch (NotNumber e) {
            System.out.println("Do not integer");
            System.out.println(e.getMessage());;
        }

    }
}
