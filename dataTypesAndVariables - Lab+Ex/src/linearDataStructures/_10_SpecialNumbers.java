package linearDataStructures;

import java.util.Scanner;

public class _10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

       int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            int currNum = i;
            while (currNum > 0) {
                sum += currNum % 10;
                currNum = currNum / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }


    }
}
