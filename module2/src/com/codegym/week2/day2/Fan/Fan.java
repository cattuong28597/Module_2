package com.codegym.week2.day2.Fan;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";
    public Fan() {
    }
    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSlow() {
        return SLOW;
    }
    public int getMedium() {
        return MEDIUM;
    }
    public int getFast() {
        return FAST;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void getColor(String color) {
        this.color = color;
    }
    public String toString() {
        String str;
        if (on) {
            str = "Fan is on with speed: "+this.speed+", color: "+this.color+", radius: "+this.radius;
        } else {
            str = "Fan is off with color: "+this.color+", radius: "+this.radius;
        }
        return str;
    }
}
