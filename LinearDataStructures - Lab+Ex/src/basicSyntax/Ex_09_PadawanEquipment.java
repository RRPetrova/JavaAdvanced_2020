package basicSyntax;

import java.util.Scanner;

public class Ex_09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        int freeBelts = countStudents / 6;
        double countMore = Math.ceil(countStudents * 1.1);


        double total = countMore * priceLightsabers +
                countStudents * priceRobe + countStudents * priceBelts - freeBelts * priceBelts;

        if (budget >= total) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", total - budget);
        }

    }
}
