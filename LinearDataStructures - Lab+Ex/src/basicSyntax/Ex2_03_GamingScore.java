package basicSyntax;

import java.util.Scanner;

public class Ex2_03_GamingScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

double totalCosts = 0;
        String cmd = scanner.nextLine();
        while (!cmd.equals("Game Time")) {
            double priceGame = 0;
            if (cmd.equals("OutFall 4")) {
                priceGame = 39.99;
            } else if (cmd.equals("CS: OG")) {
                priceGame = 15.99;
            } else if (cmd.equals("Zplinter Zell")) {
                priceGame = 19.99;
            } else if (cmd.equals("Honored 2")) {
                priceGame = 59.99;
            } else if (cmd.equals("RoverWatch")) {
                priceGame = 29.99;
            } else if (cmd.equals("RoverWatch Origins Edition")) {
                priceGame = 39.99;
            } else {
                System.out.println("Not Found");
            }
            if (priceGame != 0) {
                if (balance - priceGame < 0) {
                    System.out.println("Too Expensive");
                } else {
                    System.out.printf("Bought %s%n", cmd);
                    totalCosts += priceGame;
                    balance -= priceGame;
                }
                if (balance == 0) {
                    System.out.println("Out of money!");
                    break;
                }
            }
            cmd = scanner.nextLine();
        }
        if (balance > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalCosts, balance);
        }
    }
}
