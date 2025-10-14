import java.util.Scanner;

public class GradeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        int grade = marks / 10; // Divide by 10 to group 80-89 as 8, etc.

        switch (grade) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade: A+");
                break;
            case 7:
                System.out.println("Grade: A");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            case 4:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
    }
}
