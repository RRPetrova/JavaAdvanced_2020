import java.util.Scanner;
import java.util.function.Consumer;

public class Ex_02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Consumer<String> appending = x -> System.out.println("Sir " + x);

        for (String s : input) {
            appending.accept(s);
        }

    }
}
