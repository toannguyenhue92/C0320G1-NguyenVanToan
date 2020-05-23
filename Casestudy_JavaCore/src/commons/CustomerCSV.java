package commons;

import models.Customer;
import models.Room;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CustomerCSV {
    private static final String PATH = "src/data/customer.csv";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_CHARACTER = "\n";

    public boolean saveNewCustomer(Customer customer) {
        try {
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.append(customer.toString());
            fileWriter.append(NEW_LINE_CHARACTER);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.isEmpty()) {
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
