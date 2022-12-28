package task4;

public class rmDuplicate {

    public static void main(String[] args) {
        int[] arr = { 2,2,3,3,4,4,4,11,11,11,11};
        int[] arr2 = new int[arr.length];
        int j = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr2[j] = arr[i];
                j++;
            } else {
                count++;
            }
        }
        arr2[j] = arr[arr.length - 1];
        for (int i = 0; i < arr2.length - count; i++) {
            System.out.print(arr2[i] + " ");
        }
        for (int i = 0; i < count; i++) {
            System.out.print("0 ");
        }
    }
}
