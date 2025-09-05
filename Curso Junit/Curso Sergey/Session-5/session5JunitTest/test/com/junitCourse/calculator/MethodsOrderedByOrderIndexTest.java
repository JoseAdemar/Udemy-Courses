package com.junitCourse.calculator;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //Ordena a execução do métodos pela ordem dos indices.
public class MethodsOrderedByOrderIndexTest {

    @Order(1)
    @Test
    void testB() {
        System.out.println("Running test B");
    }

    @Order(2)
    @Test
    void testA() {
        System.out.println("Running test A");
    }

    @Order(3)
    @Test
    void testD() {
        System.out.println("Running test D");
    }

    @Order(4)
    @Test
    void testC() {
        System.out.println("Running test C");
    }


}