package Leonardo.controle.desafios;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = 0;
        System.out.println("Informe o ano: ");
        ano = sc.nextInt();

        if(ano % 4 == 0 && ano % 400 == 0 && ano % 100 == 0){
            System.out.println("O ano " + ano + " é um ano bissexto.");
        }else{
            System.out.println("O ano " + ano + " não é um ano bissexto.");
        }

        sc.close();
    }

}
