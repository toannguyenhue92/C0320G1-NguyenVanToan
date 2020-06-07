package utilities;

import models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ember Spirit", "2012-02-03", "Đà Nẵng", "images/ember_spirit_full.png"));
        customers.add(new Customer("Invoker", "2012-02-03", "Đà Lạt", "images/invoker_full.png"));
        customers.add(new Customer("Storm Spirit", "2012-02-03", "Quảng Nam", "images/storm_spirit_full.png"));
        customers.add(new Customer("Zeus", "2012-02-03", "Quảng Ngãi", "images/zuus_full.png"));
        customers.add(new Customer("Winter Wyvern", "2012-02-03", "Quảng Trị", "images/winter_wyvern_full.png"));
        return customers;
    }
}
