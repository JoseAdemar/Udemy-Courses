package desafiosEntrevista.listaEncadeadas;

public class ListaEncadeadaDesafio {
    public static void main(String[] args) {
        //5 -> 5 -> 7 -> 8 -> 8 -> 8 -> 9 -> null
        ListaEncadeadas lista = new ListaEncadeadas();
        lista.adicionar(5);
        lista.adicionar(5);
        lista.adicionar(7);
        lista.adicionar(8);
        lista.adicionar(8);
        lista.adicionar(8);
        lista.adicionar(9);

        lista.imprimirListaEncadeada();
    }

}

class No {
    int valor;
    No proximo = null;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
}


class ListaEncadeadas {
    No head;

    public void adicionar(int valor) {
        No noAtual = null;
        if (head == null) {
           head = new No(valor);
           return;
        }
        noAtual = head;
        while (noAtual.proximo != null) {
            noAtual = noAtual.proximo;
        }

        noAtual.proximo = new No(valor);
    }

    public void imprimirListaEncadeada() {
        No noAtual = head;
        while (noAtual != null) {
            System.out.print(noAtual.valor + "-->");
            noAtual = noAtual.proximo;
        }
        System.out.println("null");
    }
}