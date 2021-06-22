package basicSyntax;

import java.util.Scanner;

public class Ex2_01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int bigger = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        if (firstNumber > secondNumber) {
            bigger = firstNumber; // 5
            smallest = secondNumber; //3

            if (third > bigger) {
                System.out.println(third);
                if (smallest < bigger) {
                    System.out.println(bigger);
                    System.out.println(smallest);
                } else {
                    System.out.println(smallest);
                    System.out.println(bigger);
                }
            } else {
                System.out.println(bigger);

                if (third < smallest) {
                    System.out.println(smallest);
                    System.out.println(third);
                } else {
                    System.out.println(third);
                    System.out.println(smallest);
                }
            }
        } else { // -2 1 3
            bigger = secondNumber; //1
            smallest = firstNumber; //-2

            if (bigger > third) {
                System.out.println(bigger);

                if (third < smallest) {
                    System.out.println(smallest);
                    System.out.println(third);
                } else {
                    System.out.println(third);
                    System.out.println(smallest);
                }
            } else {
                System.out.println(third);
                if (bigger < smallest) {
                    System.out.println(smallest);
                    System.out.println(bigger);
                } else {
                    System.out.println(bigger);
                    System.out.println(smallest);
                }

            }

        }
    }
}
