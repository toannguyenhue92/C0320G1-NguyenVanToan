package s01_java.tutorial;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        double width;
        double height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        width = scanner.nextDouble();
        System.out.print("Enter height: ");
        height = scanner.nextDouble();
        double area = width * height;
        System.out.println("Area is: " + area);
        scanner.close();
    }
}
