package exception;

import java.util.Scanner;

public class EmailException extends Exception {
    private static final String MESSAGE = "Email format is abc@abc.abc!";
    private static final String REGEX = "\\w+@\\w+\\.\\w+";

    public EmailException() {
        super(MESSAGE);
    }

    public static String inputCustomerEmail(Scanner scanner) throws EmailException {
        String email = scanner.nextLine().trim();
        if (email.matches(REGEX)) {
            return email;
        } else {
            throw new EmailException();
        }
    }
}
