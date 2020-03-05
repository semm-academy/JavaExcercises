import java.util.Collection;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Mucahit Aktepe"; // epetkA tihacuM
        System.out.println(reverse(str));

        String asd = null;

//        if (asd == null)
//            throw new NullPointerException();
//
//        if (asd.length() < 1)
//            throw new StringIndexOutOfBoundsException();
//        System.out.println(str.charAt(1));


    }

    public static String reverse(String str) {
        // String = char[] = 'M', 'u', 'c' ..
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i); // newString += str.charAt(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return newString;


    }
}
