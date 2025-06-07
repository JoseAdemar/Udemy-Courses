package Leonardo.controle.desafios;

import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroMisterioso = 10;
        int contador = 0;

        System.out.println("TENTA ADIVINHAR UM NÚMERO ENTRE 0 E 100");
        System.out.println();

        while ((numero != numeroMisterioso) && (contador <= 3)){
            System.out.println("Escolha o número:");
            numero = sc.nextInt();
            contador ++;
        }
        if(numero <= 100 && numero >= 0 && contador <= 3){
            if(numero == numeroMisterioso){
                System.out.println("Parabéns você adivinhou " + numeroMisterioso);
                System.out.println("Sua quantidade de tentativas " + contador);
            }
        }else {
            System.out.println("Você não adivinhou, tentativas:  " + contador);
        }
        sc.close();
    }
}
