package basicSyntax;

import java.util.Scanner;

public class Ex_07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        double totalMoney = 0;
        while (!cmd.equals("Start")) {
            double money = Double.parseDouble(cmd);

            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                totalMoney += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            cmd = scanner.nextLine();
        }


        String products = scanner.nextLine();
        while (!products.equals("End")) {
            double productPrice = 0;
            switch (products) {
                case "Nuts":
                    productPrice = 2;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1;
                    break;
                    default:
                    System.out.println("Invalid product");
            }
            if (productPrice != 0) {
                if (totalMoney - productPrice < 0) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= productPrice;
                    System.out.println("Purchased " + products);
                }
            }
            products = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);

    }
}
