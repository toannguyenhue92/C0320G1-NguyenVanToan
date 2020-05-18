package models;

public abstract class Service {
    private String id;
    private String roomStandard;
    private double areaInUse;
    private double rentalFee;
    private int maxGuest;
    private String rentalType;

    public Service() {
    }

    public Service(String id, String roomStandard, double areaInUse, double rentalFee, int maxGuest, String rentalType) {
        this.id = id;
        this.roomStandard = roomStandard;
        this.areaInUse = areaInUse;
        this.rentalFee = rentalFee;
        this.maxGuest = maxGuest;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaInUse() {
        return areaInUse;
    }

    public void setAreaInUse(double areaInUse) {
        this.areaInUse = areaInUse;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public abstract void showInformation();
}
