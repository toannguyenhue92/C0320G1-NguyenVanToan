package s01_java.exercise;

public class _20FirstPrimeNumbers {

    public static void main(String[] args) {
        int counter = 0;
        int i = 0;
        System.out.print("20 first prime numbers: ");
        while (counter < 20) {
            if (isPrimeNumber(i)) {
                System.out.print(i);
                counter++;
                if (counter < 20) {
                    System.out.print(", ");
                }
            }
            i++;
        }
    }

    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
