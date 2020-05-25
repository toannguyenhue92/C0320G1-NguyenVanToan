package commons;

import models.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RoomCSV {
    public static final String PATH = "src/data/room.csv";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_CHARACTER = "\n";
    public static final String HEADER = "ID,Service's Name,Area in use,Rental Fee," +
            "Max guest,Rental type,Free addition service";

    public boolean saveNewRoom(Room room) {
        try {
            createFileIfNotExist();
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.append(room.toString());
            fileWriter.append(NEW_LINE_CHARACTER);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Can't save new room information!");
            return false;
        }
        return true;
    }

    private void createFileIfNotExist() {
        try {
            File file = new File(RoomCSV.PATH);
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(RoomCSV.PATH);
                fileWriter.append(RoomCSV.HEADER);
                fileWriter.append(RoomCSV.NEW_LINE_CHARACTER);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Room> getAllRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.isEmpty() || line.equals(RoomCSV.HEADER)) {
                    line = bufferedReader.readLine();
                    continue;
                }
                String[] splits = line.split(RoomCSV.DELIMITER);
                Room room = new Room();
                room.setId(splits[0]);
                room.setServiceName(splits[1]);
                room.setAreaInUse(Double.parseDouble(splits[2]));
                room.setRentalFee(Double.parseDouble(splits[3]));
                room.setMaxGuest(Integer.parseInt(splits[4]));
                room.setRentalType(splits[5]);
                room.setFreeAdditionService(splits[6]);
                rooms.add(room);
                line = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Can't read file!");
        }
        return rooms;
    }
}
