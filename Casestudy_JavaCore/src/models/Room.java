package models;

public class Room extends Service {
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
        System.out.println("Room information");
    }
}
