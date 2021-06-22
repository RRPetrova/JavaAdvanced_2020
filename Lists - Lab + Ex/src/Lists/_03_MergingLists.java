package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.min(first.size(), second.size()); i++) {
            if (first.size() > second.size()) {
                result.add(first.get(i));
                result.add(second.get(i));
            } else {
                result.add(first.get(i));
                result.add(second.get(i));
            }
        }
        for (int i = Math.min(first.size(), second.size()); i < Math.max(first.size(), second.size()); i++) {
            if (first.size() > second.size()) {
                result.add(first.get(i));
            } else {
                result.add(second.get(i));
            }
        }
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

    }
}
