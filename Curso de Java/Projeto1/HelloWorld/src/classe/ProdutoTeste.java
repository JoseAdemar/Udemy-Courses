package classe;

import java.util.Locale;

public class ProdutoTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 10.00;
        p1.desconto = 0.30;

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.00;
        p2.desconto = 0.40;

        System.out.printf( "Produto1 %s\nProduto2 %s\n",p1.nome, p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
        System.out.printf("Média de preço = %.2f",  (precoFinal1 + precoFinal2)/2);

    }
}
