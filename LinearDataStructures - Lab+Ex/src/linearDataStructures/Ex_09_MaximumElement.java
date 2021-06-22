package linearDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Ex_09_MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bf.readLine());
        ArrayDeque<Long> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] cmd = bf.readLine().split("\\s+");

            long max = Integer.MIN_VALUE;

            if (cmd[0].equals("1")) {
                deque.push(Long.parseLong(cmd[1]));
            } else if (cmd[0].equals("2")) {
                deque.pop();
            } else if (cmd[0].equals("3")) {
                for (Long integer : deque) {
                    if (integer > max) {
                        max = integer;
                    }
                }
                sb.append(max).append(System.lineSeparator());
            }
        }
        System.out.println(sb);
    }
}
