import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        Predicate<String> cond = x -> {
            return x.charAt(0) == x.toUpperCase().charAt(0);
        };
        List<String> list = new ArrayList<>();

        for (String s : input) {
            if (cond.test(s) && !Character.isDigit(s.charAt(0))) {
                list.add(s);

            }
        }
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }


    }
}
