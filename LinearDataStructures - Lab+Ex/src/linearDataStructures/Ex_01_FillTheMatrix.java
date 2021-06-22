package linearDataStructures;

import java.util.Scanner;

public class Ex_01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[0])];

        if (input[1].equals("A")) {
            fillMatrixA(matrix);
        } else {
            fillMatrixB(matrix);
        }


        printMatrix(matrix);


    }

    private static void fillMatrixB(int[][] matrix) {
        int oddRow = 1;
        int evenRow = 0;

        int num = 1;
        for (int rows = 0; rows < matrix.length; rows++) {
            if (rows % 2 == 0 ) {
                for (int cols = 0; cols < matrix[0].length; cols++) {  //    0 1 2 2 1 0 0 1 2
                    matrix[cols][rows] = num;
                    num++;
                }
            } else {
                for (int cols = matrix[0].length - 1; cols >= 0; cols--) {
                    matrix[cols][rows] = num;
                    num++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixA(int[][] matrix) {
        int num = 1;
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[0].length; cols++) { // 0, 0 // 1, 0 // 1, 1 //
                matrix[cols][rows] = num;
                num++;
            }
        }
    }
}
