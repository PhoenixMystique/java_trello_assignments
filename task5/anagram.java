package task5;

public class anagram {


    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean flag = true;
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(String.valueOf(str1.charAt(i)))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
