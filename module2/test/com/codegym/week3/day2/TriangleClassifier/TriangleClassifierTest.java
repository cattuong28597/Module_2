package com.codegym.week3.day2.TriangleClassifier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("Triangle")
        public void nomalTriagle() {
            int side1 = 2;
            int side2 = 3;
            int side3 = 4;
            String expected = "This is a Triangle";
            String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
            assertEquals(expected, result);
        }
    @Test
    @DisplayName("Isosceles Triangle")
    public void isoscelesTriangle() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expected = "This is a Isosceles Triangle";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Equilateral Triangle")
    public void equilateralTriangle() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expected = "This is a Equilateral Triangle";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Right Triangle")
    public void rightTriangle() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expected = "This is a Right Triangle";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(expected, result);
    }
}

