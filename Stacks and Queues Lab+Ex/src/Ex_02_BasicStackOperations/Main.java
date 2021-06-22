package Ex_02_BasicStackOperations;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nsx = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int n = nsx[0];
        int s = nsx[1];
        int x = nsx[2];

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(nums[i]);
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println(true);
        } else {
            int min = Integer.MAX_VALUE;
            if (stack.isEmpty()) {
                min = 0;
            } else {
                for (int i = 0; i < stack.size(); i++) {
                    int currNum = stack.pop();
                    if (currNum <= min) {
                        min = currNum;
                    }
                }
            }
            System.out.println(min);

        }
    }
}
