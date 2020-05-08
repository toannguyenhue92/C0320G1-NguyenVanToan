package s01_java.tutorial;

import java.util.Scanner;

public class CalculateSavingInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double money = scanner.nextDouble();
        System.out.print("Enter number of months: ");
        int month = scanner.nextInt();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total = money + money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + total);
    }
}
