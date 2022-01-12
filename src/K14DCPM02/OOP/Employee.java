package K14DCPM02.OOP;

public class Employee {
    String name;
    int salary;

    void setName(String _name) {
        name = _name;
    }

    String getName() {
        return name;
    }

    void setSalary(int amount) {
        salary = amount;
    }

    int getSalary() {
        return salary;
    }
}