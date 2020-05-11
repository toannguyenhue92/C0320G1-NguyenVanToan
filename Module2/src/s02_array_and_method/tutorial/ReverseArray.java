package s02_array_and_method.tutorial;

import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args) {
    int size;
    int[] array;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Enter a size: ");
      size = Integer.parseInt(scanner.nextLine());
      if (size > 20)
        System.out.println("Size should not exceed 20!");
      if (size < 1)
        System.out.println("Size should not lower than 1!");
    } while (size > 20 || size < 1);
    array = new int[size];
    for (int i = 0; i < size; i++) {
      boolean isInt = false;
      do {
        System.out.printf("Enter number (at %d): ", i);
        try {
          array[i] = Integer.parseInt(scanner.nextLine());
          isInt = true;
        } catch (NumberFormatException exception) {
          System.out.println("Please enter an integer!");
          isInt = false;
        }
      } while (!isInt);
    }
    scanner.close();
    printIntegerArray(array);
    System.out.println("Reverse array!");
    int[] reverseArray = reverseIntegerArray(array);
    printIntegerArray(reverseArray);
  }

  public static void printIntegerArray(int[] a) {
    System.out.print("Array = [ ");
    for (int i = 0; i < a.length; i++) {
      if (i == a.length - 1)
        System.out.printf("%d", a[i]);
      else
        System.out.printf("%d, ", a[i]);
    }
    System.out.println(" ]");
  }

  public static int[] reverseIntegerArray(int[] a) {
    int length = a.length;
    int[] result = new int[length];
    for (int i = 0; i < length; i++) {
      result[i] = a[length - i - 1];
    }
    return result;
  }
}