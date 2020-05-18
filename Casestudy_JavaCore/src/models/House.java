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

    @Override
    public void showInformation() {
        System.out.println("House information");
    }
}
