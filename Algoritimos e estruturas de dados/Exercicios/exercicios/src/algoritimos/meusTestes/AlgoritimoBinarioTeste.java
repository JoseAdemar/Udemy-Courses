package algoritimos.meusTestes;

public class AlgoritimoBinarioTeste {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int valorAtual = lista.length -1;
        int valorInicial = 0;
        int numeroSorteado = 20;
        int tentativas = 0;

        while (valorInicial <= valorAtual) {
            int meio = (valorInicial + valorAtual) / 2;
            int chute = lista[meio];
            tentativas ++;
            if (isChuteIgualGuess(chute, numeroSorteado)){
                System.out.println("Você acertou, número sorteado:" + chute + " tentativas " + tentativas);
                return;
            }
            if (chuteMaiorQueNumeroSorteado(chute, numeroSorteado)){
                valorAtual = (meio - 1);
            } else if(chuteMenorQueNumeroSorteado(chute, numeroSorteado)) {
                valorInicial = (meio + 1);
            }
        }
    }

    private static boolean chuteMenorQueNumeroSorteado(int result, int guess) {
        return result < guess;
    }

    private static boolean isChuteIgualGuess(int result, int guess) {
        return result == guess;
    }

    private static boolean chuteMaiorQueNumeroSorteado(int result, int numeroEscolhido) {
        return result > numeroEscolhido;
    }
}
