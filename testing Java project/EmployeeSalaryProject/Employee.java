public class Employee {
    private int id;
    private String name;
    private String designation;
    private double basicSalary;
    private double bonus;
    private double overtimeHours;

    public Employee(int id, String name, String designation, double basicSalary, double bonus, double overtimeHours) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.overtimeHours = overtimeHours;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public double calculateOvertimePay() {
        double hourlyRate = basicSalary / 160.0;
        return overtimeHours * hourlyRate * 1.5;
    }

    public double calculateTotalSalary() {
        return basicSalary + bonus + calculateOvertimePay();
    }

    public void displayEmployeeInfo() {
        System.out.println("---------------------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.printf("Basic Salary: $%.2f%n", basicSalary);
        System.out.printf("Bonus: $%.2f%n", bonus);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.printf("Overtime Pay: $%.2f%n", calculateOvertimePay());
        System.out.printf(">> TOTAL SALARY: $%.2f%n", calculateTotalSalary());
        System.out.println("---------------------------------");
    }

    public void setOvertimeHours(double hours) {
        this.overtimeHours = hours;
    }
}
