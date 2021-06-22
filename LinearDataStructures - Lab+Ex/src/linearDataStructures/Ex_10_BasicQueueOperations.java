package linearDataStructures;

import java.lang.reflect.Array;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex_10_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        String[] array = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < Integer.parseInt(nsx[0]); i++) {
            deque.add(Integer.parseInt(array[i]));
        }
        for (int i = 0; i < Integer.parseInt(nsx[1]); i++) {
            deque.poll();
        }

        int smallest = Integer.MAX_VALUE;
        if (deque.isEmpty()) {
            System.out.println("0");
        } else {
            if (deque.contains(Integer.parseInt(nsx[2]))) {
                System.out.println("true");
            } else {
                for (Integer integer : deque) {
                    if (integer < smallest) {
                        smallest = integer;
                    }
                }
                System.out.println(smallest);

            }
        }
    }
}
