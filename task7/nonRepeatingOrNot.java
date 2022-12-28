package task7;

import java.util.HashSet;

public class nonRepeatingOrNot {
    public static void main(String[] args) {
        String str = "Data Consultadd";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                System.out.println("Not non-repeating character");
               return;
            } else {
                set.add(c);
            }
        }
        System.out.println("non-repeating character");
    }
}
