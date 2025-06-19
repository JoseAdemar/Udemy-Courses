package ordenacao;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return;

        int meio = arr.length / 2;

        int[] esquerda = new int[meio];
        int[] direita = new int[arr.length - meio];

        // Divide
        for (int i = 0; i < meio; i++) esquerda[i] = arr[i];
        for (int i = meio; i < arr.length; i++) direita[i - meio] = arr[i];

        mergeSort(esquerda);
        mergeSort(direita);

        // Conquista (merge)
        merge(arr, esquerda, direita);
    }

    private static void merge(int[] arr, int[] esq, int[] dir) {
        int i = 0, j = 0, k = 0;

        while (i < esq.length && j < dir.length) {
            if (esq[i] <= dir[j]) {
                arr[k++] = esq[i++];
            } else {
                arr[k++] = dir[j++];
            }
        }

        while (i < esq.length) arr[k++] = esq[i++];
        while (j < dir.length) arr[k++] = dir[j++];
    }
}
