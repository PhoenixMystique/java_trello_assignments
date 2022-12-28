package task2;

import java.util.Scanner;

public class seventh {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the Number");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("It's Over");
                break;
            } else {
                System.out.println("Good Going");
                continue;
            }
        }
    }
}
