package arrays;

import java.util.Arrays;

public class TwoDimensionArrays1 {
    public static void main(String[] args) {
        int[][] int2DArray;
        int2DArray = new int[2][2];

        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        //novo exemplo
        String s2DArray[][] = {{"a","b"}, {"c","d"}};
        System.out.println(Arrays.deepToString(s2DArray));
    }
}
