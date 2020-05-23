package exception;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthdayException extends Exception {
    private static final String MESSAGE = "Year is greater than 1900, year old is greater than 18 and format is dd/mm/yyyy!";
    private static final String REGEX = "\\d{2}/\\d{2}/\\d{4}";

    public BirthdayException() {
        super(MESSAGE);
    }

    public static String inputBirtday(Scanner scanner) throws BirthdayException {
        String birthday = scanner.nextLine().trim();
        if (birthday.matches(REGEX)) {
            String[] splits = birthday.split("/");
//            int day = Integer.parseInt(splits[0]);
//            int month = Integer.parseInt(splits[1]);
            int year = Integer.parseInt(splits[2]);
            LocalDate localDate = LocalDate.now();
            if (year > 1900 && localDate.getYear() - year >= 18) {
                return birthday;
            } else {
                throw new BirthdayException();
            }
        } else {
            throw new BirthdayException();
        }
    }
}
