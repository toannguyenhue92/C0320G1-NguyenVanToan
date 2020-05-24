package commons;

import models.Customer;
import models.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BookingCSV {
    public static final String PATH = "src/data/booking.csv";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_CHARACTER = "\n";
    public static final String SERVICE_HEADER = "ID,Service's Name,Area in use,Rental Fee,Max guest,Rental type";
    public static final String HEADER = CustomerCSV.HEADER + "," + SERVICE_HEADER;

    private void createFileIfNotExist() {
        try {
            File file = new File(PATH);
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(PATH);
                fileWriter.append(HEADER);
                fileWriter.append(NEW_LINE_CHARACTER);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean saveNewCustomer(Customer customer) {
        try {
            createFileIfNotExist();
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.append(toLine(customer));
            fileWriter.append(NEW_LINE_CHARACTER);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    private String toLine(Customer customer) {
        Service service = customer.getService();
        return customer.toString() +
                "," + service.getId() +
                "," + service.getServiceName() +
                "," + service.getAreaInUse() +
                "," + service.getRentalFee() +
                "," + service.getMaxGuest() +
                "," + service.getRentalType();
    }

}
