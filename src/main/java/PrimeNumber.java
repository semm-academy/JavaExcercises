// Javada asal sayi bulma.
// 1-1000 arasindaki asal sayilari bulup ekrana basan program.

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            System.out.println(i + ": " + isPrime(i));
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
