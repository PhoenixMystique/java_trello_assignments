package task3;

import java.util.Scanner;

public class firstEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum = sum + i;
           i++;
           i++;
        }
        System.out.println(sum);
    }
}
