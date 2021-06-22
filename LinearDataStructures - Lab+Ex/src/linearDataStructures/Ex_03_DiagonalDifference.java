package linearDataStructures;

import java.util.Scanner;

public class Ex_03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];
        fillTheMatrix(scanner, matrix);

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum1 += matrix[i][i];
            sum2 += matrix[i][matrix.length - 1 - i];
        }

        System.out.println(Math.abs(sum1 - sum2));
    }


    private static void fillTheMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String[] nums = scanner.nextLine().split("\\s+");
            for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = Integer.parseInt(nums[j]);
            }
        }
    }
}
