package org.zywko.week_1;

public class Triangle {
    public double calculateArea(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Input data is corrupted.");
        }
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }
}

