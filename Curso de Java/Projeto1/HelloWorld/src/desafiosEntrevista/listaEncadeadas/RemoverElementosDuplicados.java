package desafiosEntrevista.listaEncadeadas;

public class RemoverElementosDuplicados {
    public static void main(String[] args) {
// Criando lista encadeada: 1 -> 1 -> 2 -> 3 -> 3 -> 4
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionar(1);
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(3);
        lista.adicionar(4);
        System.out.println("Antes de remover duplicados");
        lista.printList();

        lista.removerDuplicados();
        lista.printList();
    }

}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class ListaEncadeada {
    Node head;

    public void adicionar(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node atual = head;
        while (atual.next != null) {
            atual = atual.next;
        }
        atual.next = new Node(value);
    }

    public void removerDuplicados() {
        Node atual = head;

        while (atual != null && atual.next != null) {
            if (atual.value == atual.next.value) {
                atual.next = atual.next.next; // pula nó duplicado
            } else {
                atual = atual.next; // avança
            }
        }
    }
    public void printList() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.value + " -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }
}