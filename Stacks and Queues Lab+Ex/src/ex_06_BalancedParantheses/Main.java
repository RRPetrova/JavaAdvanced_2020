package ex_06_BalancedParantheses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String input = reader.readLine().trim();
        ArrayDeque<String> leftSide = new ArrayDeque<>();
        boolean isEqual = false;

        if (input.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '['
                    || input.charAt(i) == '{') {
                leftSide.push(String.valueOf(input.charAt(i)));
            } else {
                String currentRight = String.valueOf(input.charAt(i));

                if (leftSide.isEmpty()) {
                    isEqual = false;
                    break;
                }

                if (leftSide.peek().equals("{") && currentRight.equals("}")) {
                    isEqual = true;
                    leftSide.pop();
                } else if (leftSide.peek().equals("(") && currentRight.equals(")")) {
                    isEqual = true;
                    leftSide.pop();
                } else if (leftSide.peek().equals("[") && currentRight.equals("]")) {
                    isEqual = true;
                    leftSide.pop();
                } else {
                    break;
                }
            }
        }
        if (isEqual == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
