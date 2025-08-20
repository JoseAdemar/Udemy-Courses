package algoritimos.meusTestes;

import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio = 1;
        int fim = 100;
        int tentativas = 0;

        System.out.println("Pense em um número de 1 a 100. Eu vou adivinhar em no máximo 7 tentativas!");

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            tentativas++;

            System.out.println("Minha tentativa #" + tentativas + ": é " + meio + "?");
            System.out.print("Responda (maior, menor, igual): ");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("igual")) {
                System.out.println("Acertei em " + tentativas + " tentativas!");
                break;
            } else if (resposta.equals("maior")) {
                inicio = meio + 1;
            } else if (resposta.equals("menor")) {
                fim = meio - 1;
            } else {
                System.out.println("Resposta inválida, digite apenas 'maior', 'menor' ou 'igual'.");
                tentativas--; // não conta tentativa inválida
            }
        }

        scanner.close();
    }
}
