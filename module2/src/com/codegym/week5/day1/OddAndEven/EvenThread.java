package com.codegym.week5.day1.OddAndEven;

public class EvenThread implements Runnable {
    private int number;

    public EvenThread() {
    }

    public EvenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int i;
        int j = 0;
        if (number % 2 == 0) {
            i = number;
        } else {
            i = number + 1;
        }
        try {
            while (j < 10) {
                System.out.println(i);
                i += 2;
                j++;
                Thread.sleep(15);
            }
        } catch (Exception e) {
            System.out.println("It is over");
        }
        System.out.println("Complete!");
    }
}
