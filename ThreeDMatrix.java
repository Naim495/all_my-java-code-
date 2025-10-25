import java.util.Scanner;

public class ThreeDMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take dimensions
        System.out.print("Enter dimensions (x y z): ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int[][][] matrix = new int[x][y][z];

        // Step 2: Input matrix elements
        System.out.println("Enter elements:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print("matrix[" + i + "][" + j + "][" + k + "] = ");
                    matrix[i][j][k] = input.nextInt();
                }
            }
        }

        // Step 3: Display the matrix and calculate sum
        int sum = 0;
        System.out.println("\nMatrix elements:");
        for (int i = 0; i < x; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(matrix[i][j][k] + " ");
                    sum += matrix[i][j][k];
                }
                System.out.println();
            }
            System.out.println();
        }

        // Step 4: Print sum
        System.out.p
