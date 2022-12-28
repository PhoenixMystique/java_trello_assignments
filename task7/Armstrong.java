package task7;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int r = temp % 10;
            sum += r * r * r;
            temp =temp/10;
        }
        if (sum == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
