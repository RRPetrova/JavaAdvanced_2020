package basicSyntax;

import java.util.Scanner;

public class _04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int totalPlus30 = hour * 60 + min + 30;
        if (totalPlus30 / 60 >= 24) {
            System.out.printf("%d:%02d", totalPlus30 / 60 - 24, totalPlus30 % 60);
        } else {
            System.out.printf("%d:%02d", totalPlus30 / 60, totalPlus30 % 60);
        }

        }
    }
