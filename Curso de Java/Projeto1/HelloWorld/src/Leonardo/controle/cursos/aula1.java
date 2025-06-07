package Leonardo.controle.cursos;

import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String estachovendo = "sim";
    System.out.println("Está chovendo ?");
    estachovendo = sc.nextLine();
    if(estachovendo.equalsIgnoreCase("sim")){
            System.out.println("Está chovendo vou" +
                    " ficar em casa" +
                    "e assistir um bom filme.");
        }else {
            System.out.println("Que legal," +
                    " não está chovendo, " +
                    "vou fazer uma caminhada" +
                    " no parque.");
        }
        sc.close();
    }
}
