package ordenacao;

import java.util.Arrays;

public class TestaOrdenacao {
    public static void main(String[] args) {

        int[] array1 = {5, 3, 8, 1, 2};
        int[] array2 = array1.clone();
        int[] array3 = array1.clone();

        BubbleSort.bubbleSort(array1);
        System.out.println("Bubble Sort: " + Arrays.toString(array1));

        MergeSort.mergeSort(array2);
        System.out.println("Merge Sort: " + Arrays.toString(array2));

        QuickSort.quickSort(array3, 0, array3.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(array3));
    }
}
