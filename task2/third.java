package task2;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int dividend = scan.nextInt();
        System.out.println("Enter the divisor");
        int  divisor = scan.nextInt();
        System.out.println("Quotient = " + dividend / divisor);
        System.out.println("Reminder = " + dividend % divisor);
    }
}
