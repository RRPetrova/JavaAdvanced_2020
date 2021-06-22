package linearDataStructures;

import java.util.Scanner;

public class _12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        int currNumber = 0;

        boolean specialNumber = false;
        for (int i = 1; i <= num; i++) {
            currNumber = i;
            while (i > 0) {
                sumOfDigits += i % 10;
                i = i / 10;
            }
            specialNumber = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            if (specialNumber) {
            System.out.printf("%d -> True%n", currNumber);
            } else {
                System.out.printf("%d -> False%n", currNumber);
            }
            sumOfDigits = 0;
            i = currNumber;
        }

    }
}
