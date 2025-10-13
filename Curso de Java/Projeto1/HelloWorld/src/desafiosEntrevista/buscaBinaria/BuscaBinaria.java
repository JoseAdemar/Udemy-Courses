package desafiosEntrevista.buscaBinaria;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        int alvo = 9;

        int resultado = buscaBinaria(numeros, alvo);

        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo) {
                return meio;
            } else if (array[meio] < alvo) {
                inicio = meio + 1; // procura na metade direita
            } else {
                fim = meio - 1; // procura na metade esquerda
            }
        }
        return -1; // não encontrou
    }
}

