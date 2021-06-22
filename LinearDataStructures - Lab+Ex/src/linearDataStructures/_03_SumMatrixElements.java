package linearDataStructures;

import java.util.Scanner;

public class _03_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int[][] matrix = new int[Integer.parseInt(input[0])][Integer.parseInt(input[1])];

        int sum = 0;
        for (int rows = 0; rows < matrix.length; rows++) {
            String[] nums = scanner.nextLine().split(", ");
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = Integer.parseInt(nums[cols]);
                sum += Integer.parseInt(nums[cols]);
            }
        }

    //  for (int i = 0; i < matrix.length; i++) {
    //      int[] sub = matrix[i];
    //      for (int j = 0; j < sub.length; j++) {
    //          if (j == sub.length - 1) {
    //              System.out.print(sub[j]);
    //          } else {
    //              System.out.print(sub[j] + ", ");
    //          }
    //      }
    //      System.out.println();
    //  }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
    }
}
