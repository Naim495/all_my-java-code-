import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalarySystem system = new SalarySystem();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Employee Salary System");

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add New Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Overtime");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Designation: ");
                    String desig = scanner.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    double salary = scanner.nextDouble();
                    System.out.print("Enter Bonus: ");
                    double bonus = scanner.nextDouble();
                    System.out.print("Enter Overtime Hours: ");
                    double hours = scanner.nextDouble();

                    Employee newEmp = new Employee(id, name, desig, salary, bonus, hours);
                    system.addEmployee(newEmp);
                    break;

                case 2:
                    system.displayAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee foundEmp = system.searchEmployeeUsingID(searchId);
                    if (foundEmp != null) {
                        foundEmp.displayEmployeeInfo();
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new Overtime Hours: ");
                    double newOt = scanner.nextDouble();
                    system.updateOvertime(updateId, newOt);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
