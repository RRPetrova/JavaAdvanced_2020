package linearDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_07_Crossfire {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

       int[] size = Arrays.stream(reader.readLine().split("\\s+"))
               .mapToInt(Integer::parseInt).toArray();
       int a = size[0];
       int b = size[1];

        List<List<Integer>> matrix = new ArrayList<>();

        int n = 1;
        for (int i = 0; i < a; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < b; j++) {
                matrix.get(i).add(n);
                n++;
            }
        }

        String cmd = reader.readLine();
        while (!cmd.equals("Nuke it from orbit")) {
            String[] tokens = cmd.split("\\s+");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);


            for (int i = row - radius; i <= row + radius; i++) {
                if (isInRange(i, col, matrix) && i != row){
                    matrix.get(i).remove(col);
                }
            }

            for (int i = col+radius; i >= col-radius; i--) {
                if (isInRange(row, i, matrix)) {
                    matrix.get(row).remove(i);
                }
            }

            matrix.removeIf(List::isEmpty);
            cmd = reader.readLine();
        }

        for (List<Integer> list : matrix) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }


    }

    private static boolean isInRange(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size()
                && col >= 0 && col < matrix.get(row).size();
    }
}
