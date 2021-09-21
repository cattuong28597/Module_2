package com.codegym.week3.day2.NextDayCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
@Test
   @DisplayName("1-1-2018")
    public void nextDay112018 () {
    int day = 1;
    int month = 1;
    int year = 2018;
    String expected = "2-1-2018";
    String result = NextDayCalculator.nextDay(day,month,year);
   assertEquals(expected,result);
}
@Test
    @DisplayName("28-2-2019")
    public void nextDay282018() {
    int day = 28;
    int month = 2;
    int year = 2019;
    String expected = "1-3-2019";
    String result = NextDayCalculator.nextDay(day, month, year);
    assertEquals(expected,result);
}
@Test
    @DisplayName("31-12-2020")
    public void nextDay31122020() {
    int day = 31;
    int month = 12;
    int year = 2020;
    String expected = "1-1-2021";
    String result = NextDayCalculator.nextDay(day, month, year);
    assertEquals(expected,result);
}
}