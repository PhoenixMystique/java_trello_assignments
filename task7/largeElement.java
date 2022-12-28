package task7;

public class largeElement {

    public static void main(String[] args) {
        int[] arr = {32, 23, 323, 2334, 3234};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
