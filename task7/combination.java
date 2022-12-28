package task7;

public class combination {

    public static void main(String[] args) {
        String str = "Data Consultadd";
        getcombination(str, "");
    }

    public static void getcombination(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("");
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                getcombination(rem, prefix + str.charAt(i));
            }
        }
    }
}
