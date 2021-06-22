package linearDataStructures;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class _05_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

       ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, input);

        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operat = stack.pop();
            int sec = Integer.parseInt(stack.pop());

            if (operat.equals("-")) {
                stack.push(String.valueOf(first - sec));
            } else {
                stack.push(String.valueOf(first + sec));
            }
        }

        System.out.println(stack.peek());

    }
}
