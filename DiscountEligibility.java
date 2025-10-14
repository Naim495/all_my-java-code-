import java.util.Scanner;

public class DiscountEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you a club member? (yes/no): ");
        String member = sc.next();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (member.equalsIgnoreCase("yes") && age >= 60)
            System.out.println("Eligible for discount");
        else
            System.out.println("Not eligible for discount");
    }
}
