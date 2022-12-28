package task7;

import java.util.HashMap;
import java.util.Iterator;

public class notRepeatedChar {
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
        for (Iterator<Character> it = set.keySet().iterator(); it.hasNext();) {
            char c = it.next();
            System.out.println(c + " " + set.get(c));
        }
    }


}
