package K14DCPM02.OOP;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("abc");
        System.out.println(employee.getName());
        employee.setSalary(1000);
        System.out.println(employee.getSalary());
    }
}
