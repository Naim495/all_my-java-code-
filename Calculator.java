import java.util.Scanner;

/**
 * A simple command-line calculator application in Java.
 * * This class allows the user to perform basic arithmetic operations
 * (addition, subtraction, multiplication, division) on two numbers.
 * The program will continue to ask for new calculations until the user
 * decides to exit.
 */
public class Calculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Simple Java Calculator!");
        System.out.println("You can enter two numbers and an operator (+, -, *, /).");
        System.out.println("Type 'exit' at any time to quit.");

        // Main loop to keep the calculator running
        while (running) {
            try {
                // --- Get First Number ---
                System.out.print("\nEnter the first number: ");
                String firstInput = scanner.nextLine();
                if ("exit".equalsIgnoreCase(firstInput)) {
                    running = false;
                    break;
                }
                double num1 = Double.parseDouble(firstInput);

                // --- Get Operator ---
                System.out.print("Enter the operator (+, -, *, /): ");
                String operator = scanner.nextLine();
                if ("exit".equalsIgnoreCase(operator)) {
                    running = false;
                    break;
                }

                // --- Get Second Number ---
                System.out.print("Enter the second number: ");
                String secondInput = scanner.nextLine();
                if ("exit".equalsIgnoreCase(secondInput)) {
                    running = false;
                    break;
                }
                double num2 = Double.parseDouble(secondInput);

                double result = 0;
                boolean validOperator = true;

                // --- Perform Calculation using a switch statement ---
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        // Check for division by zero
                        if (num2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                            validOperator = false; // Skip printing the result
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                        validOperator = false; // Skip printing the result
                }

                // Print the result if the operation was valid
                if (validOperator) {
                    // Use printf for nice formatting
                    System.out.printf("Result: %.2f %s %.2f = %.2f\n", num1, operator, num2, result);
                }

            } catch (NumberFormatException e) {
                // Handle cases where the user enters non-numeric input
                System.out.println("Error: Invalid number. Please enter numeric values.");
            } catch (Exception e) {
                // Catch any other unexpected errors
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        // Close the scanner and exit the program
        System.out.println("Calculator is closing. Goodbye!");
        scanner.close();
    }
}
