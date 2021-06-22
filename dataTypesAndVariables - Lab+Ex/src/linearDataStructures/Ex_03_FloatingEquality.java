package linearDataStructures;

import java.util.Scanner;

public class Ex_03_FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        double subs = Math.abs(a - b);

        if (subs > 0.000001) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }


    }
}
