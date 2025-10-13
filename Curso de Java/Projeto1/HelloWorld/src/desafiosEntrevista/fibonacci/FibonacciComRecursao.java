package desafiosEntrevista.fibonacci;

public class FibonacciComRecursao {
    public static void main(String[] args) {
        int n = 10; // quantidade de termos
        System.out.println("Sequência de Fibonacci (Recursiva):");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;   // caso base 1
        if (n == 1) return 1;   // caso base 2
        return fibonacci(n - 1) + fibonacci(n - 2); // chamada recursiva
    }
}
