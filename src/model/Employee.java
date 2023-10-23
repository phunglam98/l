package model;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Double salary;
    private String status;

    public Employee(int id, String name, int age, String gender, Double salary, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "employee{" +
                "Stt=" + id +
                ", Tên='" + name + '\'' +
                ", Tuổi=" + age +
                ", Giới tính='" + gender + '\'' +
                ", Lương=" + salary +
                ", Trạng thái=" + status +
                '}';
    }

    public String getData() {
        return id + "," + name + "," + age + "," + gender + "," + salary + "," + status;
    }

}
