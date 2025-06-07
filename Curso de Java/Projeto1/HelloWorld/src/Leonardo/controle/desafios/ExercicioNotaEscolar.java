package Leonardo.controle.desafios;

import java.util.Scanner;

public class ExercicioNotaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 =0.0;
        double nota2 = 0.0;
        System.out.println("Nota1: ");
        nota1 = sc.nextDouble();

        System.out.println("Nota2: ");
        nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 7.0){
            System.out.println("Aprovado");
        }else if(media < 7 && media > 4){
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
