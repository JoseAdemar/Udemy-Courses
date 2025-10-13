package desafiosEntrevista;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayMediaAritimetica {
    public static void main(String[] args) {
        int numeros[] = {10,20,30,40,50};
        System.out.println(calcularMedia(numeros));
        System.out.println(calcularMedia2(numeros));
        System.out.println(calcularMedia3(numeros));
        System.out.println(calcularMedia4(numeros));
    }

    public static double calcularMedia(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        return (double) soma / numeros.length;
    }

    public static double calcularMedia2(int[] numeros) {
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        return (double) soma / numeros.length;
    }

    public static double calcularMedia3(int[] numeros) {
        return Arrays.stream(numeros)
                .average()
                .orElse(0.0);
    }

    public static double calcularMedia4(int[] numeros) {
        IntSummaryStatistics stats = Arrays.stream(numeros).summaryStatistics();
        return stats.getAverage();
    }
}
