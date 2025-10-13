package desafiosEntrevista.buscaBinaria;

public class BuscaBinaria2 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14};
        int alvo = 10;
        int resultado = encontraNumeroAlvo(numeros, alvo);

        if (resultado != -1) {
            imprimeResultado(resultado, numeros[resultado]);
        } else {
            System.out.println("Alvo não encontrado.");
        }
    }

    public static int encontraNumeroAlvo(int[] numeros, int alvo) {
        int inicio = 0;
        int fim = numeros.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (numeros[meio] == alvo) {
                return meio;
            } else if (numeros[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1; // não encontrou
    }

    public static void imprimeResultado(int posicao, int valor) {
        System.out.println("Alvo encontrado na posição " + posicao + " com o valor " + valor);
    }
}