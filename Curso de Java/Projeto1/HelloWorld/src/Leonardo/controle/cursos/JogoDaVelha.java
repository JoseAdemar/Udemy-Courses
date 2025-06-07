package Leonardo.controle.cursos;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        char jogadorAtual = 'X';
        boolean jogoAcabou = false;

        // Inicializa o tabuleiro
        inicializarTabuleiro(tabuleiro);

        while (!jogoAcabou) {
            exibirTabuleiro(tabuleiro);

            // Obtém a jogada do jogador
            int[] jogada = obterJogada(jogadorAtual);

            // Verifica se a jogada é válida
            if (jogadaValida(tabuleiro, jogada)) {
                tabuleiro[jogada[0]][jogada[1]] = jogadorAtual;

                // Verifica se o jogador venceu
                if (verificarVitoria(tabuleiro, jogadorAtual)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("Jogador " + jogadorAtual + " venceu!");
                    jogoAcabou = true;
                } else if (tabuleiroCheio(tabuleiro)) {
                    exibirTabuleiro(tabuleiro);
                    System.out.println("O jogo terminou em empate!");
                    jogoAcabou = true;
                } else {
                    jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Jogada inválida. Tente novamente.");
            }
        }
    }

    // Inicializa o tabuleiro com espaços em branco
    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    // Exibe o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Obtém a jogada do jogador
    public static int[] obterJogada(char jogador) {
        Scanner scanner = new Scanner(System.in);
        int[] jogada = new int[2];
        System.out.print("Jogador " + jogador + ", insira a linha (0-2): ");
        jogada[0] = scanner.nextInt();
        System.out.print("Jogador " + jogador + ", insira a coluna (0-2): ");
        jogada[1] = scanner.nextInt();
        return jogada;
    }

    // Verifica se a jogada é válida
    public static boolean jogadaValida(char[][] tabuleiro, int[] jogada) {
        int linha = jogada[0];
        int coluna = jogada[1];
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ';
    }

    // Verifica se um jogador venceu
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            // Verifica linhas e colunas
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        // Verifica diagonais
        return (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador);
    }

    // Verifica se o tabuleiro está cheio (empate)
    public static boolean tabuleiroCheio(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

