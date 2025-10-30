import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (num != 0) {
            int d = num % 10;
            sum += d * d * d;
            num /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
