package com.codegym.week5.day5.Observer;

public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" "+Integer.toHexString(subject.getState()));
    }
}
