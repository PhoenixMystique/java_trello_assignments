package task2;

public class fifth {
    public static void main(String[] args) {
        int percentage = 80;
        if (percentage > 90) {
            System.out.println("Grade A");
        } else if (percentage > 75) {
            System.out.println("Grade B");
        } else if (percentage > 65) {
            System.out.println("Grade C");
        } else if (percentage > 45) {
            System.out.println("Grade D");
        } else if (percentage < 45) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
