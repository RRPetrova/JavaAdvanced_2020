package basicSyntax;

import java.util.Scanner;

public class Ex2_05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0) {
                System.out.print(" ");
            } else  {
                int mainDigit = num % 10;
                int index = 0;
                if (mainDigit == 8 || mainDigit == 9) {
                   index = (mainDigit - 2) * 3 + 1 + String.valueOf(num).length() - 1;
                } else {
                    index = (mainDigit - 2) * 3 + String.valueOf(num).length() - 1;
                }
                System.out.print((char) (index + 97));
            }
        }


    }
}
