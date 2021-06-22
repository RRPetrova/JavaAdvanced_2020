package lab_01_browser_history;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        ArrayDeque<String> stack = new ArrayDeque<>();
        String current = "";

        String input = reader.readLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (stack.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = reader.readLine();
                    continue;
                } else {
                    current = stack.pop();
                }
            } else {
                if (!current.equals("")) {
                    stack.push(current);
                }
                current = input;
            }
            System.out.println(current);
            input = reader.readLine();
        }
    }
}