package com.codegym.week5.day1.SimpleThread;

public class NumberGenerator implements Runnable {
    private int number;
    public NumberGenerator() {

    }

    public NumberGenerator(int i) {
        this.number = i;
    }

    @Override
    public void run() {
        try {
            int i = this.number;
            System.out.println("Cac so can tim la: ");
            while (i < number+10) {
                System.out.println(i);
                i++;
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("It's over!");
        }
        System.out.println("Complete!");
    }
}
