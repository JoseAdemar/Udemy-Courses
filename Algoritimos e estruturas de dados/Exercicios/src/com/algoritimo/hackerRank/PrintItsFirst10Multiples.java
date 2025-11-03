package com.algoritimo.hackerRank;

import java.util.Scanner;

/**
 * Desafio: Dado um número inteiro, imprimir os 10 primeiros múltiplos desse número.
 *
 * Primeiro, o que é o múltiplo de um número?
 * É nada mais do que pegar um número e fazer a multiplicação dele pelos números inteiros
 * em sequência: Exemplo: Multiplo de 2 = 2x0, 2x1, 2x2, 2x3.... até o infinito.
 *
 *
 */

public class PrintItsFirst10Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number:");
        int number = scanner.nextInt();
        findMultiples(number);

    }

    private static void findMultiples(int number) {
        for (int i = 1; i < 11; i++) {
            int multiples = number * i;
            System.out.println(number + " x " + i + " = " + multiples);
        }
    }
}
