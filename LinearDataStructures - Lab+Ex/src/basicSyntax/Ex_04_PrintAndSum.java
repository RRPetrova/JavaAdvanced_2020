package basicSyntax;

import java.util.Scanner;

public class Ex_04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int last = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = first; i <= last; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);



    }
}
