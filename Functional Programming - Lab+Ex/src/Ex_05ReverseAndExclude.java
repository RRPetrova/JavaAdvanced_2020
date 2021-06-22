import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex_05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int num = Integer.parseInt(scanner.nextLine());

        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        Collections.reverse(list);

        Predicate<Integer> divisible = x -> x % num == 0;
        for (int i = 0; i < list.size(); i++) {
            if (divisible.test(list.get(i))) {
                list.remove(list.get(i));
                i--;
            }
        }

        System.out.println(String.join(" ", String.valueOf(list)
                .replaceAll("\\[", "").replaceAll("]", "").replaceAll(",", "")));

    }
}
