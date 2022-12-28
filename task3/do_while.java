package task3;

import java.util.Scanner;

public class do_while {

    public static void main(String[] args) {
        int num1, num2, sum;
        char res;
        Scanner scanner = new Scanner(System.in);
        do {
            num1 = 10;
            num2 = 20;
            sum = num1 + num2;
            System.out.println("Sum of these numbers: " + sum);
            System.out.println("Do you want to continue: y/n");

            res = scanner.next().charAt(0);
        } while (res == 'y' ||res == 'Y');
    }
}
