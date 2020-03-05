public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {5, 6, 90, -10, 4, 2, 120, 75, 150, 20, 30};
//        int[] arr = {-5, -6, -90, -10, -4, -2, -120, -75, -150, -20, -30};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }

    public static int max(int[] arr) {
        int max = arr[0]; // -2147483647
//        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
//        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
