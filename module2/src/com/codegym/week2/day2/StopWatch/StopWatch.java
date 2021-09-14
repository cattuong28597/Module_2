package com.codegym.week2.day2.StopWatch;

public class StopWatch {
    long starTime = 0;
    long stopTime = 0;
    boolean running = false;
    public void start() {
        this.starTime = System.currentTimeMillis();
        this.running = true;
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis()-starTime)/1000;
        } else  {
            elapsed = (stopTime - starTime)/1000;
        }
        return elapsed;
    }
}
