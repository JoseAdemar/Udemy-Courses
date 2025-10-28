package com.algoritimo.stringsAlgo;

public class PrefixoComStartWith {
    public static void main(String[] args) {
        String[] palavras = {"manga", "manco", "macaco"};
        System.out.println("Prefixo = " + maiorPrefixoComum(palavras));
    }

    public static String maiorPrefixoComum(String[] palavras) {
        if (palavras == null || palavras.length == 0) {
            return "";
        }

        String prefixoAtual = palavras[0];

        for (int i = 1; i < palavras.length; i++) {
            if (palavras[i] == null) return "";

            // Reduz o prefixo até que a palavra atual comece com ele
            while (!palavras[i].startsWith(prefixoAtual)) {
                prefixoAtual = prefixoAtual.substring(0, prefixoAtual.length() - 1);
                if (prefixoAtual.isEmpty()) {
                    return "";
                }
            }
        }
        return prefixoAtual;
    }
}