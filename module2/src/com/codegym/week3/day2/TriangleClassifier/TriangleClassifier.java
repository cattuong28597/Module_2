package com.codegym.week3.day2.TriangleClassifier;

public class TriangleClassifier {
    public static String triangleClassifier(int side1, int side2, int side3) {
        String triangleClassifier = "";
        boolean isTriangle = side1 + side2 >= side3 && side2 + side3 >= side1 && side1 + side3 >= side2;
        boolean isIsoscelesTriangle = side1 == side2 || side1 == side3 || side2 == side3;
        boolean isEquilateralTriangle = side1 == side2 && side1 == side3;
        boolean isRightTriangle = (side1 * side1 + side2 * side2) == side3 * side3 || (side1 * side1 + side3 * side3) == side2 * side2 || (side3 * side3 + side2 * side2) == side1 * side1;
        if (isTriangle) {
            if (isEquilateralTriangle) {
                triangleClassifier = "This is a Equilateral Triangle";
            } else if (isIsoscelesTriangle) {
                triangleClassifier = "This is a Isosceles Triangle";
            } else if (isRightTriangle) {
                triangleClassifier = "This is a Right Triangle";
            } else {
                triangleClassifier = "This is a Triangle";
            }
        } else {
            triangleClassifier = "This is not a Triangle";
        }
        return triangleClassifier;
    }
}
