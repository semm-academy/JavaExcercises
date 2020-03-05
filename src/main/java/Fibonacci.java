public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("f(" + i + ") = " + fibonacci(i));
        }
        // f(0) = 1
        // f(1) = 1
        // f(2) = 2
        // f(3) = 3
    }

    // 1, 1, 2, 3, 5, 8, 13, 21
    public static int fibonacci(int index) {
        int a = 1, b = 1, c = 0;
        if (index == 0 || index == 1) return 1;
        else {
            for (int i = 2; i <= index; i++) {
                c = a + b; // c = 2
                a = b; // a = 1
                b = c; // 2
            }
        }
        return c;
    }
}
