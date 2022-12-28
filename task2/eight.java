package task2;

import java.util.Scanner;

public class eight {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Income");
        double income= scan.nextInt();
        double tax = 0;
        if (income > 250000 && income <= 600000) {
            tax = (income - 250000) * 0.1;
        } else if (income > 600000 && income <= 1200000) {
            tax = (income - 600000) * 0.18 + 35000;
        } else if (income > 1200000) {
            tax = (income - 1200000) * 0.25 + 35000 + 108000;
        }
        System.out.println("Tax " + tax);
    }
}
