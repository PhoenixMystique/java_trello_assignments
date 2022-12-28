package task4;

import java.util.Scanner;

public class binarySearch {

        public static void main(String[] args) {
            System.out.println("Enter the Array");
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Enter the number to be search");
            int target = scanner.nextInt();
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == target) {
                    System.out.println(mid);
                   return;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
}
