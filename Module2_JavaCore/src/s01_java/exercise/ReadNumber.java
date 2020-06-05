package s01_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(readNumberFrom0To999(number));
        scanner.close();
    }

    public static String readOneDigit(int digit) {
        if (digit < 0 || digit > 10) {
            System.out.println("readOneDigit: out of ability");
            return "";
        }
        switch (digit) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String readNumberFrom10To19(int number) {
        if (number < 10 || number > 19) {
            System.out.println("readNumberFrom10To19: out of ability");
            return "";
        }
        int lastDigit = number % 10;
        switch (lastDigit) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "fourteen";
            case 5:
                return "fifteen";
            case 6:
            case 7:
            case 8:
            case 9:
                return readOneDigit(lastDigit) + "teen";
            default:
                return "";
        }
    }

    public static String readNumberFrom20To99(int number) {
        if (number < 20 || number > 99) {
            System.out.println("readNumberFrom20To99: out of ability");
            return "";
        }
        int tens = number / 10;
        int ones = number % 10;
        switch (tens) {
            case 2:
                if (ones == 0) {
                    return "twenty";
                }
                return "twenty-" + readOneDigit(ones);
            case 3:
                if (ones == 0) {
                    return "thirty";
                }
                return "thirty-" + readOneDigit(ones);
            case 4:
                if (ones == 0) {
                    return "forty";
                }
                return "forty-" + readOneDigit(ones);
            case 5:
                if (ones == 0) {
                    return "fifty";
                }
                return "fifty-" + readOneDigit(ones);
            case 6:
                if (ones == 0) {
                    return "sixty";
                }
                return "sixty-" + readOneDigit(ones);
            case 7:
                if (ones == 0) {
                    return "seventy";
                }
                return "seventy-" + readOneDigit(ones);
            case 8:
                if (ones == 0) {
                    return "eighty";
                }
                return "eighty-" + readOneDigit(ones);
            case 9:
                if (ones == 0) {
                    return "ninety";
                }
                return "ninety-" + readOneDigit(ones);
            default:
                return "";
        }
    }

    public static String readNumberFrom0To99(int number) {
        if (number >= 0 && number < 10) {
            return readOneDigit(number);
        } else if (number < 20) {
            return readNumberFrom10To19(number);
        } else if (number < 100) {
            return readNumberFrom20To99(number);
        } else {
            System.out.println("readNumberFrom0To99: out of ability");
            return "";
        }
    }

    public static String readNumberFrom100To999(int number) {
        if (number < 100 || number > 999) {
            System.out.println("readNumberFrom100To999: out of ability");
            return "";
        }
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        switch (hundreds) {
            case 1:
                if (tens == 0 && ones == 0) {
                    return readOneDigit(hundreds) + " hundred";
                }
                return readOneDigit(hundreds) + " hundred " + readNumberFrom0To99(number % 100);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (tens == 0 && ones == 0) {
                    return readOneDigit(hundreds) + " hundreds";
                }
                return readOneDigit(hundreds) + " hundreds " + readNumberFrom0To99(number % 100);
            default:
                return "";
        }
    }

    public static String readNumberFrom0To999(int number) {
        if (number >=0 && number <100){
            return readNumberFrom0To99(number);
        } else if (number < 1000) {
            return readNumberFrom100To999(number);
        } else {
            System.out.println("readNumberFrom0To999: out of ability");
            return "";
        }
    }
}
