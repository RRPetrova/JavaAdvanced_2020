package linearDataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int degrees = Integer.parseInt(input.substring(input.indexOf("(") + 1, input.indexOf(")"))) % 360;

        String fill = scanner.nextLine();
        List<String> list = new ArrayList<>();
        while (!fill.equals("END")) {
            list.add(fill);

            fill = scanner.nextLine();
        }
        int longest = 0;
        for (String s : list) {
            if (s.length() > longest) {
                longest = s.length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String llll = String.format("%-" + longest + "s", list.get(i));
            list.set(i, llll);
        }

        String[][] matrix = new String[list.size()][longest];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = String.valueOf(list.get(i).charAt(j));
            }
        }
        int N = 0;
        if (degrees == 90) {
            N = 1;
        } else if (degrees == 180) {
            N = 2;
        } else if (degrees == 270) {
            N = 3;
        }

        if (N != 0) {
            String[][] result = null;
            for (int rot = 0; rot < N; rot++) {
                int n = matrix.length;
                int m = matrix[0].length;
                result = new String[m][n];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        result[j][n - 1 - i] = matrix[i][j];
                    }
                }

                matrix = result;

            }
            printMatrix(result);
        } else {
            printMatrix(matrix);
        }


    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


}

