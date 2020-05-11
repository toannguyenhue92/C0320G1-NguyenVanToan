package s02_array_and_method.e;

import java.util.Scanner;

public class InsertANumber {
  public static void main(String[] args) {
    int[] array = { 4, 6, 7, 8, 2, 4, 8, 9, 2 };
    System.out.print("Array: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = Integer.parseInt(scanner.nextLine());
    System.out.printf("Enter a position (1-%d): ", array.length);
    int position = Integer.parseInt(scanner.nextLine());
    int[] result = new int[array.length + 1];
    if (position < array.length && position > 0) {
      for (int i = 0; i < position; i++) {
        result[i] = array[i];
      }
      result[position] = number;
      for (int i = position + 1; i < result.length; i++) {
        result[i] = array[i - 1];
      }
      for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
      }
    } else {
      System.out.println("Out of range!");
    }
    scanner.close();
    System.out.println();
  }
}