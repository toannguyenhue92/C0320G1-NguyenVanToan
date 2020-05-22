package commons;

import models.House;
import models.Room;
import models.Villa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RoomCSV {
    private static final String PATH = "src/data/room.csv";
    private static final String DELIMITER = ",";
    private static final String NEW_LINE_CHARACTER = "\n";

    public static boolean saveNewRoom(Room room) {
        try {
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

    public ArrayList<Room> getAllRooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.isEmpty()) {
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
