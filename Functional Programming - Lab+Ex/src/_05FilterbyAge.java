import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _05FilterbyAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            people.put(input[0], Integer.parseInt(input[1]));
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        for (Map.Entry<String, Integer> person : people.entrySet()) {
            Predicate<Integer> integerPredicate = testCondition(age, condition);
            if (integerPredicate.test(people.get(person.getKey()))) {
                printFormat(format).accept(person);
            }
        }
    }
    private static Consumer<Map.Entry<String, Integer>> printFormat(String format) {
        if (format.equals("name age")) {
            return p -> System.out.print(String.format("%s - %d%n", p.getKey(), p.getValue()));
        } else if (format.equals("name")) {
            return p -> System.out.println(p.getKey());
        } else {
            return p -> System.out.println(p.getValue());
        }
    }
    private static Predicate<Integer> testCondition(int age, String condition) {
        Predicate<Integer> conditionTest = null;
        if (condition.equals("younger")) {
            conditionTest = x -> x <= age;
        } else if (condition.equals("older")) {
            conditionTest = x -> x >= age;
        }
        return conditionTest;
    }
}
