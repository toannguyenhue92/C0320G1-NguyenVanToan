package controllers;

import commons.*;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class MainController {

    private Scanner scanner;
    private GetInput input;
    private VillaCSV villaCSV;
    private HouseCSV houseCSV;
    private RoomCSV roomCSV;
    private CustomerCSV customerCSV;

    public MainController(Scanner scanner) {
        this.scanner = scanner;
        input = new GetInput(scanner);
        villaCSV = new VillaCSV();
        houseCSV = new HouseCSV();
        roomCSV = new RoomCSV();
        customerCSV = new CustomerCSV();
    }

    public void displayMainMenu() {
        System.out.println();
        System.out.println("Main menu");
        System.out.println("1. Add new Service");
        System.out.println("2. Show Services");
        System.out.println("3. Add new customer");
        System.out.println("4. Show information of customer");
        System.out.println("5. Add new booking");
        System.out.println("6. Show information of employee");
        System.out.println("7. Exit");
        System.out.print("Enter your selection: ");
        String selection = scanner.nextLine();
        switch (selection) {
            case "1":
                displayAddNewServiceMenu();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showCustomerInformation();
                break;
            case "5":
                System.out.println("5. Add new booking - Not available now!");
                displayMainMenu();
                break;
            case "6":
                System.out.println("6. Show information of employee - Not available now!");
                displayMainMenu();
                break;
            case "7":
                exit();
            default:
                showNotAvailableMessage();
                displayMainMenu();
        }
    }

    private void showCustomerInformation() {
        System.out.println();
        System.out.println("Customer information:");
        ArrayList<Customer> customers = customerCSV.getAllCustomers();
        Collections.sort(customers);
        for (Customer customer : customers) {
            customer.showInformation();
        }
        System.out.println();
        pauseConsole();
        displayMainMenu();
    }

    private void addNewCustomer() {
        System.out.println();
        System.out.println("Add new customer:");
        Customer customer = new Customer();
        String name = input.inputName();
        customer.setName(name);
        String birthday = input.inputBirthDay();
        customer.setBirthday(birthday);
        String gender = input.inputGender();
        customer.setGender(gender);
        String idCardNumbers = input.inputIdCardNumbers();
        customer.setIdCardNumbers(idCardNumbers);
        String phoneNumber = input.inputPhoneNumber(scanner);
        customer.setPhoneNumber(phoneNumber);
        String email = input.inputEmail();
        customer.setEmail(email);
        String customerType = input.inputCustomerType(scanner);
        customer.setCustomerType(customerType);
        String address = input.inputAddress(scanner);
        customer.setAddress(address);
        if (customerCSV.saveNewCustomer(customer)) {
            System.out.println("Successful add new customer!");
            customer.showInformation();
        } else {
            System.out.println("Can't save new customer information!");
        }
        pauseConsole();
        displayMainMenu();
    }

    public void displayAddNewServiceMenu() {
        System.out.println();
        System.out.println("New service menu");
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Back to main menu");
        System.out.println("5. Exit");
        System.out.println();
        System.out.print("Enter your selection: ");
        String selection = scanner.nextLine();
        switch (selection) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
                displayMainMenu();
                break;
            case "5":
                exit();
            default:
                showNotAvailableMessage();
                displayAddNewServiceMenu();
        }
    }

    public void showServices() {
        System.out.println();
        System.out.println("Services menu:");
        System.out.println("1. Show all villas");
        System.out.println("2. Show all houses");
        System.out.println("3. Show all rooms");
        System.out.println("4. Show all name villas not duplicate");
        System.out.println("5. Show all name houses not duplicate");
        System.out.println("6. Show all name rooms not duplicate");
        System.out.println("7. Back to main menu");
        System.out.println("8. Exit");
        System.out.println();
        System.out.print("Enter your selection: ");
        String selection = scanner.nextLine();
        switch (selection) {
            case "1":
                showAllVillas();
                break;
            case "2":
                showAllHouses();
                break;
            case "3":
                showAllRooms();
                break;
            case "4":
                showNotDuplicateVillas();
                break;
            case "5":
                showNotDuplicateHouses();
                break;
            case "6":
                showNotDuplicateRooms();
                break;
            case "7":
                displayMainMenu();
                break;
            case "8":
                exit();
            default:
                showNotAvailableMessage();
                displayMainMenu();
        }
    }

    private void showNotDuplicateRooms() {
        System.out.println();
        System.out.println("Not duplicate rooms: ");
        TreeSet<Room> rooms = new TreeSet<>(roomCSV.getAllRooms());
        for (Room room : rooms) {
            room.showInformation();
        }
        pauseConsole();
        showServices();
    }

    private void showNotDuplicateHouses() {
        System.out.println();
        System.out.println("Not duplicate houses: ");
        TreeSet<House> houses = new TreeSet<>(houseCSV.getAllHouses());
        for (House house : houses) {
            house.showInformation();
        }
        pauseConsole();
        showServices();
    }

    private void showNotDuplicateVillas() {
        System.out.println();
        System.out.println("Not duplicate villas: ");
        TreeSet<Villa> villas = new TreeSet<>(villaCSV.getAllVillas());
        for (Villa villa : villas) {
            villa.showInformation();
        }
        pauseConsole();
        showServices();
    }

    private void showAllVillas() {
        System.out.println();
        System.out.println("All villas: ");
        ArrayList<Villa> villas = villaCSV.getAllVillas();
        for (Villa villa : villas) {
            villa.showInformation();
        }
        pauseConsole();
        showServices();
    }

    private void showAllHouses() {
        System.out.println();
        System.out.println("All houses: ");
        ArrayList<House> houses = houseCSV.getAllHouses();
        for (House house : houses) {
            house.showInformation();
        }
        pauseConsole();
        showServices();
    }

    private void showAllRooms() {
        System.out.println();
        System.out.println("All rooms: ");
        ArrayList<Room> rooms = roomCSV.getAllRooms();
        for (Room room : rooms) {
            room.showInformation();
        }
        pauseConsole();
        showServices();
    }

    public void addNewVilla() {
        System.out.println("New villa:");
        Villa villa = new Villa();
        String villaID = input.inputVillaID();
        villa.setId(villaID);
        String serviceName = input.inputServiceName();
        villa.setServiceName(serviceName);
        double areaInUse = input.inputArea("villa");
        villa.setAreaInUse(areaInUse);
        double rentalFee = input.inputRentalFee();
        villa.setRentalFee(rentalFee);
        int maxGuest = input.inputMaxGuest();
        villa.setMaxGuest(maxGuest);
        System.out.print("Enter rental type: ");
        String rentalType = input.standardizedString(scanner.nextLine());
        villa.setRentalType(rentalType);
        System.out.print("Enter villa standard: ");
        String villaStandard = input.standardizedString(scanner.nextLine());
        villa.setVillaStandard(villaStandard);
        System.out.print("Enter description: ");
        villa.setVillaDescription(scanner.nextLine());
        int numberOfFloors = input.inputNumberOfFloors();
        villa.setNumberOfFloors(numberOfFloors);
        double poolArea = input.inputArea("pool");
        villa.setPoolArea(poolArea);
        if (villaCSV.saveNewVilla(villa)) {
            System.out.println("Successfully add new villa!");
            villa.showInformation();
        } else {
            System.out.println("Can't save new villa information!");
        }
        pauseConsole();
        displayAddNewServiceMenu();
    }

    public void addNewHouse() {
        System.out.println("New house:");
        House house = new House();
        String houseID = input.inputHouseID();
        house.setId(houseID);
        String serviceName = input.inputServiceName();
        house.setServiceName(serviceName);
        double areaInUse = input.inputArea("house");
        house.setAreaInUse(areaInUse);
        double rentalFee = input.inputRentalFee();
        house.setRentalFee(rentalFee);
        int maxGuest = input.inputMaxGuest();
        house.setMaxGuest(maxGuest);
        System.out.print("Enter rental type: ");
        String rentalType = input.standardizedString(scanner.nextLine());
        house.setRentalType(rentalType);
        System.out.print("Enter house standard: ");
        String houseStandard = input.standardizedString(scanner.nextLine());
        house.setHouseStandard(houseStandard);
        System.out.print("Enter description: ");
        house.setHouseDescription(scanner.nextLine());
        int numberOfFloors = input.inputNumberOfFloors();
        house.setNumberOfFloors(numberOfFloors);
        if (HouseCSV.saveNewHouse(house)) {
            System.out.println("Successfully add new house!");
        }
        pauseConsole();
        displayAddNewServiceMenu();
    }

    public void addNewRoom() {
        System.out.println("New room:");
        Room room = new Room();
        String roomId = input.inputRoomID();
        room.setId(roomId);
        String serviceName = input.inputServiceName();
        room.setServiceName(serviceName);
        double areaInUse = input.inputArea("room");
        room.setAreaInUse(areaInUse);
        double rentalFee = input.inputRentalFee();
        room.setRentalFee(rentalFee);
        int maxGuest = input.inputMaxGuest();
        room.setMaxGuest(maxGuest);
        System.out.print("Enter rental type: ");
        String rentalType = input.standardizedString(scanner.nextLine());
        room.setRentalType(rentalType);
        System.out.print("Enter free addition service: ");
        String additionService = scanner.nextLine().toLowerCase();
        room.setFreeAdditionService(additionService);
        if (RoomCSV.saveNewRoom(room)) {
            System.out.println("Successfully add new room!");
        }
        pauseConsole();
        displayAddNewServiceMenu();
    }

    public void exit() {
        System.out.println();
        System.out.println("See you later!");
        System.exit(0);
    }

    private void showNotAvailableMessage() {
        System.out.print("Your choice is not available! Enter to continue...");
        scanner.nextLine();
    }

    private void pauseConsole() {
        System.out.print("Enter to continue...");
        scanner.nextLine();
    }
}
