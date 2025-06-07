package Leonardo.controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "";


        while (!texto.equalsIgnoreCase("sair")) {
            System.out.println("Digite: ");
            texto = sc.nextLine();
        }
        sc.close();
    }
}
