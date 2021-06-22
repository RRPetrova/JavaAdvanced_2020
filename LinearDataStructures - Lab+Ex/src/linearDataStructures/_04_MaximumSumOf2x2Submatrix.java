package linearDataStructures;

import java.util.Scanner;

public class _04_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        for (int rows = 0; rows < matrix.length; rows++) {
            String[] numsRows = scanner.nextLine().split(", ");
            for (int cols = 0; cols < matrix[0].length; cols++) {
                matrix[rows][cols] = Integer.parseInt(numsRows[cols]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                int currSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        for (int i = maxRow; i <= maxRow+1; i++) {
            for (int j = maxCol; j <= maxCol+1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);

    }
}
