package linearDataStructures;

import java.util.Scanner;

public class Ex_02_MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         String[] input = scanner.nextLine().split("\\s+");
        String[][] matrix = new String[Integer.parseInt(input[0])][Integer.parseInt(input[1])];
        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void fillMatrix(String[][] matrix) {
        char fLetter = 'a'-1;
        char secLetter = 0;

        StringBuilder sb = new StringBuilder();
        for (int rows = 0; rows < matrix.length; rows++) {
            if (fLetter + 1 > 122) {
                fLetter = 96;
            }
            fLetter += 1;
            for (int cols = 0; cols < matrix[0].length; cols++) {
                sb = new StringBuilder();
                if (fLetter + cols > 122) {
                    secLetter = Character.valueOf((char) (cols -26+ (int)fLetter));
                } else {
                    secLetter = Character.valueOf((char) (cols + (int) fLetter));
                }
                sb.append(fLetter).append(secLetter).append(fLetter);
                matrix[rows][cols] = sb.toString();

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
