package org.zywko.week_1;

import junit.framework.TestCase;

import org.junit.Before;
        import org.junit.Test;
        import static org.junit.Assert.*;

public class TriangleTest{
    private Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle();
    }

    @Test
    public void testCalculateArea() {
        assertEquals(triangle.calculateArea(3, 4, 5), 6, 0.001);
        assertEquals(triangle.calculateArea(5, 12, 13), 30, 0.001);
        assertEquals(triangle.calculateArea(7, 8, 9), 26.83, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAreaInvalidInput() {
        triangle.calculateArea(1, 2, 3);
        triangle.calculateArea(3, 4, 7);
        triangle.calculateArea(5, 10, 20);
    }
}
