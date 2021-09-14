package com.codegym.week2.day2.StopWatch;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
       int [] a;
       a = new int[100000];
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
       for (int i = 0; i < 100000; i++) {
           a[i] = (int)(Math.random() * 1000001);
       }
        System.out.println(Arrays.toString(a));
       Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        stopWatch.stop();
        System.out.println("The time need to run is: "+stopWatch.getElapsedTime());
    }
}
