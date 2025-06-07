package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    public double precoComDesconto(){
       // return this.preco - desconto;
        return this.preco * (1 - this.desconto);
    }
}
