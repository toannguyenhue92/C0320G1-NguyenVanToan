package s01_java.exercise;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.print("Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
