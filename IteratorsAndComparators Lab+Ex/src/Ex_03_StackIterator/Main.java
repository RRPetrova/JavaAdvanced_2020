package Ex_03_StackIterator;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        String cmd = scanner.nextLine();

        while (!cmd.equals("END")) {
            if (cmd.contains("Push")) {
               int[] asda = Arrays.stream(cmd.split("([, ]+)"))
                        .skip(1)
                        .mapToInt(Integer::parseInt).toArray();

                for (int i : asda) {
                    stack.push(i);
                }

            } else if (cmd.contains("Pop")) {
                try {
                    stack.pop();
                } catch (OperationNotSupportedException e) {
                    System.out.println(e.getMessage());
                }
            }
            cmd = scanner.nextLine();
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }
        for (Integer integer : stack) {
            System.out.println(integer);
        }

    }
}
