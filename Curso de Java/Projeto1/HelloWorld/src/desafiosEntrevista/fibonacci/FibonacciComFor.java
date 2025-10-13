package desafiosEntrevista.fibonacci;

public class FibonacciComFor {

    public static void main(String[] args) {
        int n = 10; // gerar os 10 primeiros números da sequência
        geraFibonacci(n);
    }
    public static void geraFibonacci(int n) {
        int primeiro = 0;
        int segundo = 1;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
