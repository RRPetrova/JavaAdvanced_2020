import java.util.Scanner;
import java.util.function.Predicate;

public class _06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int lower = Integer.parseInt(input[0]);
        int upper = Integer.parseInt(input[1]);
        String condition = scanner.nextLine();

        for (int i = lower; i <= upper; i++) {
            if (testCondition(condition).test(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static Predicate<Integer> testCondition(String condition) {
        if (condition.equals("odd")) {
            return n -> n % 2 != 0;
        } else {
            return n -> n % 2 == 0;
        }
    }
}
