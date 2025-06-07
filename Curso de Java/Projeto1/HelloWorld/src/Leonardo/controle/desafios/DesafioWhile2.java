package Leonardo.controle.desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double nota = 0.0;
        double media = 0.0;
        int contador = 0;

        while (nota != -1){
            System.out.println("Digite uma nota");
            nota = sc.nextDouble();
            if(nota >=0 && nota <=10) {
                contador ++;
                total += nota;
            }else if(nota != -1){
                System.out.println("Nota inválida.");
            }

        }

        media = total / contador;
        System.out.println("Media = " + media);
    }
}
