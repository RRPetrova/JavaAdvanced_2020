package linearDataStructures;

import java.util.Scanner;

public class Ex_05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstIndex = Integer.parseInt(scanner.nextLine());
        int secondIndex = Integer.parseInt(scanner.nextLine());

        for (int i = firstIndex; i <= secondIndex; i++) {
            System.out.printf("%c ", (char)i);
        }

    }
}
