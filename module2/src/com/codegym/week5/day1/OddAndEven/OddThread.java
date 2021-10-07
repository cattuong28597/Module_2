package com.codegym.week5.day1.OddAndEven;

public class OddThread implements Runnable{
    private int number;

    public OddThread() {

    }

    public OddThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int i;
        int j = 0;
        if (number % 2 == 0) {
            i = number + 1;
        } else {
            i = number;
        }
        try {
            while (j < 10) {
                System.out.println(i);
                i += 2;
                j++;
                Thread.sleep(10);
            }
        } catch (Exception e) {
            System.out.println("It is over");
        }
        System.out.println("Complete!");
    }
}
