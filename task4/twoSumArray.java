package task4;

public class twoSumArray {

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6 };
        int target = 6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("index " + i + " " + j);
                    break;
                }
            }
        }
    }
}
