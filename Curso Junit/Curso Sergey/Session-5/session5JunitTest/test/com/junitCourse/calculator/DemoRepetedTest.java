package com.junitCourse.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoRepetedTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @DisplayName("Division 4/2 = 2")
    @RepeatedTest(3)
    void testIntegerDivision_WhenFourIsDiviedByTwo_ShouldReturnTwo(RepetitionInfo repetitionInfo, TestInfo testInfo) {
        System.out.println("Runing " + testInfo.getTestMethod().get().getName());
        System.out.println("Repetition # " + repetitionInfo.getCurrentRepetition()
        + "of " + repetitionInfo.getTotalRepetitions());

        //Arrange
        int dividend = 4;
        int divisor = 2;
        int expected = 2;

        //Act
        int result = calculator.integerDivision(dividend, divisor);

        //Assert
        assertEquals(expected, result, () -> dividend + " / " + divisor + "did not produce " + expected);
    }

}
