import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        
        while (num != 0) {
            int digit = num % 10;   // get last digit
            sum = sum + digit;      // add it to sum
            num = num / 10;         // remove last digit
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}
