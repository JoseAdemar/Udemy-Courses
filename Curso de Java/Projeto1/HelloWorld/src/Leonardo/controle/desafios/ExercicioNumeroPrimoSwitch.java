package Leonardo.controle.desafios;

import java.util.Scanner;

public class ExercicioNumeroPrimoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String mensagem = "é primo";
        System.out.println("Informe o número: ");
        numero = sc.nextInt();
        if (numero <= 1) {
            mensagem = "é primo";
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                mensagem = "Não é primo";
            }
        }
        //System.out.println(mensagem);
        sc.close();

        switch (mensagem.toLowerCase()) {
            case "é primo":
                System.out.println("Sim, é primo");
                break;
            default: {
                System.out.println("Não é um número primo");
            }
        }
    }
}
