package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();
        data.dia = 01;
        data.mes = 12;
        data.ano = 2023;

        System.out.printf("%d/%d/%d ", data.dia , data.mes , data.ano);

    }
}
