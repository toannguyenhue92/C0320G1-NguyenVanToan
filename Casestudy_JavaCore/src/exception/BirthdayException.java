package exception;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdayException extends Exception {
    public static final String MESSAGE = "Year is greater than 1900, year old is greater than 18 and format is dd/mm/yyyy!";
    public static final String REGEX = "\\d{2}/\\d{2}/\\d{4}";
    public static final int[] normalYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public BirthdayException() {
        super(MESSAGE);
    }

    public BirthdayException(String message) {
        super(message);
    }

    public static String inputBirthday(Scanner scanner) throws BirthdayException {
        String birthday = scanner.nextLine().trim();
        if (birthday.matches(REGEX)) {
            String[] splits = birthday.split("/");
            int day = Integer.parseInt(splits[0]);
            int month = Integer.parseInt(splits[1]);
            int year = Integer.parseInt(splits[2]);
            if (!isRealDate(year, month, day)) {
                throw new BirthdayException("'" + birthday + "' is not a real date!");
            }
            LocalDate localDate = LocalDate.now();
            LocalDate birthDate = LocalDate.of(year, month, day);
            Period period = Period.between(birthDate, localDate);
            if (year > 1900 && period.getYears() >= 18) {
                return birthday;
            } else {
                throw new BirthdayException();
            }
        } else {
            throw new BirthdayException();
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (!isDivisibleBy4) {
            return false;
        } else if (!isDivisibleBy100) {
            return true;
        } else return isDivisibleBy400;
    }

    public static boolean isRealDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (isLeapYear(year)) {
            return day > 0 && day <= leapYear[month - 1];
        } else {
            return day > 0 && day <= normalYear[month - 1];
        }
    }
}
