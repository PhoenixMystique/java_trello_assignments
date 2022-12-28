package task5;

import java.util.HashSet;
import java.util.Scanner;

public class repeatingCharachter {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                System.out.println(str.charAt(i));
                System.out.println("Repeating Charachter");
                return;
            } else {
                set.add(str.charAt(i));
            }
        }
        System.out.println("No Repeating Charachter");
    }
}
