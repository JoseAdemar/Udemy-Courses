public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        this.arr = new int[sizeOfArray];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert (int location, int valueToBeInsert) {
        try {
        if (arr[location] == Integer.MIN_VALUE) {
            arr[location] = valueToBeInsert;
            System.out.println("Sucessfully inserted");
        } else {
            System.out.println("This cell is already occupied");
        }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array");
        }
    }
}
