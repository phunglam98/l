package manager;

import model.Employee;
import readAndWrite.RWEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements IManager<Employee> {

private ArrayList<Employee> employeeList = new ArrayList<>();
private RWEmployee rwEmployee = new RWEmployee();

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
        rwEmployee.writeFile(employeeList);

    }

    @Override
    public boolean delete(int id) {
        int index = findById(id);
        if (index == -1) {
            return false;

        }
        this.employeeList.remove(index);
        rwEmployee.writeFile(employeeList);
        return true;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (id == employeeList.get(i).getId()) return i;
        }
        return -1;

    }

    @Override
    public boolean edit(int id, Employee employee) {
        int index = findById(id);
        if (index == -1) {
            return false;

        }
        this.employeeList.set(index, employee);
        rwEmployee.writeFile(employeeList);
        return true;
    }
    @Override
    public List<Employee> findAll(){
        return employeeList;
    }
}
