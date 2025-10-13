package desafiosEntrevista.strings;

public class ExercicioPalindromo {
    public static void main(String[] args) {
      String palavra = "ararai";
      String palavraDivididaEmCaracteres[] = palavra.split("");
      //validaSeUmaPalavraEpolindromo(palavraDivididaEmCaracteres, palavra);
        validaSeUmaPalavraEpolindromo(palavra);

    }
//    public static void validaSeUmaPalavraEpolindromo(String caracteres[], String palavra) {
//        String palavraInvertida = "";
//        for (int i = caracteres.length -1; i >= 0; i --) {
//            palavraInvertida += caracteres[i];
//        }
//
//        if (palavra.equals(palavraInvertida)) {
//            System.out.println("É políndromo");
//        } else {
//            System.out.println("Não é políndromo");
//        }
//    }

    public static void validaSeUmaPalavraEpolindromo(String palavra) {
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(palavra).reverse();
       if (stringBuilder.toString().equals(palavra)) {
           System.out.println("É palindromo");
       } else {
           System.out.println("Não é palindromo");
       }
    }
}