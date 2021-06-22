package basicSyntax;

import java.util.Scanner;

public class Ex_10_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double costs = 0;
        int keyboardTrashed = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                costs += headsetPrice;
            }
            if (i % 3 == 0) {
                costs += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                costs += keyboardPrice;
                keyboardTrashed ++;
                if (keyboardTrashed % 2 == 0) {
                    costs += displayPrice;
                }
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", costs);
    }
}
