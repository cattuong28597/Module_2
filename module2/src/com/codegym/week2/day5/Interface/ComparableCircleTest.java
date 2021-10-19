package com.codegym.week2.day5.Interface;

import java.util.Arrays;
import java.util.Collection;

public class ComparableCircleTest  {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);


        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
//        for (int i = circles.length-1; i >= 0; i--) {
//            System.out.println(circles[i]);
//        }
    }
    }

