package org.zywko.week_1;

import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadraticEquationSolverTest {

    @Test
    public void testNoSolution() {
        try {
            QuadraticEquationSolver.solve(2, 3, 4);
            fail("Expected NoSolutionException");
        } catch (QuadraticEquationSolver.NoSolutionException e) {
            assertEquals("No real solutions", e.getMessage());
        }
    }

    @Test
    public void testOneSolution() throws QuadraticEquationSolver.NoSolutionException {
        double[] solutions = QuadraticEquationSolver.solve(1, 4, 4);
        assertEquals(1, solutions.length);
        assertEquals(-2, solutions[0], 0.001);
    }

    @Test
    public void testTwoSolutions() throws QuadraticEquationSolver.NoSolutionException {
        double[] solutions = QuadraticEquationSolver.solve(2, -5, -3);
        assertEquals(2, solutions.length);
        assertEquals(3, solutions[0], 0.001);
        assertEquals(-0.5, solutions[1], 0.001);
    }

    @Test(expected = QuadraticEquationSolver.NoSolutionException.class)
    public void testInvalidInput() throws QuadraticEquationSolver.NoSolutionException {
        QuadraticEquationSolver.solve(2, 1, 2);
    }
}
