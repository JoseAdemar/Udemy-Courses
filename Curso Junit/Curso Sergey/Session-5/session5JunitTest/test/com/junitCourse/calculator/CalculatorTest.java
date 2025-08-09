package com.junitCourse.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    void integerDivision() {
        //Arrange
        int dividend = 4;
        int divisor = 2;
        int expected = 2;

        //Act
        int result = calculator.integerDivision(dividend,divisor);

        //Assert
        assertEquals(expected, result, () -> dividend + " / " + divisor + "did not produce " + expected);
    }

    @Test
    void integerSubtraction() {
        //Arrange
        int minuend = 4;
        int subtrahend = 2;
        int expected = 2;

        //Act
        int result = calculator.integerSubtraction(minuend,subtrahend);

        //Assert
        assertEquals(expected, result, new Supplier<String>() {
            @Override //Testing the supplier
            public String get() {
                return minuend + " - " + subtrahend + " did not produce " + expected;
            }
        });
    }
}