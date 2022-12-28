package task1;

public class third {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("x :" + a + " b :" + b);
    }
    public static void swapUsingThirdVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("x :" + a + " b :" + b);
    }
}
