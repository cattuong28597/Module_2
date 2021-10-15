package com.codegym.week5.day5.Observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
