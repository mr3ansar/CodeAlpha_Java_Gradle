package com.codealpha;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Calculator calc = new Calculator();

    @Test
    @DisplayName("5 + 3 should equal 8")
    void testAdd() {
        assertEquals(8, calc.add(5, 3));
    }

    @Test
    @DisplayName("10 - 4 should equal 6")
    void testSubtract() {
        assertEquals(6, calc.subtract(10, 4));
    }

    @Test
    @DisplayName("3 * 5 should equal 15")
    void testMultiply() {
        assertEquals(15, calc.multiply(3, 5));
    }

    @Test
    @DisplayName("9 / 2 should equal 4.5")
    void testDivide() {
        assertEquals(4.5, calc.divide(9, 2), 0.001);
    }

    @Test
    @DisplayName("dividing by zero should throw an exception")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}