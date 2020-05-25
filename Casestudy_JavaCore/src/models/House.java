package models;

import java.util.Objects;

public class House extends Service implements Comparable<House> {
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
        System.out.println();
        String information = "House {" +
                "id = '" + getId() + "'" +
                ", serviceName = '" + getServiceName() + "'" +
                ", areaInUse = '" + getAreaInUse() + "'" +
                ", rentalFee = '" + getRentalFee() + "'" +
                ", maxGuest = '" + getMaxGuest() + "'" +
                ", rentalType = '" + getRentalType() + "'" +
                ", houseStandard = '" + houseStandard + "'" +
                ", houseDescription ='" + houseDescription + "'" +
                ", numberOfFloors ='" + numberOfFloors + "'}";
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

    @Override
    public int compareTo(House o) {
        return o.getId().compareTo(this.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        House house = (House) o;
        return numberOfFloors == house.numberOfFloors &&
                Objects.equals(houseStandard, house.houseStandard) &&
                Objects.equals(houseDescription, house.houseDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), houseStandard, houseDescription, numberOfFloors);
    }
}
