package basicSyntax;

import java.util.Scanner;

public class Ex_06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        long totalSum = 0;
        if (num == 0) {
            totalSum = 1;
        }
        int originalNum = num;
        while (num > 0) {

                long factorialDig = 1;
                if (num % 10 != 0) {
                    for (int i = 1; i <= num % 10; i++) {
                        factorialDig *= i;
                    }
                }

            totalSum += factorialDig;
            num /= 10;
        }
        if (originalNum == totalSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
