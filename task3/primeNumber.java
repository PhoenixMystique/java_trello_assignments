package task3;

import java.util.Scanner;

public class primeNumber {
        public static void main(String[] args) {
            int  m = 0, flag = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            m = n / 2;
            for (int i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println("not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(n + " is prime number");
                }
        }
}
