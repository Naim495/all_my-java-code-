import java.util.ArrayList;

public class SalarySystem {
    private ArrayList<Employee> employees;

    public SalarySystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Success: Employee " + e.getName() + " added.");
    }

    public Employee searchEmployeeUsingID(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found in the system.");
        } else {
            System.out.println("\n--- All Employee Records ---");
            for (Employee e : employees) {
                e.displayEmployeeInfo();
            }
        }
    }

    public void updateOvertime(int id, double newHours) {
        Employee e = searchEmployeeUsingID(id);
        if (e != null) {
            e.setOvertimeHours(newHours);
            System.out.println("Overtime updated for " + e.getName());
            System.out.printf("New Total Salary: $%.2f%n", e.calculateTotalSalary());
        } else {
            System.out.println("Error: Employee with ID " + id + " not found.");
        }
    }
}
