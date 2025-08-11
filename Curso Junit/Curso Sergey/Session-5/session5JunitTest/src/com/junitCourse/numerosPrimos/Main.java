package com.junitCourse.numerosPrimos;

public class Main {
    public static void main(String[] args) {
        int numero = 1_000_003; // número grande primo

        long inicio1 = System.nanoTime();
        TestePrimo.ehPrimoSemRaiz(numero);
        long fim1 = System.nanoTime();
        System.out.println("Sem raiz quadrada: " + (fim1 - inicio1) / 1_000_000.0 + " ms");
        System.out.println(TestePrimo.ehPrimoSemRaiz(numero));

        long inicio2 = System.nanoTime();
        TestePrimo.ehPrimoComRaiz(numero);
        long fim2 = System.nanoTime();
        System.out.println("Com raiz quadrada: " + (fim2 - inicio2) / 1_000_000.0 + " ms");
        System.out.println(TestePrimo.ehPrimoComRaiz(numero));
    }
}
