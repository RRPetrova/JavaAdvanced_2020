import java.util.Scanner;
import java.util.function.Predicate;

public class Ex_06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");

        Predicate<Integer> checkLength = x -> x <= length;

        for (int i = 0; i < input.length; i++) {
            if (checkLength.test(input[i].length())) {
                System.out.println(input[i]);
            }
        }

    }
}
