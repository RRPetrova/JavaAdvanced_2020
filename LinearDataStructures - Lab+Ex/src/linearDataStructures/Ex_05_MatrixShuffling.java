package linearDataStructures;

import java.util.Scanner;

public class Ex_05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] size = scanner.nextLine().split("\\s+");

        String[][] matrix = new String[Integer.parseInt(size[0])][Integer.parseInt(size[1])];

        fillMatrix(scanner, matrix);

        String[] cmd = scanner.nextLine().split("\\s+");
        while (!cmd[0].equals("END")) {
            if (cmd.length == 5 && cmd[0].equals("swap")) {
                int row1Ind = Integer.parseInt(cmd[1]);
                int col1Ind = Integer.parseInt(cmd[2]);
                int row2Ind = Integer.parseInt(cmd[3]);
                int col2Ind = Integer.parseInt(cmd[4]);

                if (row1Ind < 0 || row1Ind >= matrix.length || row2Ind < 0 || row2Ind >= matrix.length
                        || col1Ind < 0 || col1Ind >= matrix[0].length || col2Ind < 0 || col2Ind >= matrix[0].length) {
                    System.out.println("Invalid input!");
                } else {
                    String numFirst = matrix[row1Ind][col1Ind];
                    String numSec = matrix[row2Ind][col2Ind];
                    matrix[row1Ind][col1Ind] = numSec;
                    matrix[row2Ind][col2Ind] = numFirst;
                    printMatrix(matrix);
                }
            } else {
                System.out.println("Invalid input!");
            }
            cmd = scanner.nextLine().split("\\s+");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String[] nums = scanner.nextLine().split("\\s+");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = nums[j];
            }

        }
    }
}
