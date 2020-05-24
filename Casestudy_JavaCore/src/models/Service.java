package models;

import java.util.Objects;

public abstract class Service {
    private String id;
    private String serviceName;
    private double areaInUse;
    private double rentalFee;
    private int maxGuest;
    private String rentalType;

    public Service() {
    }

    public Service(String id, String serviceName, double areaInUse,
                   double rentalFee, int maxGuest, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
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

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Double.compare(service.areaInUse, areaInUse) == 0 &&
                Double.compare(service.rentalFee, rentalFee) == 0 &&
                maxGuest == service.maxGuest &&
                Objects.equals(id, service.id) &&
                Objects.equals(serviceName, service.serviceName) &&
                Objects.equals(rentalType, service.rentalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceName, areaInUse, rentalFee, maxGuest, rentalType);
    }
}
