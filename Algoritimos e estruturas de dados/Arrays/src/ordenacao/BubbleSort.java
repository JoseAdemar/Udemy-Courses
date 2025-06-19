package ordenacao;

public class BubbleSort {
    public static void bubbleSort(int[] args) {

        int n = args.length;
        boolean trocou;

        for (int i=0; i< n-1; i++) {
            trocou = false;
            for (int j=0; j< n- i - 1; j++) {
                if (args[j] > args[j + 1]) {
                    int temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) break;
        }
    }
}
