package models;

public class House extends Service {
    private String houseStandard;
    private String houseDescription;
    private int numberOfFloors;

    public House() {
        super();
    }

    public House(String id, String roomStandard, double areaInUse, double rentalFee, int maxGuest, String rentalType, String houseStandard, String houseDescription, int numberOfFloors) {
        super(id, roomStandard, areaInUse, rentalFee, maxGuest, rentalType);
        this.houseStandard = houseStandard;
        this.houseDescription = houseDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public String getHouseDescription() {
        return houseDescription;
    }

    public void setHouseDescription(String houseDescription) {
        this.houseDescription = houseDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInformation() {
        String information = "House information: " +
                "id=" + getId() +
                ", serviceName=" + getServiceName() +
                ", areaInUse=" + getAreaInUse() +
                ", rentalFee=" + getRentalFee() +
                ", maxGuest=" + getMaxGuest() +
                ", rentalType=" + getRentalType() +
                ", houseStandard=" + houseStandard +
                ", houseDescription=" + houseDescription +
                ", numberOfFloors=" + numberOfFloors;
        System.out.println(information);
    }

    @Override
    public String toString() {
        return getId() +
                "," + getServiceName() +
                "," + getAreaInUse() +
                "," + getRentalFee() +
                "," + getMaxGuest() +
                "," + getRentalType() +
                "," + houseStandard +
                "," + houseDescription +
                "," + numberOfFloors;
    }
}
