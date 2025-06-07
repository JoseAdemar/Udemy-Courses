package Leonardo.controle;

public class ForAninhado {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
    }
}
