import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAdd2() {
        Calculator calculator = new Calculator();
        assertEquals(-18, calculator.add(-15, -3));
    }


    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(6, 3));
    }

    @Test
    public void testSubtract2() {
        Calculator calculator = new Calculator();
        assertEquals(-18, calculator.subtract(-15, 3));
    }


    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(4, 3));
    }

    @Test
    public void testMultiply2() {
        Calculator calculator = new Calculator();
        assertEquals(-15, calculator.multiply(-5, 3));
    }

    @Test
    public void testMultiply3() {
        Calculator calculator = new Calculator();
        assertEquals(-48, calculator.multiply(6, -8));
    }

    @Test
    public void testMultiply4() {
        Calculator calculator = new Calculator();
        assertEquals(21, calculator.multiply(-7, -3));
    }

    @Test
    public void testMultiplyZero() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(16, 0));
    }

    @Test
    public void testMultiplyZero2() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0, 28));
    }


    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    public void testDivide2() {
        Calculator calculator = new Calculator();
        assertEquals(-2, calculator.divide(10, -5));
    }

    @Test
    public void testDivide3() {
        Calculator calculator = new Calculator();
        assertEquals(-5, calculator.divide(-35, 7));
    }

    @Test
    public void testDivide4() {
        Calculator calculator = new Calculator();
        assertEquals(0.5, calculator.divide(5, 10));
    }

    @Test
    public void testDivideByZero() {
        try {
            Calculator calculator = new Calculator();
            calculator.divide(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de divisão por zero");
        }
    }
    @Test
    public void testDivideByZero2() {
        try {
            Calculator calculator = new Calculator();
            calculator.divide(0, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro de divisão por zero");
        }
    }
}




