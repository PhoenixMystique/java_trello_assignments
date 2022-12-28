package task3;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int  res = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
           res= res * i;
        }
        System.out.println(res);
    }
}
