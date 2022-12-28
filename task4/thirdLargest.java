package task4;

public class thirdLargest {
    public static void main(String[] args) {
        int[] arr = {1, 16, 2, 19, 10, 20 };
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }
        System.out.println(third);
    }
}

