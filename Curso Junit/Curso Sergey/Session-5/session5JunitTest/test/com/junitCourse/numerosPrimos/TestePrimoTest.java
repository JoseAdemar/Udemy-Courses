package com.junitCourse.numerosPrimos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestePrimoTest {

    @ParameterizedTest
    @DisplayName("Valida se um numero é primo sem raiz quadrada")
    @ValueSource(ints = {2,3,7})
    void ehPrimoSemRaiz_deve_retornar_true_quando_um_numero_for_primo(int numeroTestado) {
        assertTrue(TestePrimo.ehPrimoSemRaiz(numeroTestado));

    }

    @ParameterizedTest
    @DisplayName("Valida se um numero não é primo sem raiz quadrada")
    @ValueSource(ints = {4,8,10})
    void ehPrimoSemRaiz_deve_retornar_false_quando_um_numero_nao_for_primo(int numeroTestado) {
        assertFalse(TestePrimo.ehPrimoSemRaiz(numeroTestado));

    }

    @ParameterizedTest
    @DisplayName("Valida se um numero não é primo sem raiz quadrada quando o valor for menor que 2")
    @ValueSource(ints = {1,-1,-2,-3,-4})
    void ehPrimoSemRaiz_deve_retornar_false_quando_um_numero_for_menor_que_dois(int numeroTestado) {
        assertFalse(TestePrimo.ehPrimoSemRaiz(numeroTestado));
    }

    @ParameterizedTest
    @DisplayName("Valida se um numero é primo baseado em raiz quadrada")
    @ValueSource(ints = {2,3,7})
    void ehPrimoComRaiz_deve_retornar_true_quando_um_numero_for_primo(int numeroTestado) {
       assertTrue(TestePrimo.ehPrimoComRaiz(numeroTestado));
    }

    @ParameterizedTest
    @DisplayName("Valida se um numero não é primo baseado em raiz quadrada")
    @ValueSource(ints = {4,8,10})
    void ehPrimoComRaiz_deve_retornar_false_quando_um_numero_nao_for_primo(int numeroTestado) {
        assertFalse(TestePrimo.ehPrimoComRaiz(numeroTestado));
    }

    @ParameterizedTest
    @DisplayName("Valida se um numero não é primo baseado em raiz quadrada quando o valor for menor que 2")
    @ValueSource(ints = {1,-1,-2,-3,-4})
    void ehPrimoComRaiz_deve_retornar_false_quando_um_numero_for_menor_que_dois(int numeroTestado) {
        assertFalse(TestePrimo.ehPrimoComRaiz(numeroTestado));
    }
}