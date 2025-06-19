import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        // Step - 1 declare
        int [][] int2DimensionArray;

        // Step - 2 Instantiate
        int2DimensionArray = new int[2][2];

        // Step - 3 initialize
        int2DimensionArray[0][0] = 1;
        int2DimensionArray[0][1] = 2;
        int2DimensionArray[1][0] = 3;
        int2DimensionArray[1][1] = 4;

        // Cabeçalho das colunas
        System.out.println("      | Col 0 | Col 1 |");
        System.out.println("------+-------+-------+");

        // Impressão das linhas com conteúdo
        for (int i = 0; i < int2DimensionArray.length; i++) {
            System.out.printf("Row %d |", i);
            for (int j = 0; j < int2DimensionArray[i].length; j++) {
                System.out.printf("  %3d |", int2DimensionArray[i][j]);
            }
            System.out.println();
            System.out.println("------+-------+-------+");
        }

    }
}
