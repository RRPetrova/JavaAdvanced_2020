package ex_07_RecursiveFibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        long n = Long.parseLong(reader.readLine());
        ArrayDeque<Long> leftSide = new ArrayDeque<>(); //lifo

        long first = 1;
        long last = 1;
        leftSide.add(first);
        leftSide.add(last);
        for (int i = 1; i < n; i++) {
            leftSide.add(first + last);     // 1 1  2   3   5
            leftSide.remove();
            first = leftSide.peek();
            last = leftSide.peekLast();
        }

        System.out.println(leftSide.peekLast());
    }
}
