package linearDataStructures;

import java.util.Scanner;

public class Ex_03_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        while (n > 0) {
            n -= p;
            counter ++;
        }

        System.out.println(counter);

    }
}
