import java.util.Scanner;
import java.util.function.Consumer;

public class Ex_01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        for (String s : input) {
            Consumer<String> printing = res -> System.out.println(res);
            printing.accept(s);
        }

    }
}
