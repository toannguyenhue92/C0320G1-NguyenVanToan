package s01_java.exercise;

public class PrimeNumbersLowerThan100 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
