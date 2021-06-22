import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }
        list.removeIf(n -> n % 2 != 0);

        System.out.println(String.join(", ", list.stream().map(String::valueOf).collect(Collectors.joining(", "))));
        list.sort((n1, n2) -> n1.compareTo(n2));
        System.out.println(String.join(", ", list.toString().replaceAll("\\[", "").replaceAll("]", "")));

    }
}