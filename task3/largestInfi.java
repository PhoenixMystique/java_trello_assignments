package task3;

import java.util.Scanner;

public class largestInfi {
    public static void main(String[] args) {
        int num, large = 0, small = 0;
        Scanner scanner = new Scanner(System.in);
        char res;
        do {
            System.out.println("Enter a number ");
            num = scanner.nextInt();
            if (num > large) {
                large = num;
            }
            if (num < small) {
                small = num;
            }
            System.out.println("Do you want to continue");
            res = scanner.next().charAt(0);
        } while (res == 'y');
           System.out.println("Largest " + large);
        System.out.println("Smallest " + small);
    }
}
