package linearDataStructures;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex_08_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nsx = scanner.nextLine().split("\\s+");
        String[] nums = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < Integer.parseInt(nsx[0]); i++) {
            stack.push(Integer.parseInt(nums[i]));
        }

        for (int i = 0; i < Integer.parseInt(nsx[1]); i++) {
            stack.pop();
        }
        int smallest = Integer.MAX_VALUE;
        if (!stack.isEmpty()) {
            if (stack.contains(Integer.parseInt(nsx[2]))) {
                System.out.println("true");
            } else {
                for (Integer integer : stack) {
                    if (integer < smallest) {
                        smallest = integer;
                    }
                }
                System.out.println(smallest);
            }
        } else {
            System.out.println(0);
        }
    }
}
