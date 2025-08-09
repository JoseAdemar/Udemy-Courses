package com.junitCourse.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int divison = calculator.integerDivision(4, 2);

        int subtraction = calculator.integerSubtraction(4,2);


        System.out.println(divison);
        System.out.println(subtraction);

    }
}