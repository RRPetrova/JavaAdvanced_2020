package abstractions;


import java.util.Scanner;

public class Ex_05_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] size = scanner.nextLine().split(" ");
        int[][] matrix = new int[Integer.parseInt(size[0])][Integer.parseInt(size[1])];

        fillMatrix(scanner, matrix);

        int maxSum = Integer.MIN_VALUE;
        int indMaxRow = 0;
        int indMaxCol = 0;
        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[0].length-2; j++) {
                int currSum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] +
                        matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2] +
                        matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                if (currSum > maxSum) {
                    maxSum = currSum;
                    indMaxRow = i;
                    indMaxCol = j;
                }
            }
        }

        System.out.println("Sum = " + maxSum);

        printMatrix(matrix, indMaxRow, indMaxCol);

    }

    private static void printMatrix(int[][] matrix, int indMaxRow, int indMaxCol) {
        for (int i = indMaxRow; i <= indMaxRow+2; i++) {
            for (int j = indMaxCol; j <= indMaxCol + 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String[] nums = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Integer.parseInt(nums[j]);
            }
        }
    }
}
