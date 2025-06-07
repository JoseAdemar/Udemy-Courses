package Leonardo.controle.desafios;

import java.util.Scanner;

public class EntreNumeroZeroEdez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Informe um número:");
        numero = sc.nextInt();

        if(numero >0 && numero <10){
           if(numero % 2 == 0){
               System.out.println("Número está entre 0 e 10 e é par " + numero);
           }
        }
        sc.close();

    }
}
