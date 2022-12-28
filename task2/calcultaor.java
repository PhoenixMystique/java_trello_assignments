package task2;

public class calcultaor {
//    Write a program to create a
//calculator using the switch case.
    public static void main(String[] args) {
        char operator = '*';
        double number1 = 10.5, number2 = 5.5, result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Wrong Value");
                break;
        }
    }
}
