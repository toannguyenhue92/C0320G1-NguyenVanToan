package controllers;

import commons.*;
import models.*;

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
    private BookingCSV bookingCSV;

    public MainController(Scanner scanner) {
        this.scanner = scanner;
        input = new GetInput(scanner);
        villaCSV = new VillaCSV();
        houseCSV = new HouseCSV();
        roomCSV = new RoomCSV();
        customerCSV = new CustomerCSV();
        bookingCSV = new BookingCSV();
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
                addNewBooking();
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

    private void addNewBooking() {
        System.out.println();
        System.out.println("Customer information:");
        ArrayList<Customer> customers = customerCSV.getAllCustomers();
        if (customers.size() == 0) {
            System.out.println("We have 0 customer!");
            return;
        }
        Collections.sort(customers);
        for (int index = 0; index < customers.size(); index++) {
            System.out.print((index + 1) + ". ");
            customers.get(index).showInformation();
        }
        int selectedCustomer = input.selectOneOnList(customers.size());
        Customer customer = customers.get(selectedCustomer);
        Service selectedService = selectService();
        customer.setService(selectedService);
        if (bookingCSV.saveNewCustomer(customer)){
            System.out.println("Add new booking Successfully!");
        } else {
            System.out.println("Add new booking failed!");
        }
        pauseConsole();
        displayMainMenu();
    }

    private Service selectService() {
        boolean flag = true;
        ArrayList<Service> services = new ArrayList<>();
        while (flag) {
            System.out.println("1. Villa");
            System.out.println("2. House");
            System.out.println("3. Room");
            System.out.print("Enter your selection: ");
            String selection = scanner.nextLine();
            switch (selection) {
                case "1":
                    ArrayList<Villa> villas = villaCSV.getAllVillas();
                    services.addAll(villas);
                    System.out.println("All villas:");
                    flag = false;
                    break;
                case "2":
                    ArrayList<House> houses = houseCSV.getAllHouses();
                    services.addAll(houses);
                    System.out.println("All houses:");
                    flag = false;
                    break;
                case "3":
                    ArrayList<Room> rooms = roomCSV.getAllRooms();
                    services.addAll(rooms);
                    System.out.println("All rooms:");
                    flag = false;
                    break;
                default:
                    showNotAvailableMessage();
            }
        }
        for (int index = 0; index < services.size(); index++) {
            System.out.print((index + 1) + ". ");
            services.get(index).showInformation();
        }
        int selectedService = input.selectOneOnList(services.size());
        return services.get(selectedService);
    }

    private void showCustomerInformation() {
        System.out.println();
        System.out.println("Customer information:");
        ArrayList<Customer> customers = customerCSV.getAllCustomers();
        if (customers.size() == 0) {
            System.out.println("We have 0 customer!");
            return;
        }
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
        String phoneNumber = input.inputPhoneNumber();
        customer.setPhoneNumber(phoneNumber);
        String email = input.inputEmail();
        customer.setEmail(email);
        String customerType = input.inputCustomerType();
        customer.setCustomerType(customerType);
        String address = input.inputAddress();
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

    public void inputCommonInformation(Service service) {
        String s = "";
        String id = "";
        if (service instanceof Villa) {
            s = "villa";
            id = input.inputVillaID();
        }
        if (service instanceof House) {
            s = "house";
            id = input.inputHouseID();
        }
        if (service instanceof Room) {
            s = "room";
            id = input.inputRoomID();
        }
        service.setId(id);
        String serviceName = input.inputServiceName();
        service.setServiceName(serviceName);
        double areaInUse = input.inputArea(s);
        service.setAreaInUse(areaInUse);
        double rentalFee = input.inputRentalFee();
        service.setRentalFee(rentalFee);
        int maxGuest = input.inputMaxGuest();
        service.setMaxGuest(maxGuest);
        String rentalType = input.inputRentalType();
        service.setRentalType(rentalType);
    }

    public void addNewVilla() {
        System.out.println();
        System.out.println("New villa:");
        Villa villa = new Villa();
        inputCommonInformation(villa);
        String villaStandard = input.inputStandard();
        villa.setVillaStandard(villaStandard);
        String villaDescription = input.inputDescription();
        villa.setVillaDescription(villaDescription);
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
        System.out.println();
        System.out.println("New house:");
        House house = new House();
        inputCommonInformation(house);
        String houseStandard = input.inputStandard();
        house.setHouseStandard(houseStandard);
        String houseDescription = input.inputDescription();
        house.setHouseDescription(houseDescription);
        int numberOfFloors = input.inputNumberOfFloors();
        house.setNumberOfFloors(numberOfFloors);
        if (houseCSV.saveNewHouse(house)) {
            System.out.println("Successfully add new house!");
            house.showInformation();
        } else {
            System.out.println("Can't save new house information!");
        }
        pauseConsole();
        displayAddNewServiceMenu();
    }

    public void addNewRoom() {
        System.out.println();
        System.out.println("New room:");
        Room room = new Room();
        inputCommonInformation(room);
        String freeAdditionService = input.inputFreeAdditionService();
        room.setFreeAdditionService(freeAdditionService);
        if (roomCSV.saveNewRoom(room)) {
            System.out.println("Successfully add new room!");
            room.showInformation();
        } else {
            System.out.println("Can't save new room information!");
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
