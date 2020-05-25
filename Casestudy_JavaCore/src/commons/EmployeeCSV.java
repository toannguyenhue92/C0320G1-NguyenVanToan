package commons;

import models.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class EmployeeCSV {
    public static final String PATH = "src/data/employee.csv";
    public static final String DELIMITER = ",";
    public static final String HEADER = "ID,Name,Age,Address";

    public TreeMap<String, Employee> getAllEmployees() {
        TreeMap<String, Employee> employees = new TreeMap<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.isEmpty() || line.equals(HEADER)) {
                    line = bufferedReader.readLine();
                    continue;
                }
                String[] splits = line.split(DELIMITER);
                Employee employee = new Employee();
                employee.setId(splits[0]);
                employee.setName(splits[1]);
                employee.setAge(Integer.parseInt(splits[2]));
                employee.setAddress(splits[3]);
                employees.put(employee.getId(), employee);
                line = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Can't read file!");
        }
        return employees;
    }
}
