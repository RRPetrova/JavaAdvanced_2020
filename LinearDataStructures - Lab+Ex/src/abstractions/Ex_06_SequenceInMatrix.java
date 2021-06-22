package abstractions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_06_SequenceInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] size = scanner.nextLine().split(" ");
        String[][] matrix = new String[Integer.parseInt(size[0])][Integer.parseInt(size[1])];

        fillMatrix(scanner, matrix);

        List<String> listRes = new ArrayList<>();
        int maxCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                List<String> listCurrCol = new ArrayList<>();
                int currSeqCountCol = 0;
                listCurrCol.add(matrix[i][j]);

                for (int k = i; k < matrix.length - 1; k++) {
                    if (matrix[k][j].equals(matrix[k + 1][j])) {
                        currSeqCountCol++;
                        listCurrCol.add(matrix[k + 1][j]);
                    } else {
                        break;
                    }
                    if (currSeqCountCol > maxCount) {
                        maxCount = currSeqCountCol;
                        listRes = listCurrCol;
                    }

                }
                List<String> listCurrD = new ArrayList<>();
                int currSeqCountD = 0;
                listCurrD.add(matrix[i][j]);
                for (int k = i; k < Math.min(matrix.length - 1, matrix[0].length - 1); k++) {
                    if (matrix[k][k].equals(matrix[k + 1][k + 1])) {
                        currSeqCountD++;
                        listCurrD.add(matrix[k][k]);
                    } else {
                        break;
                    }
                }
                if (currSeqCountD > maxCount) {
                    maxCount = currSeqCountD;
    listRes = listCurrD;
                }

            }

        }

        System.out.println(String.join(", ", listRes));
    }

    private static void fillMatrix(Scanner scanner, String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input[j];
            }
        }
    }
}
