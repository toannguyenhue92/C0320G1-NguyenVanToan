package models;

public class Villa extends Service {
    private String villaStandard;
    private String villaDescription;
    private int numberOfFloors;
    private double poolArea;

    public Villa() {
        super();
    }

    public Villa(String id, String roomStandard, double areaInUse, double rentalFee, int maxGuest, String rentalType, String villaStandard, String villaDescription, int numberOfFloors, double poolArea) {
        super(id, roomStandard, areaInUse, rentalFee, maxGuest, rentalType);
        this.villaStandard = villaStandard;
        this.villaDescription = villaDescription;
        this.numberOfFloors = numberOfFloors;
        this.poolArea = poolArea;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public String getVillaDescription() {
        return villaDescription;
    }

    public void setVillaDescription(String villaDescription) {
        this.villaDescription = villaDescription;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    @Override
    public void showInformation() {
        String information = "Villa information: " +
                "id=" + getId() +
                ", serviceName=" + getServiceName() +
                ", areaInUse=" + getAreaInUse() +
                ", rentalFee=" + getRentalFee() +
                ", maxGuest=" + getMaxGuest() +
                ", rentalType=" + getRentalType() +
                ", villaStandard=" + villaStandard +
                ", villaDescription=" + villaDescription +
                ", numberOfFloors=" + numberOfFloors +
                ", poolArea=" + poolArea;
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
                "," + villaStandard +
                "," + villaDescription +
                "," + numberOfFloors +
                "," + poolArea;
    }
}
