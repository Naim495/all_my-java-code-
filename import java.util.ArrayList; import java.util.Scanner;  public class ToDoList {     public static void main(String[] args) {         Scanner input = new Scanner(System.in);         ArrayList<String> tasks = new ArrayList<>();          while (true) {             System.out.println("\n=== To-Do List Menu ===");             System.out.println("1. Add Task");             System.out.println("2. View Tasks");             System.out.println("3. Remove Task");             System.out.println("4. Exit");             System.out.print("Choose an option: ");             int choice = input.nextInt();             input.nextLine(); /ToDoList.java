import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n=== To-Do List Menu ===");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter new task: ");
                    String task = input.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2:
                    System.out.println("\nYour Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to remove: ");
                    int taskNo = input.nextInt();
                    if (taskNo > 0 && taskNo <= tasks.size()) {
                        tasks.remove(taskNo - 1);
                        System.out.println("Task removed!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice, try again!");
            }
        }
    }
}
