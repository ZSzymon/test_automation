package org.zywko.week_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2, calculator.divide(4, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(4, 0);
    }
}
