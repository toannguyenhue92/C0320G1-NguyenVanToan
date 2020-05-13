package s02_array_and_method.exercise.illegal_triangle_exception;

import java.util.Scanner;

public class DemoIllegalTriangleException {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = inputFromKeyboard("Enter length of side a: ", scanner);
    int b = inputFromKeyboard("Enter length of side b: ", scanner);
    int c = inputFromKeyboard("Enter length of side c: ", scanner);
    try {
      checkTriagle(a, b, c);
      System.out.printf("{ a: %d, b: %d, c: %d } is a triangle!", a, b, c);
    } catch (IllegalTriangleException e) {
      System.out.printf("{ a: %d, b: %d, c: %d } is not a triangle!", a, b, c);
    }
    System.out.println();
  }

  public static boolean isPositive(double number) {
    return number > 0;
  }

  public static void checkTriagle(int a, int b, int c) throws IllegalTriangleException {
    boolean aIsPositive = isPositive(a);
    boolean bIsPositive = isPositive(b);
    boolean cIsPositive = isPositive(c);
    boolean isTriangle = (aIsPositive && bIsPositive && cIsPositive && (a > b + c || b > a + c || c > a + b));
    if (!isTriangle) {
      throw new IllegalTriangleException();
    }
  }

  public static Integer inputFromKeyboard(String message, Scanner scanner) {
    System.out.print(message);
    try {
      int number = Integer.parseInt(scanner.nextLine());
      return number;
    } catch (NumberFormatException exception) {
      System.out.println("Integer only!");
      return null;
    }
  }
}