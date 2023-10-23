package view;

import input.Input;
import manager.EmployeeManager;
import model.Employee;

import java.util.Scanner;

public class Menu {
    private EmployeeManager listEmployee = new EmployeeManager();
    private Scanner inputNum = new Scanner(System.in);
    private Scanner inputStr = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("----Quản Lí Nhân Viên----\n" +
                    "1. Thêm nhân viên\n" +
                    "2. Tìm kiếm nhân viên\n" +
                    "3. Kiểm tra trạng thái nhân viên\n" +
                    "4. Sửa thông tin nhân viên\n" +
                    "5. Xóa thông tin nhân viên\n" +
                    "6. Thông tin tài khoản\n" +
                    "7. Đăng xuất");
            System.out.println("Nhập lựa chọn của bạn");
            try {
                choice = Integer.parseInt(inputStr.nextLine());
                switch (choice) {
                    case 1:
                        showMenuAdd();

                        break;
                    case 2:
                        showMenuSearchByName();

                        break;
                    case 3:
                        showMenuCheckStatus();

                        break;
                    case 4:
                        showMenuEdit();

                        break;
                    case 5:

                        showMenuDelete();
                        break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("thoát");
                        break;


                }
            } catch (NumberFormatException ex) {
                System.out.println("nhập sai định dạng");
                choice = -1;
            }


        } while (choice != 0);

    }

    private void showMenuAdd() {
        System.out.println("Đang thêm thông nhân viên ");
        System.out.println("Nhập Id : ");
        int id = Input.inputNumber();
        System.out.println("Nhập tên nhân viên :");
        String name = Input.inputString();
        System.out.println("Nhập tuổi nhân viên :");
        int age = Input.inputNumber();
        System.out.println("Nhập giới tính nhân viên:");
        String gender = Input.inputString();
        System.out.println("Nhập lương nhân viên:");
        double salary = Input.inputNumber();
        System.out.println("Nhập trạng thái nhân viên:");
        String status = Input.inputString();
        Employee employee = new Employee(id, name, age, gender, salary, status);
        listEmployee.add(employee);
        System.out.println("Thêm nhân viên thành công!!! \n");
    }

    private void showMenuSearchByName() {
        System.out.println("\nTìm kiếm theo tên gần đúng...");
        System.out.print("Nhập tên gần đúng: ");
        String name = Input.inputString();
        for (Employee employee : listEmployee.findAll()) {
            if (employee.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(employee);
            }
        }
    }

    private void showMenuCheckStatus() {
    }

    private void showMenuEdit() {
        System.out.println("Đang sửa thông tin nhân viên....");
        System.out.println("Nhập Id nhân viên cần sửa:");
        int id = Input.inputNumber();
        int index = listEmployee.findById(id);
        if (index == -1) {
            System.out.println("Khong có Id nhân viên này: \n");
            return;
        }
        System.out.println("Nhập tên nhân viên :");
        String name = Input.inputString();
        System.out.println("Nhập tuổi nhân viên :");
        int age = Input.inputNumber();
        System.out.println("Nhập giới tính nhân viên:");
        String gender = Input.inputString();
        System.out.println("Nhập lương nhân viên:");
        double salary = Input.inputNumber();
        System.out.println("Nhập trạng thái nhân viên:");
        String status = Input.inputString();
        Employee employee = new Employee(id, name, age, gender, salary, status);
        listEmployee.edit(id, employee);
        System.out.println("Sửa nhân viên thành công!!! \n");
    }

    private void showMenuDelete() {
        System.out.println("Đang xóa nhân viên ...");
        System.out.println("Nhập Id nhân viên cần xóa :");
        int id = Input.inputNumber();
        int index = listEmployee.findById(id);
        if (index == -1) {
            System.out.println("Khoong có nhân viên này ???\n");
            return;
        }
        listEmployee.delete(id);
        System.out.println("Xóa thành công hehehe!!!\n");
    }

    private void showMainOut() {
    }


}
