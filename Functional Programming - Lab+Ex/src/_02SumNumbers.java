import java.util.Scanner;
import java.util.function.Function;

public class _02SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Function<String, Integer> parse = n-> Integer.parseInt(n);
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += parse.apply(input[i]);
        }
        System.out.println("Count = " + input.length);
        System.out.println("Sum = " + sum);


    }
}
