package com.junitCourse.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Test Math operations in Calculator class")
class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @DisplayName("Division 4/2 = 2")
    @Test
    void testIntegerDivision_WhenFourIsDiviedByTwo_ShouldReturnTwo() {
        //Arrange
        int dividend = 4;
        int divisor = 2;
        int expected = 2;

        //Act
        int result = calculator.integerDivision(dividend,divisor);

        //Assert
        assertEquals(expected, result, () -> dividend + " / " + divisor + "did not produce " + expected);
    }

    @DisplayName("Division by Zero")
    @Test
    void testIntegerDivision_WhenDividendIsDiviedByZero_ShouldThrowArithmeticException() {
        //Arrange
        int dividend = 4;
        int divisor = 0;
        String expectedExceptionMessage = "/ by zero";

        //Act and Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> {
            int result = calculator.integerDivision(dividend, divisor);
        });

        //Assert
        assertEquals(expectedExceptionMessage, actualException.getMessage(),
                () -> dividend + " / " + divisor + " Unexpected Message");
    }

    @DisplayName("Test 4 - 2 = 2")
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

    @DisplayName("Test integer subtraction [minuend, subtrahend, expected")
    @ParameterizedTest
    @MethodSource("integerSubtractionInputParameters")
    void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
        System.out.println("Runing Test " + minuend + "-" + subtrahend + "=" + expectedResult);

        int actualResult = calculator.integerSubtraction(minuend, subtrahend);
        assertEquals(expectedResult, actualResult, ()-> minuend + "-" + subtrahend + " did not produce " + expectedResult);
    }

    private static Stream<Arguments> integerSubtractionInputParameters () {
        return Stream.of(Arguments.of(33, 1, 32),
                Arguments.of(54, 1, 53),
                Arguments.of(24, 1, 23));
    }
}