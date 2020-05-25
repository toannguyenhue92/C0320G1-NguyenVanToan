package commons;

import models.House;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HouseCSV {
    public static final String PATH = "src/data/house.csv";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_CHARACTER = "\n";
    public static final String HEADER = "ID,Service's Name,Area in use,Rental Fee," +
            "Max guest,Rental type, Standard, Description, Number of floors";

    public boolean saveNewHouse(House house) {
        try {
            createFileIfNotExist();
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.append(house.toString());
            fileWriter.append(NEW_LINE_CHARACTER);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Can't save new house information!");
            return false;
        }
        return true;
    }

    private void createFileIfNotExist() {
        try {
            File file = new File(HouseCSV.PATH);
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(HouseCSV.PATH);
                fileWriter.append(HouseCSV.HEADER);
                fileWriter.append(HouseCSV.NEW_LINE_CHARACTER);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<House> getAllHouses() {
        ArrayList<House> houses = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.isEmpty() || line.equals(HouseCSV.HEADER)) {
                    line = bufferedReader.readLine();
                    continue;
                }
                String[] splits = line.split(HouseCSV.DELIMITER);
                House house = new House();
                house.setId(splits[0]);
                house.setServiceName(splits[1]);
                house.setAreaInUse(Double.parseDouble(splits[2]));
                house.setRentalFee(Double.parseDouble(splits[3]));
                house.setMaxGuest(Integer.parseInt(splits[4]));
                house.setRentalType(splits[5]);
                house.setHouseStandard(splits[6]);
                house.setHouseDescription(splits[7]);
                house.setNumberOfFloors(Integer.parseInt(splits[8]));
                houses.add(house);
                line = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Can't read file!");
        }
        return houses;
    }
}
