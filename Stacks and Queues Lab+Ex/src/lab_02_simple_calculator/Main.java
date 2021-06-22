package lab_02_simple_calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        Collections.addAll(stack, input);
        while (stack.size() > 1) {
            int first = Integer.valueOf(stack.pop());

            if (stack.pop().equals("+")) {
                stack.push(String.valueOf(first + Integer.valueOf(stack.pop())));
            } else  {
              stack.push(String.valueOf(first - Integer.valueOf(stack.pop())));
            }
        }
        System.out.println(stack.pop());
    }
}
