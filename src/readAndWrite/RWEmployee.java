package readAndWrite;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RWEmployee {
    private File file = new File("employee.csv");

    public void writeFile(List<Employee> employees) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Employee employee : employees) {
                line += employee.getData();

            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public List<Employee> readFile() {
        List<Employee> employees = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println(Arrays.toString(data));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return employees;
    }

}
