package desafiosEntrevista.buscaBinaria;

public class BuscaBinariaRecursiva {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14};
        int alvo = 10;

        int resultado = buscaBinariaRecursiva(numeros, alvo, 0, numeros.length - 1);

        if (resultado != -1) {
            imprimeResultado(resultado, numeros[resultado]);
        } else {
            System.out.println("Alvo não encontrado.");
        }
    }

    public static int buscaBinariaRecursiva(int[] numeros, int alvo, int inicio, int fim) {
        // Caso base: intervalo inválido → não encontrou o número
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (numeros[meio] == alvo) {
            return meio; // Encontrou o alvo
        } else if (numeros[meio] < alvo) {
            // Busca na metade direita
            return buscaBinariaRecursiva(numeros, alvo, meio + 1, fim);
        } else {
            // Busca na metade esquerda
            return buscaBinariaRecursiva(numeros, alvo, inicio, meio - 1);
        }
    }

    public static void imprimeResultado(int posicao, int valor) {
        System.out.println("Alvo encontrado na posição " + posicao + " com o valor " + valor);
    }
}
