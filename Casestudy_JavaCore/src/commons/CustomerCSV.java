package commons;

import models.Customer;

import java.io.*;
import java.util.ArrayList;

public class CustomerCSV {
    public static final String PATH = "src/data/customer.csv";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_CHARACTER = "\n";
    public static final String HEADER = "Name,Birthday,Gender,ID Card Numbers,Phone number,Email,Type,Address";

    public boolean saveNewCustomer(Customer customer) {
        try {
            createFileIfNotExist();
            FileWriter fileWriter = new FileWriter(CustomerCSV.PATH, true);
            fileWriter.append(customer.toString());
            fileWriter.append(CustomerCSV.NEW_LINE_CHARACTER);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    private void createFileIfNotExist() {
        try {
            File file = new File(CustomerCSV.PATH);
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(CustomerCSV.PATH);
                fileWriter.append(CustomerCSV.HEADER);
                fileWriter.append(CustomerCSV.NEW_LINE_CHARACTER);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CustomerCSV.PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.isEmpty() || line.equals(CustomerCSV.HEADER)) {
                    line = bufferedReader.readLine();
                    continue;
                }
                String[] splits = line.split(CustomerCSV.DELIMITER);
                Customer customer = new Customer();
                customer.setName(splits[0]);
                customer.setBirthday(splits[1]);
                customer.setGender(splits[2]);
                customer.setIdCardNumbers(splits[3]);
                customer.setPhoneNumber(splits[4]);
                customer.setEmail(splits[5]);
                customer.setCustomerType(splits[6]);
                customer.setAddress(splits[7]);
                customers.add(customer);
                line = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Can't read file!");
        }
        return customers;
    }
}
