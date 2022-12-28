import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = scan.nextLine();
        String[] nameInCamelCase = name.split(" ");
        String resultInCamelCase = "";
        for (int i = 0; i < nameInCamelCase.length; i++) {
            resultInCamelCase += nameInCamelCase[i].substring(0, 1).toUpperCase() + nameInCamelCase[i].substring(1);
        }

        String resultInSmallCamelCase = "";
        for (int i = 0; i < nameInCamelCase.length; i++) {
            resultInSmallCamelCase += nameInCamelCase[i].substring(0, 1).toLowerCase() + nameInCamelCase[i].substring(1);
        }
        String nameInSnakeCase = name.replaceAll(" ", "_");
        System.out.println("Camel Case: " + resultInCamelCase+ "Snake Case "+nameInSnakeCase+"Small Camel Case "+resultInSmallCamelCase);
    }

}