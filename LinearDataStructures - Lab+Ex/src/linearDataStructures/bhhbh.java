package linearDataStructures;


import java.util.Scanner;

public class bhhbh {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String[][] matrix = new String[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        fillMatrix(scanner, matrix);

        int countMatches2X2 = 0;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j].equals(matrix[i][j + 1]) &&
                        matrix[i][j + 1].equals(matrix[i + 1][j]) &&
                        matrix[i + 1][j].equals(matrix[i + 1][j + 1])) {
countMatches2X2++;
                }
            }
        }
        System.out.println(countMatches2X2);
        //printMatrix(matrix);


    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String[] characters = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = characters[j];
            }
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}