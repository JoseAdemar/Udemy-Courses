package com.algoritimo.stringsAlgo;

public class PrefixMinhaVersao {
    public static void main(String[] args) {
        String palavras[] = {"arroz", "arrogante", "aro"};
        System.out.println("Prefixo em comum encontrado = " + encontraPrefixo(palavras));
    }
    public static String encontraPrefixo(String words[]) {
        if (words == null || words.length == 0) {
            return "";
        }

        String prefixoAtual = words[0];
        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefixoAtual) != 0) {
                prefixoAtual = prefixoAtual.substring(0,prefixoAtual.length() - 1);
                if (prefixoAtual.isEmpty()) return "";
            }
        }
        return prefixoAtual;
    }
}
