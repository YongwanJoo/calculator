package src.main.java.gcukakao.jenkins.calculator.Calculator;

import gcukakao.jenkins.calculator.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class CalulatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
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
        assertEquals(2, calculator.divide(6, 3));   
    }
}
