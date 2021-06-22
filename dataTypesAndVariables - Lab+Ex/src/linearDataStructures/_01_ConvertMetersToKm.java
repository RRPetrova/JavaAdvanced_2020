package linearDataStructures;

import java.util.Scanner;

public class _01_ConvertMetersToKm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long meters = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", meters * 1.0 / 1000);

    }
}
