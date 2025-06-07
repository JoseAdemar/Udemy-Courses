package Leonardo.controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "123";
        do{
            System.out.println("Digite a senha");
            senha = sc.nextLine();
        }while (!senha.equalsIgnoreCase("123"));
        System.out.println("Login com sucesso!");
    }
}
