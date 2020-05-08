package s01_java.exercise;

public class PrimeNumbersLowerThan100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers lower than 100: ");
        boolean isFirstNumber = true;
        for (int i = 0; i < 100; i++) {
            if (isPrimeNumber(i)) {
                if (isFirstNumber) {
                    System.out.print(i);
                    isFirstNumber = false;
                } else {
                    System.out.print(", " + i);
                }

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
