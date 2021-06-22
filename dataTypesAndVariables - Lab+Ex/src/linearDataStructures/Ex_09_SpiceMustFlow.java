package linearDataStructures;

import java.util.Scanner;

public class Ex_09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalExtracted = 0;

        while (startingYield >= 100) {
            totalExtracted += startingYield;
            days++;
            if (totalExtracted - 52 < 0) {
                break;
            } else {
                totalExtracted -= 26;
            }
            startingYield -= 10;
        }
        if (totalExtracted != 0) {
            totalExtracted -= 26;
        }
            System.out.println(days);
            System.out.println(totalExtracted);

    }
}
