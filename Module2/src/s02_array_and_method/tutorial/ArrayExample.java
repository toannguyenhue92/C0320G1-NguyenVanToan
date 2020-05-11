package s02_array_and_method.tutorial;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
  public static void main(String[] args) {
    int[] arr = createRandom();
    Scanner scaner = new Scanner(System.in);
    System.out.print("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
    int x = scaner.nextInt();
    try {
      System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + arr[x]);
    } catch (IndexOutOfBoundsException e) {
      System.err.println("Chỉ số vượt quá giới hạn của mảng");
    }
    scaner.close();
  }

  public static int[] createRandom() {
    Random random = new Random();
    int[] array = new int[100];
    System.out.println("Random array: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(100);
      System.out.printf("%3d ", array[i]);
    }
    return array;
  }
}