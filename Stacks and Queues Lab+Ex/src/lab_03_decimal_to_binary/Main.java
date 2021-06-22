package lab_03_decimal_to_binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int num = Integer.parseInt(reader.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if (num == 0) {
            System.out.println(0);
        } else {
            while (num != 0) {
                stack.push(num % 2);
                num /= 2;
            }
        }

        for (Integer integer : stack) {
            System.out.print(stack.pop());
        }

    }
}
