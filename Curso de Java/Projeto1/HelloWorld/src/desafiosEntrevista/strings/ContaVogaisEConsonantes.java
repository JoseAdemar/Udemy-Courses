package desafiosEntrevista.strings;

import java.util.Arrays;
import java.util.List;

public class ContaVogaisEConsonantes {
    public static void main(String[] args) {
        String[] vogais = {"a","e","i","o","u"};
        String palavra = "Entrevista";
        contadorDeVogaisEConsonantes(vogais, palavra);
    }

    public static void contadorDeVogaisEConsonantes(String[] vogais, String palavra) {
        List<String> listaVogais = Arrays.asList(vogais);
        int contadorVogais = 0;
        int contadorConsoantes = 0;

        for (char c : palavra.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if (listaVogais.contains(String.valueOf(c))) {
                    contadorVogais++;
                } else {
                    contadorConsoantes++;
                }
            }
        }

        System.out.println("Total de vogais = " + contadorVogais);
        System.out.println("Total de consoantes = " + contadorConsoantes);
    }
}
