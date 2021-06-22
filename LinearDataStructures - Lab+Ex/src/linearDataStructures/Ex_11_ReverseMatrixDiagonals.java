package linearDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex_11_ReverseMatrixDiagonals {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int[] size = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[size[0]][size[1]];

        fillMatrix(reader, matrix);

        // There will be ROW+COL-1 lines in the output
        for (int line = (size[0] + size[1] - 1); line >= 1 ; line--) { //line 6

            // Get column index of the first element in this
            // line of output.The index is length-1 for first ROW
            // lines and line - ROW for remaining lines
            int start_col = max(0, line - size[0]); // 6-3

            // Get count of elements in this line. The count
            // of elements is equal to minimum of line number,
            // COL-start_col and ROW
            int count = min(line, (size[1] - start_col), size[0]); //6, 4-3, 3 -> 1

            // Print elements of this line
            for (int j = 0; j < count; j++)
                System.out.print(matrix[min(size[0], line) - j - 1] //3 - 0-1
                        [start_col + j] + " "); // 3 + 0

            // Print elements of next diagonal on next line
            System.out.println();
        }
    }


    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    private static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    private static void fillMatrix(BufferedReader reader, int[][] matrix) throws IOException {
        for (int i = 0; i < matrix.length; i++) {
            String[] input = reader.readLine().split("\\s+");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
    }
}
