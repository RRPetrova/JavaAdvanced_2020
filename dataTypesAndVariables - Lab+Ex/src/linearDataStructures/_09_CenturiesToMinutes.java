package linearDataStructures;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _09_CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int century = Integer.parseInt(scanner.nextLine());

        long days = (long) (century * 100 * 365.2422);

        long hours = days * 24;
        long min = hours * 60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                century, century * 100, days, hours, min);
    }
}
