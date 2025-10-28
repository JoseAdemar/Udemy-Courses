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
 *
 * O while é a parte central do algoritmo.
 * Ele verifica se o prefixo (inicialmente o primeiro elemento do array) é igual o prefixo inicial
 * do segundo.
 *
 * Se não existir, indexOf(prefixo) retorna -1 e o while entra em ação, encurtando o prefixo letra por letra.
 *
 * Se o prefixo for encontrado no início da string, indexOf(prefixo) retorna 0 que seria a primeira prosição do array,
 * o que faz o while parar.
 * Esse processo se repete para cada elemento do array, sempre garantindo que o prefixo seja uma substring
 * inicial da palavra atual.
 * O loop termina quando encontramos o maior prefixo comum entre todas as strings ou quando o prefixo se torna vazio.
 */

public class PrefixStringChallenge {
    public static void main(String[] args) {
        // Input: strs = ["flower","flow","flight"]
        // Output: "fl"
        String palavras[] = {"Arroz", "feijao", "arrogante", "aro"};
        System.out.println("Maior prefixo comum: " + maiorPrefixo(palavras));
        //System.out.println("Maior prefixo comum: " + maiorPrefixoComStartWith(palavras));

    }

    //Funcional porém menos otimizado
    public static String maiorPrefixo(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefixo = strs[0];
        int elemento = prefixo.indexOf(prefixo);
        for (int i = 1; i < strs.length; i++) {
            int result = strs[i].indexOf(prefixo);
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

