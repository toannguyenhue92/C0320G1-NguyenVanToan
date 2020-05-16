package s02_array_and_method.tutorial;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the index of a element (0-99): ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Value of element at index " + index + " is: " + arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index out of bounds!");
        } catch (NumberFormatException e) {
            System.err.println("Please enter an integer!");
        }
    }

    public static int[] createRandom() {
        Random random = new Random();
        int[] array = new int[100];
        System.out.print("Random integers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        return array;
    }
}