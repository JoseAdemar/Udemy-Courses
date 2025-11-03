package com.algoritimo.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Desafio: Dado um número inteiro, imprimir os 10 primeiros múltiplos desse número.
 *
 * Primeiro, o que é o múltiplo de um número?
 * É nada mais do que pegar um número e fazer a multiplicação dele pelos números inteiros
 * em sequência: Exemplo: Multiplo de 2 = 2x0, 2x1, 2x2, 2x3.... até o infinito.
 *
 *
 */

public class PrintItsFirst10MultiplesV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        findMultiples(N);

        bufferedReader.close();
    }
    private static void findMultiples(int number) {
        for (int i = 1; i < 11; i++) {
            int multiples = number * i;
            System.out.println(number + " x " + i + " = " + multiples);
        }
    }
}
