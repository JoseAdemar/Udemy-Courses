package Leonardo.controle.desafios;

public class DesafioFor {
    public static void main(String[] args) {

        //String valor = "#";
        for(String valor = "#"; !valor.equalsIgnoreCase("#####"); valor += "#"){
            System.out.println(valor);
        }
    }
}
