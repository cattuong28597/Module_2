package com.codegym.week2.day4.Point2;

public class MovabblePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.2f, 5.2f, 2.3f,2.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
