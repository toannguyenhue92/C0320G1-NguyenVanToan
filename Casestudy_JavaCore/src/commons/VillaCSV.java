package commons;

import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VillaCSV {
    public static final String PATH = "src/data/villa.csv";
    public static final String DELIMITER = ",";
    public static final String NEW_LINE_CHARACTER = "\n";
    public static final String HEADER = "ID,Service's Name,Area in use,Rental Fee," +
            "Max guest,Rental type, Standard, Description, Number of floors, Pool area";

    private void createFileIfNotExist() {
        try {
            File file = new File(VillaCSV.PATH);
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(VillaCSV.PATH);
                fileWriter.append(VillaCSV.HEADER);
                fileWriter.append(VillaCSV.NEW_LINE_CHARACTER);
                fileWriter.flush();
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean saveNewVilla(Villa villa) {
        try {
            createFileIfNotExist();
            FileWriter fileWriter = new FileWriter(PATH, true);
            fileWriter.append(villa.toString());
            fileWriter.append(NEW_LINE_CHARACTER);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    public List<Villa> getAllVillas() {
        ArrayList<Villa> villas = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.isEmpty() || line.equals(VillaCSV.HEADER)) {
                    line = bufferedReader.readLine();
                    continue;
                }
                String[] splits = line.split(VillaCSV.DELIMITER);
                Villa villa = new Villa();
                villa.setId(splits[0]);
                villa.setServiceName(splits[1]);
                villa.setAreaInUse(Double.parseDouble(splits[2]));
                villa.setRentalFee(Double.parseDouble(splits[3]));
                villa.setMaxGuest(Integer.parseInt(splits[4]));
                villa.setRentalType(splits[5]);
                villa.setVillaStandard(splits[6]);
                villa.setVillaDescription(splits[7]);
                villa.setNumberOfFloors(Integer.parseInt(splits[8]));
                villa.setPoolArea(Double.parseDouble(splits[9]));
                villas.add(villa);
                line = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Can't read file!");
        }
        return villas;
    }
}
