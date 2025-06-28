package junitdemo;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Before each test - calculator created");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("After each test - calculator set to null");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testAddNegative() {
        int result = calculator.add(-2, -3);
        assertEquals(-5, result);
    }
}
