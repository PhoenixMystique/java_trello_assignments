package task7;

public class intersectionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 23, 3, 4, 86,45,345,478,65};
        int[] arr2 = {8, 9, 3, 7, 678,34};
        int[] arr3 = new int[10];
        int m = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[m] = arr1[i];
                    m++;
                }
            }
        }
        for (int i :arr3) {
            System.out.println(i);
        }
    }
}
