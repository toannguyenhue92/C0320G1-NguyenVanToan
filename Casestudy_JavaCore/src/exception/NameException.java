package exception;

import java.util.Scanner;

public class NameException extends Exception {

    private static final String MESSAGE = "Customer name must capitalize the first character in each word!";
    private static final String REGEX = "([A-Z][a-z]+\\s?)+";

    public NameException() {
        super(MESSAGE);
    }

    public static String inputCustomerName(Scanner scanner) throws NameException {
        String name = scanner.nextLine().trim();
        if (name.matches(REGEX)) {
            return name;
        } else {
            throw new NameException();
        }
    }
}
