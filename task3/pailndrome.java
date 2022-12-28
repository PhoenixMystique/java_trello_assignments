package task3;

public class pailndrome {

    public static void main(String[] args) {
        String str= "aba";
        String reverse = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
