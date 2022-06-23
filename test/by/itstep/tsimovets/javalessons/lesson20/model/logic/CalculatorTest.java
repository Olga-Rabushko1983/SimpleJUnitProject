package by.itstep.tsimovets.javalessons.lesson20.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    //Rule AAA!!!

    @Test
    public void testSum() {
        // Arrange
        int a = 11;
        int b = 3;
        int expected = 14;

        // Act
        int actual = Calculator.sum(a, b);


        // Assert
        if (expected != actual) {
            fail();
        }

    }

    @Test
    public void testSub() {
        // Arrange
        int a = 12;
        int b = 4;
        int expected = 8;

        // Act
        int actual = Calculator.sub(a, b);

        // Assert
        assertEquals(expected, actual);


    }

    @Test
    public void testMul() {
        // Arrange
        int a = 12;
        int b = 3;
        int expected = 36;

        // Act
        int actual = Calculator.mul(a, b);

        // Assert
        if (expected != actual) {
            fail();
        }

    }

    @Test
    public void testDiv() {
        // Arrange
        int a = 64;
        int b = 8;
        int expected = 8;

        // Act
        int actual = Calculator.div(a, b);

        // Assert
        if (expected != actual) {
            fail();
        }

    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        // Arrange
        int a = 64;
        int b = 0;

        Calculator.div(a, b);



    }

}
