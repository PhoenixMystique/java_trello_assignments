package task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class forth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scan.nextInt();
        System.out.println("Enter the value of b");
        int b = scan.nextInt();
        System.out.println(addTwoNumbers(a, b));
    }
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
