package linearDataStructures;

import java.util.Scanner;

public class Ex_07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumQty = 0;
        for (int i = 0; i < n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (sumQty + quantity > 255) {
                System.out.printf("Insufficient capacity!%n");
            } else {
                sumQty += quantity;
            }
        }
        System.out.println(sumQty);

    }
}
