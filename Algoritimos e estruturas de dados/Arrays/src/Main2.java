import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        SingleDimensionArray sd = new SingleDimensionArray(10);

        sd.insert(0,10);
        sd.insert(1,20);
        sd.insert(2,30);
        sd.insert(1,30);
        sd.insert(12,120);

//        System.out.println("Array traversal");
//        sd.traverseArray();
//        sd.searchInArray(40);
//        int ultimoIndiceDoArray = sd.arr.length - 1;
//        System.out.println(sd.arr[ultimoIndiceDoArray]);

        sd.deleteValue(0);
        System.out.println(sd.arr[0]);
    }
}
