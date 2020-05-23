package exception;

import java.util.Scanner;

public class GenderException extends Exception {
    public static final String FEMALE = "Female";
    public static final String MALE = "Male";
    public static final String UNKNOWN = "Unknown";
    public static final String MESSAGE = "Gender options: Female, Male or Unknown.";

    public GenderException() {
        super(MESSAGE);
    }

    public static String inputGender(Scanner scanner) throws GenderException {
        String gender = scanner.nextLine().trim().toLowerCase();
        gender = gender.substring(0,1).toUpperCase() + gender.substring(1);
        switch (gender) {
            case FEMALE:
                return FEMALE;
            case MALE:
                return MALE;
            case UNKNOWN:
                return UNKNOWN;
            default:
                throw new GenderException();
        }
    }
}
