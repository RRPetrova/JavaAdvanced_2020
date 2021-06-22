package basicSyntax;

import java.util.Scanner;

public class _03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double grade = Double.parseDouble(console.nextLine());
        if (grade >= 3) {
            System.out.println("Passed!");
        } else if (grade <= 2.99) {
            System.out.println("Failed!");
        }
    }
}
