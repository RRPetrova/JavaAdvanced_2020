import java.util.Scanner;
import java.util.function.Function;

public class Ex_03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int[] nums = new int[input.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
//accepts a parameter of type int[] and returns variable of type int

        Function<int[], Integer> findMin = array -> getMin(array);
        System.out.println(findMin.apply(nums));

    }
    public static int getMin (int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
