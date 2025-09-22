package arrays;

import java.util.Arrays;

public class TwoDimensionArrays1 {
    private static int[][] int2DArray;

    public static void main(String[] args) {

        int2DArray = new int[2][2];

        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));
        deleteValueFromArray(0, 0);
        System.out.println(Arrays.deepToString(int2DArray));
        //searchingValue(3);

        //novo exemplo
        String s2DArray[][] = {{"a", "b"}, {"c", "d"}};
        //System.out.println(Arrays.deepToString(s2DArray));
    }

    private static void searchingValue(int value) {
        for (int row = 0; row < int2DArray.length; row++) {
            for (int col = 0; col < int2DArray[0].length; col++) {
                if (int2DArray[row][col] == value) {
                    System.out.println("Valor encontrado na linha " + row + " coluna " + col);
                    return;
                }
            }
        }
        System.out.println("Valor " + value + " não encontrado na Matriz");
    }

    private static void deleteValueFromArray(int row, int col) {
        try {
            System.out.println("Successufuly deleted: " + int2DArray[row][col]);
            int2DArray[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("This index is not valid for array");
        }
    }
}
