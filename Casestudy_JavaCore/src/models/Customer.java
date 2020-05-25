package models;

public class Customer implements Comparable<Customer> {
    private String name;
    private String birthday;
    private String gender;
    private String idCardNumbers;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;
    private Service service;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String idCardNumbers,
                    String phoneNumber, String email, String customerType, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardNumbers = idCardNumbers;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCardNumbers() {
        return idCardNumbers;
    }

    public void setIdCardNumbers(String idCardNumbers) {
        this.idCardNumbers = idCardNumbers;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void showInformation() {
        System.out.println();
        String information = "Customer {" +
                "name = '" + name + '\'' +
                ", birthday = '" + birthday + '\'' +
                ", gender = '" + gender + '\'' +
                ", idCardNumber = '" + idCardNumbers + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                ", email = '" + email + '\'' +
                ", customerType = '" + customerType + '\'' +
                ", address = '" + address + '\'' +
                '}';
        System.out.println(information);
    }

    @Override
    public String toString() {
        return name +
                "," + birthday +
                "," + gender +
                "," + idCardNumbers +
                "," + phoneNumber +
                "," + email +
                "," + customerType +
                "," + address;
    }

    @Override
    public int compareTo(Customer o) {
        if (!name.equals(o.getName())) {
            return name.compareTo(o.getName());
        }
        String[] splits = birthday.split("/");
        String[] oSplits = o.getBirthday().split("/");
        String year = splits[2];
        String oYear = oSplits[2];
        if (!year.equals(oYear)) {
            return year.compareTo(oYear);
        }
        String month = splits[1];
        String oMonth = oSplits[1];
        if (!month.equals(oMonth)) {
            return month.compareTo(oMonth);
        }
        String day = splits[0];
        String oDay = oSplits[0];
        return day.compareTo(oDay);
    }
}
