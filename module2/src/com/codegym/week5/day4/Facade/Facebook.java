package com.codegym.week5.day4.Facade;

public class Facebook implements ISocialShare{
    private String message;

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Facebook: "+this.message);
    }
}
