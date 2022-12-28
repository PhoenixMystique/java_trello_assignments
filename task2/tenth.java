package task2;

import java.util.Scanner;

public class tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Basic Salary");
        double basicSalary = scanner.nextDouble();
        double grossSalary = 0;
        if (basicSalary <= 15000) {
            grossSalary = basicSalary + (basicSalary * 0.25) + (basicSalary * 0.82);
        } else if (basicSalary <= 20200) {
            grossSalary = basicSalary + (basicSalary * 0.27) + (basicSalary * 0.90);
        } else if (basicSalary > 20200) {
            grossSalary = basicSalary + (basicSalary * 0.36) + (basicSalary * 0.95);
        }
        System.out.println("Gross Salary " + grossSalary);
    }
}
