import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Ex_07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        Function<List<Integer>, Integer> smallest = x -> getSmallest(x);

        System.out.println(smallest.apply(list));
    }

    private static int getSmallest(List<Integer> list) {
        int index = 0;
        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= smallestNum) {
                smallestNum = list.get(i);
                index = i;
            }
        }
        return index;
    }
}
