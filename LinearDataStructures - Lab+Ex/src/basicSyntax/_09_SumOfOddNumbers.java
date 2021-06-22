package basicSyntax;

import java.util.Scanner;

public class _09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 ){
                System.out.println(i);
                sum += i;
                count++;
            }
            if (count == n) {
                break;
            }
        }
        System.out.println("Sum: " + sum);


    }
}
