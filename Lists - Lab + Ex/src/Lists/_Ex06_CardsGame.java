package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (!first.isEmpty() || !second.isEmpty()) {
            int i = 0;
            if (first.get(i) > second.get(i)) {
                int winningCard = first.get(i);
                int loosingCard = second.get(i);
                first.remove(first.indexOf(winningCard));
                first.add(winningCard);
                first.add(loosingCard);
                second.remove(second.indexOf(loosingCard));
            } else if (first.get(i) < second.get(i)) {
                int winningCard = second.get(i);
                int loosingCard = first.get(i);
                second.remove(second.indexOf(winningCard));
                second.add(winningCard);
                second.add(loosingCard);
                first.remove(first.indexOf(loosingCard));
            } else {
                second.remove(second.indexOf(second.get(i)));
                first.remove(first.indexOf(first.get(i)));
            }
            i++;
            if (first.isEmpty() || second.isEmpty()) {
                break;
            }

        }
        int sum = 0;
        if (!first.isEmpty()) {
            for (Integer integer : first) {
                sum += integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (!second.isEmpty()) {
            for (Integer integer : second) {
                sum += integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }


}
