package linearDataStructures;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex_02_FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            String[] input = scanner.nextLine().split(" ");
            long sum = 0;
            if (Long.parseLong(input[0]) > Long.parseLong(input[1])) {
                String num = String.valueOf(Math.abs(Long.parseLong(input[0])));
                for (int j = 0; j < num.length(); j++) {
                    sum += Math.abs(Character.getNumericValue(num.charAt(j)));
                }
            } else {
                String num = String.valueOf(Math.abs(Long.parseLong(input[1])));
                for (int j = 0; j < num.length(); j++) {
                    sum += Character.getNumericValue(num.charAt(j));
                }
            }
            System.out.println(sum);
        }
    }
}