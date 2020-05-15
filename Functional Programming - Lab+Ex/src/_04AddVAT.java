import java.util.Scanner;
import java.util.function.Function;

public class _04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Function<String, Double> vat = x-> Double.parseDouble(x) * 1.2;

        System.out.println("Prices with VAT:");
        for (String s : input) {
            System.out.println(String.format("%.2f", vat.apply(s)));
        }


    }
}
