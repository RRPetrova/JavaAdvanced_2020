package basicSyntax;

import java.util.Scanner;

public class Ex_05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();

        String pass = scanner.nextLine();
        StringBuilder sb = new StringBuilder(user);
        String correct = sb.reverse().toString();

        int block = 0;
        while (!pass.equals(correct)) {

            block++;
            if (block == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            pass = scanner.nextLine();
        }
        if (block < 4) {
            System.out.printf("User %s logged in.", user);
        }


    }
}
