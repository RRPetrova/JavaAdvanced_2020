import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex_08CustomComparator_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> numsEven = new ArrayList<>();
        List<Integer> numsOdd = new ArrayList<>();

        Predicate<Integer> even = x -> x % 2 == 0;

        for (int i = 0; i < input.length; i++) {
            if (even.test(Integer.parseInt(input[i]))) {
                numsEven.add(Integer.parseInt(input[i]));
            }
        }
        for (int i = 0; i < input.length; i++) {
            if (!even.test(Integer.parseInt(input[i]))) {
                numsOdd.add(Integer.parseInt(input[i]));
            }
        }
        Collections.sort(numsEven);
        Collections.sort(numsOdd);
        for (Integer integer : numsEven) {
            System.out.print(integer + " ");
        }
        for (Integer integer : numsOdd) {
            System.out.print(integer + " ");
        }


    }
}
