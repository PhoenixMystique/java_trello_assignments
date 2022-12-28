package task5;
public class findSubString {

    public static void main(String[] args) {
        String str = "Java exercises";
        String subStr = "exercises";
        boolean flag = true;
        if (str.length() < subStr.length()) {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < str.length() - subStr.length() + 1; i++) {
            for (int j = 0; j < subStr.length(); j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
