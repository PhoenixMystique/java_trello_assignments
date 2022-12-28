package task4;

public class linearSerach {

    public static void main(String[] args) {
        int[] arr = { 22, 224, 234,45 ,3424,40, 50 };
        int target = 45;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("index " + i);
                break;
            }
        }
    }
}
