package model;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testAdd() throws Exception{
        Calculator calculator = new Calculator();
        int n = calculator.add(2, 2);

        assertEquals(4, n);
    }

    public void testDivision() {
        Calculator calculator = new Calculator();
        int n = calculator.division(8, 2);

        assertEquals(4, n);
    }

    public void testMultiply() {
        Calculator calculator = new Calculator();
        int n = calculator.multiply(2, 3);

        assertEquals(6, n);
    }

    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int n = calculator.subtraction(5, 2);

        assertEquals(3, n);
    }
}