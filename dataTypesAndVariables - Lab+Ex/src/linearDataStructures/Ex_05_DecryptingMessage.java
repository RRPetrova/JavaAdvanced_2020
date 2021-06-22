package linearDataStructures;

import java.util.Scanner;

public class Ex_05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = scanner.nextLine().charAt(0);
            sb.append((char)(c+key));
        }
        System.out.println(sb.toString());
    }
}
