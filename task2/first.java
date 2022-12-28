package task2;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        System.out.println(isNumberPositive(num));
    }
    public static boolean isNumberPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}
