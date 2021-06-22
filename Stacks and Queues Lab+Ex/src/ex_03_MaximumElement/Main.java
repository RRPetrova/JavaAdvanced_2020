package ex_03_MaximumElement;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Long> stack = new ArrayDeque<>();
        for (long i = 0; i < n; i++) {
            long[] cmd = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToLong(Long::parseLong).toArray();

            if (cmd[0] == 1) {
                stack.push(cmd[1]);
            } else if (cmd[0] == 2) {
                stack.pop();
            } else if (cmd[0] == 3) {
                System.out.println(Collections.max(stack));
             //  long max = Integer.MIN_VALUE;
             //  if (stack.isEmpty()){
             //      max = 0;
             //  } else {
             //      for (Long st : stack) {
             //          if (st > max) {
             //              max = st;
             //          }
             //      }
             //  }
             //  System.out.println(max);
            }

        }

    }
}
