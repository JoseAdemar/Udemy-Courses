package PrimeiroProjeto;

public class DesafioOperadores {
    public static void main(String[] args) {
        double value1 = 20.00;
        double value2 = 80.00;

        double total = (value1 + value2)  * 100.00;
        System.out.println(total);

        System.out.println(total % 40.00);

        boolean remainder = total % 40 == 0 ? true : false;

        System.out.println(remainder);
    }
}
