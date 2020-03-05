public class Palindrome {
    // 1 den 100.000 araligindaki palindrom sayilari ekrana basin.

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 100000; i++) {
            // ternary operator
            if (isPalindrome(i)) {
//                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }

//    (2, 3) -- 2^3
    // 5^6
    public static int power(int base, int top) {
        int result = 1;

        for (int i = 1; i <= top; i++) {
            result = result * base;
        }
        // 1 * 2 // 2
        // 2 x 2 // 4
        // 4 x 2 // 8

        return result;
    }

    // 1221 - 1221
    // 1005 - 5001
    // 10301
    // En kolay
    public static boolean isPalindrome(int num) {
        String strNum = String.valueOf(num);
//        "1221"
        int j = strNum.length() - 1; // j = 3
        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) != strNum.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
