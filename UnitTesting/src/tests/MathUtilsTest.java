package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils calculator;

    @Before
    public void setUp() {
        calculator = new MathUtils();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(-2, calculator.add(-5, 3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-8, calculator.subtract(-5, 3));
        assertEquals(0, calculator.subtract(0, 0));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(5, 3));
        assertEquals(-15, calculator.multiply(-5, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), 0.001); // delta parameter for double comparison
        assertEquals(-1.0, calculator.divide(10, 0), 0.001); // division by zero, should return -1.0
        assertEquals(0.0, calculator.divide(0, 5), 0.001); // 0 divided by any non-zero number is 0
    }
}
