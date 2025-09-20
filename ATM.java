import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Simple account details
        String userId = "12345";
        String pin = "6789";
        double balance = 5000.0;

        System.out.println("=== Welcome to ATM ===");

        // Login
        System.out.print("Enter User ID: ");
        String enteredId = input.nextLine();

        System.out.print("Enter PIN: ");
        String enteredPin = input.nextLine();

        if (enteredId.equals(userId) && enteredPin.equals(pin)) {
            System.out.println("Login Successful ✅");

            while (true) {
                System.out.println("\n=== ATM Menu ===");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your Balance: " + balance + " BDT");
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = input.nextDouble();
                        balance += deposit;
                        System.out.println("Deposited " + deposit + " BDT. New Balance: " + balance);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = input.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawn " + withdraw + " BDT. New Balance: " + balance);
                        } else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM. Goodbye!");
                        input.close();
                        return;

                    default:
                        System.out.println("Invalid choice, try again!");
                }
            }
        } else {
            System.out.println("Invalid User ID or PIN ❌");
        }
    }
}
