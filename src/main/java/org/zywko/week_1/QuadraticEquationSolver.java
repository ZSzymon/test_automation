package org.zywko.week_1;

public class QuadraticEquationSolver {

    public static class NoSolutionException extends Exception {
        public NoSolutionException(String message) {
            super(message);
        }
    }

    public static double[] solve(double a, double b, double c) throws NoSolutionException {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            throw new NoSolutionException("No real solutions");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new double[] {x};
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {x1, x2};
        }
    }
}
