package task7;

import java.util.HashMap;

public class countChar {
    public static void main(String[] args) {
        HashMap<Character,Integer> set = new HashMap<>();
        String str = "Data Consultadd";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.containsKey(c)) {
                set.put(c, set.get(c) + 1);
            } else {
                set.put(c, 1);
            }
        }
    }
}
