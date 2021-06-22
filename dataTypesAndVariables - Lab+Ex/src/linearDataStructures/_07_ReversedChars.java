package linearDataStructures;

import java.util.Scanner;

public class _07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char f = scanner.nextLine().charAt(0);
        char s = scanner.nextLine().charAt(0);
        char t = scanner.nextLine().charAt(0);

      StringBuilder sb = new StringBuilder();

      sb.append(t + " ").append(s + " ").append(f);
        System.out.printf("%s", sb.toString());

    }
}
