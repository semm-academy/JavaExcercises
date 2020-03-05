public class Factorial {
    // 5! = 5 x 4 x 3 x 2 x 1
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
            // 1 = 1 x 1;
            // 2 = 1 x 2;
            // 6 = 2 x 3;
            // 24 = 6 x 4;
            // 120 = 24 x 5;
        }

        return factorial;
    }
}
