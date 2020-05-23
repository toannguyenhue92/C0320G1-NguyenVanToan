package commons;

import exception.*;

import java.util.ArrayList;
import java.util.Scanner;

public class GetInput {
    public static final String MASSAGE = "massage";
    public static final String KARAOKE = "karaoke";
    public static final String FOOD = "food";
    public static final String DRINK = "drink";
    public static final String CAR = "car";

    public static ArrayList<String> ADDITION_SERVICES;

    static {
        ADDITION_SERVICES = new ArrayList<>();
        ADDITION_SERVICES.add(MASSAGE);
        ADDITION_SERVICES.add(KARAOKE);
        ADDITION_SERVICES.add(FOOD);
        ADDITION_SERVICES.add(DRINK);
        ADDITION_SERVICES.add(CAR);
    }

    private Scanner scanner;

    public GetInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public double inputDouble() {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException ex) {
            System.out.print("Please enter a double number: ");
            return Double.NaN;
        }
    }

    public Integer getIntegerInput() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException ex) {
            System.out.print("Please enter an integer number: ");
            return null;
        }
    }

    public String inputVillaID() {
        String regexp = "^SVVL-[0-9]{4}$";
        while (true) {
            System.out.print("Enter Room ID (SVVL-YYYY, Y is 0-9): ");
            String roomID = scanner.nextLine();
            if (roomID.matches(regexp)) {
                return roomID;
            } else {
                System.out.println("Room ID format: SVVL-YYYY (Y is 0-9)!");
                pauseConsole();
            }
        }
    }

    public String inputHouseID() {
        String regexp = "^SVHO-[0-9]{4}$";
        while (true) {
            System.out.print("Enter Room ID (SVHO-YYYY, Y is 0-9): ");
            String roomID = scanner.nextLine();
            if (roomID.matches(regexp)) {
                return roomID;
            } else {
                System.out.println("Room ID format: SVHO-YYYY (Y is 0-9)!");
                pauseConsole();
            }
        }
    }

    public String inputRoomID() {
        String regexp = "^SVRO-[0-9]{4}$";
        while (true) {
            System.out.print("Enter Room ID (SVRO-YYYY, Y is 0-9): ");
            String roomID = scanner.nextLine();
            if (roomID.matches(regexp)) {
                return roomID;
            } else {
                System.out.println("Room ID format: SVRO-YYYY (Y is 0-9)!");
                pauseConsole();
            }
        }
    }

    public String inputServiceName() {
        String regexp = "^[A-Z][a-z]+$";
        while (true) {
            System.out.print("Enter service's name (ex. Tiger): ");
            String serviceName = scanner.nextLine();
            if (serviceName.matches(regexp)) {
                return serviceName;
            } else {
                System.out.println("Wrong format!");
                pauseConsole();
            }
        }
    }

    public double inputArea(String service) {
        while (true) {
            System.out.print("Enter area of " + service + " (0-30 m2): ");
            double area = inputDouble();
            if (area > 0 && area <= 30) {
                return area;
            } else {
                System.out.println("Area is from 0 to 30 m2!");
                pauseConsole();
            }
        }
    }

    public double inputRentalFee() {
        while (true) {
            System.out.print("Enter rental fee: ");
            double rentalFee = inputDouble();
            if (rentalFee > 0) {
                return rentalFee;
            } else {
                System.out.println("Rental fee must be greater than 0!");
                pauseConsole();
            }
        }
    }

    public int inputMaxGuest() {
        while (true) {
            System.out.print("Enter max guest (1-19): ");
            Integer rentalFee = getIntegerInput();
            if (rentalFee != null) {
                if (rentalFee > 0 && rentalFee < 20) {
                    return rentalFee;
                }
            } else {
                System.out.println("Max guest is from 1 - 19!");
                pauseConsole();
            }
        }
    }

    public String inputAdditionServices() {
        while (true) {
            System.out.println("List of addition services:");
            for (int i = 0; i < ADDITION_SERVICES.size(); i++) {
                if (i == ADDITION_SERVICES.size() - 1) {
                    System.out.print(ADDITION_SERVICES.get(i));
                } else {
                    System.out.print(ADDITION_SERVICES.get(i) + ", ");
                }
            }
            System.out.println();
            System.out.print("Enter addition service: ");
            String additionService = scanner.nextLine().toLowerCase();
            if (ADDITION_SERVICES.contains(additionService)) {
                return additionService;
            } else {
                System.out.println("Not in list!");
                pauseConsole();
            }
        }
    }

    public int inputNumberOfFloors() {
        while (true) {
            System.out.print("Enter number of floors: ");
            Integer numberOfFloors = getIntegerInput();
            if (numberOfFloors != null) {
                if (numberOfFloors > 0) {
                    return numberOfFloors;
                }
            } else {
                System.out.println("Number of floors must be greater than 0!");
                pauseConsole();
            }
        }
    }

    public String standardizedString(String str) {
        str = str.trim().toLowerCase();
        StringBuilder temporary = new StringBuilder(String.valueOf(str.charAt(0)).toUpperCase());
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ') {
                continue;
            }
            if (str.charAt(i - 1) == ' ') {
                temporary.append(String.valueOf(str.charAt(i)).toUpperCase());
            } else {
                temporary.append(str.charAt(i));
            }
        }
        return temporary.toString();
    }

    public String inputName() {
        while (true) {
            System.out.print("Enter name (ex. Abc Abc): ");
            try {
                return NameException.inputCustomerName(scanner);
            } catch (NameException e) {
                System.out.println(e.getMessage());
                pauseConsole();
            }
        }
    }

    public String inputEmail() {
        while (true) {
            System.out.print("Enter email (ex. abc@abc.abc): ");
            try {
                return EmailException.inputCustomerEmail(scanner);
            } catch (EmailException e) {
                System.out.println(e.getMessage());
                pauseConsole();
            }
        }
    }

    public String inputGender() {
        while (true) {
            System.out.print("Enter gender (ex. Female, Male, Unknown): ");
            try {
                return GenderException.inputGender(scanner);
            } catch (GenderException e) {
                System.out.println(e.getMessage());
                pauseConsole();
            }
        }
    }

    public String inputIdCardNumbers() {
        while (true) {
            System.out.print("Enter ID Card Numbers (ex. XXX XXX XXX): ");
            try {
                return IdCardException.inputIdCardNumbers(scanner);
            } catch (IdCardException e) {
                System.out.println(e.getMessage());
                pauseConsole();
            }
        }
    }

    public String inputBirthDay() {
        while (true) {
            System.out.print("Enter birthday (ex. dd/mm/yyyy): ");
            try {
                return BirthdayException.inputBirtday(scanner);
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
                pauseConsole();
            }
        }
    }

    public void pauseConsole() {
        System.out.print("Enter to continue...");
        scanner.nextLine();
    }

    public String inputPhoneNumber(Scanner scanner) {
        String regex = "\\+?\\d{9,15}";
        while (true) {
            System.out.print("Enter phone number (9-15 digits): ");
            String phoneNumber = scanner.nextLine().trim();
            if (phoneNumber.matches(regex)) {
                return phoneNumber;
            } else {
                System.out.println("Wrong phone number format!");
                pauseConsole();
            }
        }
    }

    public String inputCustomerType(Scanner scanner) {
        while (true) {
            System.out.print("Enter customer type: ");
            String customerType = scanner.nextLine().trim();
            if (customerType.contains(CustomerCSV.DELIMITER)) {
                System.out.println("Don't use symbol '" + CustomerCSV.DELIMITER + "'");
            } else {
                return customerType;
            }
        }

    }

    public String inputAddress(Scanner scanner) {
        while (true) {
            System.out.print("Enter address: ");
            String address = scanner.nextLine().trim();
            if (address.contains(CustomerCSV.DELIMITER)) {
                System.out.println("Don't use symbol '" + CustomerCSV.DELIMITER + "'");
            } else {
                return address;
            }
        }
    }
}
