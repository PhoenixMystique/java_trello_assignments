package task7;

public class array {
    public static void main(String[] args) {
        int[] arr = {1221, 234, 432, 2124, 321134,1223};
        int traget = 432;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == traget) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
