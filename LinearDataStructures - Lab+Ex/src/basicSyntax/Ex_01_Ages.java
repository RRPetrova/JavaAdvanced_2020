package basicSyntax;

import java.util.Scanner;

public class Ex_01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 0 && n <= 2) {
            System.out.println("baby");
        } else if (n <= 13) {
            System.out.println("child");
        } else if (n <= 19) {
            System.out.println("teenager");
        } else if (n <= 65) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }


    }
}
