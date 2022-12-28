package task5;

import java.util.Scanner;

public class vowels {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
         String str = scanner.next();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels" + vowels+ " Consonants " + consonants);
    }
}
