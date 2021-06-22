package lab_07_math_potato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String[] kids = reader.readLine().split("\\s+");
        int n = Integer.parseInt(reader.readLine());

        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String kid : kids) {
            queue.offer(kid);
        }

        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int cycle) {
        if (cycle < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(cycle); i++) {
            if (cycle % i == 0) {
                return false;
            }
        }
        return true;
    }
}

