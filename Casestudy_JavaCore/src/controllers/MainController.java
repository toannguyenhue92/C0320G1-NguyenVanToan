package controllers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainController {

    private Scanner scanner;

    public MainController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMainMenu() {
        System.out.println();
        System.out.println("Main menu");
        System.out.println("1. Add new Service");
        System.out.println("2. Show Services");
        System.out.println("3. Add new customer");
        System.out.println("4. Show information of customer");
        System.out.println("5. Add new booking");
        System.out.println("6. Show information of employee");
        System.out.println("7. Exit");
        System.out.println();
    }

    public void displayAddNewServiceMenu() {
        System.out.println();
        System.out.println("New service menu");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to menu");
        System.out.println("5. Exit");
    }

    public int chooseMainMenu() {
        do {
            displayMainMenu();
            System.out.print("Choose menu: ");
            try {
                int choose = scanner.nextInt();
                if (choose > 0 && choose < 8) {
                    return choose;
                }
            } catch (InputMismatchException exception) {
                System.out.println("No action found!");
            }
        } while (true);
    }
}
