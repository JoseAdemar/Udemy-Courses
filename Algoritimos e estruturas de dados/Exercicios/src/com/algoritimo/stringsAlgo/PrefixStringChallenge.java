package com.algoritimo.stringsAlgo;
/**
 * De forma bem simples e direta:
 *
 * Um prefixo é qualquer pedaço do começo de uma palavra.
 *
 * Pode ser só a primeira letra, as duas primeiras, as três primeiras, e assim por diante.
 *
 * E sim — a palavra completa também é considerada um prefixo dela mesma.
 *
 * 💬 Exemplos rápidos:
 *
 * Prefixos de “casa” → “c”, “ca”, “cas”, “casa”
 *
 * Prefixos de “flor” → “f”, “fl”, “flo”, “flor”
 */

public class PrefixStringChallenge {
    public static void main(String[] args) {
        // Input: strs = ["flower","flow","flight"]
        // Output: "fl"
        String palavras[] = {"flower", "flow", "flight"};
        System.out.println("Maior prefixo comum: " + maiorPrefixo(palavras));
        //System.out.println("Maior prefixo comum: " + maiorPrefixoComStartWith(palavras));

    }

    //Funcional porém menos otimizado
    public static String maiorPrefixo(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefixo = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefixo) != 0) {
                prefixo = prefixo.substring(0, prefixo.length() - 1);
                if (prefixo.isEmpty()) return "";
            }
        }
        return prefixo;
    }

    //Forma mais otimizada
    public static String maiorPrefixoComStartWith(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefixo = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefixo)) {
                prefixo = prefixo.substring(0, prefixo.length() - 1);
                if (prefixo.isEmpty()) return "";
            }
        }
        return prefixo;
    }
}

