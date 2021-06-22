package lab_06_hot_potato;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String[] kids = reader.readLine().split("\\s+");
        int n = Integer.parseInt(reader.readLine());

        ArrayDeque<String> hotPotato = new ArrayDeque<>();

        for (String kid : kids) {
            hotPotato.offer(kid);
        }

        while (hotPotato.size() > 1) {
            for (int i = 1; i < n; i++) {
                hotPotato.offer(hotPotato.poll());
            }
            System.out.println("Removed " + hotPotato.poll());
        }
        System.out.println("Last is " + hotPotato.poll());
    }


}

