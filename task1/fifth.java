package task1;

import java.util.Scanner;

public class fifth {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int radius = scan.nextInt();
        System.out.println("Area of circle is " + areaOfCircle(radius));
    }
    public static int areaOfCircle(int radius) {
        return (int) (3.14 * radius * radius);
    }
}
