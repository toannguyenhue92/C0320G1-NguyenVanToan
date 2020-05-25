package models;

import java.util.Objects;

public class Room extends Service implements Comparable<Room> {
    private String freeAdditionService;

    public Room() {
        super();
    }

    public Room(String id, String roomStandard, double areaInUse, double rentalFee, int maxGuest, String rentalType, String freeAdditionService) {
        super(id, roomStandard, areaInUse, rentalFee, maxGuest, rentalType);
        this.freeAdditionService = freeAdditionService;
    }

    public String getFreeAdditionService() {
        return freeAdditionService;
    }

    public void setFreeAdditionService(String freeAdditionService) {
        this.freeAdditionService = freeAdditionService;
    }

    @Override
    public void showInformation() {
        System.out.println();
        String information = "Room {" +
                "id = '" + getId() + "'" +
                ", serviceName = '" + getServiceName() + "'" +
                ", areaInUse = '" + getAreaInUse() + "'" +
                ", rentalFee = '" + getRentalFee() + "'" +
                ", maxGuest = '" + getMaxGuest() + "'" +
                ", rentalType = '" + getRentalType() + "'" +
                ", freeAdditionService = '" + freeAdditionService + "'}";
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
                "," + freeAdditionService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Room room = (Room) o;
        return Objects.equals(freeAdditionService, room.freeAdditionService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), freeAdditionService);
    }

    @Override
    public int compareTo(Room o) {
        return o.getId().compareTo(this.getId());
    }
}
