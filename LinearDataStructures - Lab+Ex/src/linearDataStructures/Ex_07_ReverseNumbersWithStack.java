package linearDataStructures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex_07_ReverseNumbersWithStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            stack.push(Integer.parseInt(input[i]));
        }

        for (Integer integer : stack) {
            System.out.print(integer + " ");
        }
    }
}