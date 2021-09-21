package com.codegym.week3.day2.FizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
@Test
    @DisplayName("năm_mươi_sáu")
    public void namsau() {
    int number = 56;
    String expected = "Buzz";
    String result = FizzBuzz.checkNumber(number);
    assertEquals(expected, result);

}
    @Test
    @DisplayName("hai_mươi_tám")
    public void haitam() {
        int number = 28;
        String expected = "hai mươi tám";
        String result = FizzBuzz.checkNumber(number);
        assertEquals(expected, result);
    }
}
