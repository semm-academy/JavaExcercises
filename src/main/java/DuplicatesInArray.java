import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    public static void main(String[] args) {
        String str = "MuhammetMucahitAktepe";
        findDuplicates(str);
    }

    public static void findDuplicates(String str) {
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
