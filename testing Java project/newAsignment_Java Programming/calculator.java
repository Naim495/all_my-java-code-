import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) break;

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {
                case 1: System.out.println("Result: " + (a + b)); break;
                case 2: System.out.println("Result: " + (a - b)); break;
                case 3: System.out.println("Result: " + (a * b)); break;
                case 4: 
                    if (b != 0)
                        System.out.println("Result: " + (a / b));
                    else
                        System.out.println("Cannot divide by zero!");
                    break;
                default: System.out.println("Invalid choice!");
            }
        } while (true);
    }
}
