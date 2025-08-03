package algebra;

import java.util.Scanner;

public class CalculadoraParcelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorParcela = 0.0;
        double entrada = 0.0;
        int parcelas = 0;

        System.out.println("Informe a quantidade de parcelas:");
        parcelas = scanner.nextInt();

        System.out.println("Informe o valor da entrada:");
        entrada = scanner.nextDouble();

        System.out.println("Informe o valor total:");
        double total = scanner.nextDouble();

        scanner.close();

        if (parcelas <= 0 || entrada < 0 || total < 0) {
            System.out.println("O valor da parcela deve ser maior ou igual a 1");
            System.out.println("O valor da entrada não pode ser um valor negativo");
            System.out.println("O valor total não pode ser um valor negativo");
            return;
        } else {
            valorParcela = (total - entrada) / parcelas;
        }

        System.out.println("O valor da parcela é = $" + String.format("%.2f", valorParcela));
    }
}
