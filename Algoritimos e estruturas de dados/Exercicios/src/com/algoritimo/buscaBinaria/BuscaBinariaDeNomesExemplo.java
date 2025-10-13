package com.algoritimo.buscaBinaria;

public class BuscaBinariaDeNomesExemplo {
    public static void main(String[] args) {
        // Array com 128 nomes fictícios
        String[] nomes = {
                "Alice","Amanda","Ana","André","Antonio","Beatriz","Bruna","Bruno",
                "Camila","Carla","Carlos","Cecilia","Daniel","Daniela","David","Diego",
                "Eduardo","Elaine","Eliana","Elisa","Fabio","Fernanda","Fernando","Felipe",
                "Gabriel","Gabriela","Gustavo","Gisele","Heloisa","Henrique","Igor","Isabela",
                "João","Juliana","Júlio","Jéssica","Karen","Karina","Kleber","Laura",
                "Leonardo","Letícia","Lucas","Luana","Marcelo","Marcos","Maria","Mariana",
                "Natalia","Nathan","Paula","Paulo","Pedro","Priscila","Rafael","Raquel",
                "Renata","Ricardo","Rodrigo","Roberta","Samuel","Sandra","Sofia","Sérgio",
                "Tatiane","Thiago","Tiago","Valentina","Vanessa","Vinicius","Vitor","Viviane",
                "William","Wesley","Yara","Yuri","Zélia","Zé","Alice1","Alice2","Alice3","Alice4",
                "Bruno1","Bruno2","Bruno3","Bruno4","Carla1","Carla2","Carla3","Carla4",
                "Daniel1","Daniel2","Daniel3","Daniel4","Eduardo1","Eduardo2","Eduardo3","Eduardo4",
                "Fernanda1","Fernanda2","Fernanda3","Fernanda4","Gabriel1","Gabriel2","Gabriel3","Gabriel4",
                "Heloisa1","Heloisa2","Heloisa3","Heloisa4","João1","João2","João3","João4",
                "Lucas1","Lucas2","Lucas3","Lucas4","Mariana1","Mariana2","Mariana3","Mariana4",
                "Pedro1","Pedro2","Pedro3","Pedro4","Rafael1","Rafael2","Rafael3","Rafael4",
                "Thiago1","Thiago2","Thiago3","Thiago4","Vinicius1","Vinicius2","Vinicius3","Vinicius4"
        };

        // Ordenando alfabeticamente para busca binária
        java.util.Arrays.sort(nomes);

        // Nome que queremos procurar
        String alvo = "Vinicius4";

        int tentativas = 0;
        int inicio = 0;
        int fim = nomes.length - 1;
        boolean encontrado = false;

        while (inicio <= fim) {
            tentativas++;
            int meio = (inicio + fim) / 2;

            int comparacao = nomes[meio].compareTo(alvo);

            if (comparacao == 0) {
                System.out.println("Encontrado: " + nomes[meio]);
                System.out.println("Tentativas: " + tentativas);
                encontrado = true;
                break;
            }

            if (comparacao < 0) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado!");
        }
    }
}