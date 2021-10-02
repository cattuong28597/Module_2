package com.codegym.week3.day2.AbsoluteNumberCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {
    @Test
    void testNumber1() {
        String number1 = "123";
        boolean expected = true;
        boolean result = AbsoluteNumberCalculator.isNumeric(number1);
        assertEquals(expected,result);
    }
    @Test
    void testNumber2() {
        String number1 = "";
        boolean expected = true;
        boolean result = AbsoluteNumberCalculator.isNumeric(number1);
        assertEquals(expected,result);
    }
    @Test
    void testNumber3() {
        String number1 = "1.1005";
        boolean expected = true;
        boolean result = AbsoluteNumberCalculator.isNumeric(number1);
        assertEquals(expected,result);
    }
    @Test
    void testNumber4() {
        String number1 = "1100.5";
        boolean expected = true;
        boolean result = AbsoluteNumberCalculator.isNumeric(number1);
        assertEquals(expected,result);
    }


//    @Test
//    void testFindAbsolute0() {
//        int number = 0;
//        int expected = 0;
//        int result = AbsoluteNumberCalculator.findAbsolute(number);
//        assertEquals(expected,result);
//    }
//    @Test
//    void testFindAbsolute1() {
//        int number = 1;
//        int expected = 1;
//        int result = AbsoluteNumberCalculator.findAbsolute(number);
//        assertEquals(expected, result);
//    }
//    @Test
//    void testFindAbsoluteNegative1() {
//        int number = -1;
//        String expected = "1";
//
//        int result = AbsoluteNumberCalculator.findAbsolute(number);
//        assertEquals(expected, result);
//    }

}