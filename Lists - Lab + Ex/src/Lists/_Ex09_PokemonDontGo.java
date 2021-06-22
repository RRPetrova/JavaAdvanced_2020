package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumValueRemoved = 0;
        while (!distances.isEmpty()) {
            int currIndex = Integer.parseInt(scanner.nextLine());

            int valueRemoved = 0;
            if (currIndex < 0) {
                valueRemoved = distances.get(0);
                distances.remove(0);
                int lastElement = distances.get(distances.size() - 1);
                distances.add(0, lastElement);
            } else if (currIndex >= distances.size()) {
                valueRemoved = distances.get(distances.size() - 1);
                distances.remove(distances.size() - 1);
                int firstElement = distances.get(0);
                distances.add(firstElement);
            } else {
                valueRemoved = distances.get(currIndex);
                distances.remove(currIndex);
            }
            for (int i = 0; i < distances.size(); i++) {
                int currValue = distances.get(i);
                if (currValue <= valueRemoved) {
                    distances.set(i, valueRemoved + currValue);
                } else {
                    distances.set(i, currValue - valueRemoved);
                }
            }
            sumValueRemoved += valueRemoved;
        }
        System.out.println(sumValueRemoved);

    }
}
