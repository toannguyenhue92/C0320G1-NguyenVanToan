import controllers.MainController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainController controller = new MainController(scanner);
        controller.displayMainMenu();
    }
}
