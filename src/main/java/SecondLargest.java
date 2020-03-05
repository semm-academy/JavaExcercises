import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 30, 60, 40, 15, 20, 4, 0, -10, 5, 7, 6, 2, 90};
//        int[] arr = {1, 5, 0, 3, 8};
        bubbleSort(arr);
        System.out.println(secondLargestNum(arr));
    }

    public static int secondLargestNum(int[] array) {
        bubbleSort(array);
        return array[array.length-2];
    }

    // { 1, 5, 0, 3, 8 }
    // { 1, 0, 5, 3, 8 }
    // { 1, 0, 3, 5, 8 }
    // { 0, 1, 3, 5, 8 }
    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i]; // temp = 5
                    array[i] = array[i + 1]; // array[i] = 0
                    array[i + 1] = temp; // array[i + 1] = 5
                }
            }
        }
    }

}
