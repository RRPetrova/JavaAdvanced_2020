package linearDataStructures;

import java.util.Scanner;

public class _05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fName = scanner.nextLine();
        String sName = scanner.nextLine();
        String concat = scanner.nextLine();
        System.out.printf("%s%s%s", fName, concat, sName);

    }
}
