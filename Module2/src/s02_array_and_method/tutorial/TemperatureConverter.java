package s02_array_and_method.tutorial;

import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("Menu.");
      System.out.println("1. Fahrenheit to Celsius");
      System.out.println("2. Celsius to Fahrenheit");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");
      choice = Integer.parseInt(scanner.nextLine());
      switch (choice) {
        case 1:
          System.out.print("Enter temperature in fahrenheit: ");
          double fahrenheit = Double.parseDouble(scanner.nextLine());
          System.out.println("to celsius: " + fahrenheitToCelsius(fahrenheit));
          break;
        case 2:
          System.out.print("Enter temperature in celsisus: ");
          double celsisus = Double.parseDouble(scanner.nextLine());
          System.out.println("to fahrenheit: " + celsiusToFahrenheit(celsisus));
          break;
        case 0:
          System.exit(0);
      }
      System.out.println();
    } while (choice != 0);
    scanner.close();
  }

  public static double celsiusToFahrenheit(double celsius) {
    double fahrenheit = (9.0 / 5) * celsius + 32;
    return fahrenheit;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    return celsius;
  }

}