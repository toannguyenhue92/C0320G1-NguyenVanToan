package s02_array_and_method.tutorial;

import java.util.Scanner;

public class LowestNumber {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = Integer.parseInt(scanner.nextLine());
            if (size > 20)
                System.out.println("Size should not exceed 20");
            if (size < 1)
                System.out.println("Size should not lower than 1");
        } while (size > 20 || size < 1);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter number (at %d): ", i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("Lowest number is %d \n", findLowestNumber(array));
    }

    public static int findLowestNumber(int[] a) {
        int result = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < result) {
                result = a[i];
            }
        }
        return result;
    }
}
