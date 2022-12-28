package task2;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        System.out.println(isAlphabet(ch));
    }
    public static boolean isAlphabet(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }
}
