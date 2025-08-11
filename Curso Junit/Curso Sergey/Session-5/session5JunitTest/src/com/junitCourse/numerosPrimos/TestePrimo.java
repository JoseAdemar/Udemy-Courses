package com.junitCourse.numerosPrimos;



public class TestePrimo {

    // Método sem raiz quadrada (O(n))
    public static boolean ehPrimoSemRaiz(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Método com raiz quadrada (O(√n))
    public static boolean ehPrimoComRaiz(int n) {
        if (n < 2) return false;
        int raiz = (int) Math.sqrt(n);
        for (int i = 2; i <= raiz; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

}

