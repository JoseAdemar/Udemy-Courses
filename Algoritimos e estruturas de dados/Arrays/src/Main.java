import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray;
        intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;

        int arrayDoisInt [] = new int[3];
        arrayDoisInt[0] = 1;
        arrayDoisInt[1] = 2;
        arrayDoisInt[2] = 3;

        int[] arrayTresInt = new int[3];
        arrayTresInt[0] = 1;
        arrayTresInt[1] = 2;
        arrayTresInt[2] = 3;

        String[] sArray = {"a","b","c"};


        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(arrayDoisInt));
        System.out.println(Arrays.toString(arrayTresInt));
        System.out.println(Arrays.toString(sArray));

    }
}