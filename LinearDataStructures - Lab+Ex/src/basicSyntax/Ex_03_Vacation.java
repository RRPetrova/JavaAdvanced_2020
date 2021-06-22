package basicSyntax;

import java.util.Scanner;

public class Ex_03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0;
        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                totalPrice = people * 8.45;
            } else if (day.equals("Saturday")) {
                totalPrice = people * 9.80;
            } else if (day.equals("Sunday")) {
                totalPrice = people * 10.46;
            }
            if (people >= 30) {
                totalPrice = 0.85 * totalPrice;
            }
        } else if (type.equals("Business")) {
            if (people >= 100) {
             people -= 10;
            }
            if (day.equals("Friday")) {
                totalPrice = people * 10.90;
            } else if (day.equals("Saturday")) {
                totalPrice = people * 15.60;
            } else if (day.equals("Sunday")) {
                totalPrice = people * 16;
            }

        } else if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                totalPrice = people * 15;
            } else if (day.equals("Saturday")) {
                totalPrice = people * 20;
            } else if (day.equals("Sunday")) {
                totalPrice = people * 22.50;
            }
            if (people >= 10 && people <=20) {
                totalPrice = 0.95* totalPrice;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
