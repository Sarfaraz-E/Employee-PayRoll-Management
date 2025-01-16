import java.util.ArrayList;

abstract class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + id + ", Salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double rate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double rate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * rate;
    }
}

class PayRollSystem {
    private ArrayList<Employee> employeeList;

    public PayRollSystem() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void displayEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayRollSystem PS = new PayRollSystem();
        FullTimeEmployee FE = new FullTimeEmployee("Sarfaraz Essa", 9, 100000);
        PartTimeEmployee PE = new PartTimeEmployee("Amir Essa", 8, 6,500);
        PS.addEmployee(FE);
        PS.addEmployee(PE);
        System.out.println("Initialyy Detail of employees");
        PS.displayEmployee();
        System.out.println("After detail is :");
        PS.removeEmployee(9);
        PS.displayEmployee();

    }
}
