package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> seq = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int bombNum = input[0];
        int bombPower = input[1];

        while (seq.contains(bombNum)) {
            int ind = seq.indexOf(bombNum);
            if (ind < 0 || ind >= seq.size()) {
                break;
            } else {
                if (ind - bombPower >= 0 && ind + bombPower < seq.size()) {
                    for (int i = ind + bombPower; i >= ind - bombPower; i--) {
                        seq.remove(i);
                    }
                } else {
                    if (ind - bombPower < 0 && ind + bombPower >= seq.size()) {
                        seq.clear();
                    }
                    if (ind - bombPower < 0 && ind + bombPower < seq.size()) {
                        for (int i = ind + bombPower; i >= 0; i--) {
                            seq.remove(i);
                        }
                    }
                    if (ind + bombPower >= seq.size() && ind - bombPower >= 0 ) {
                        for (int i = seq.size() - 1; i >= ind - bombPower; i--) {
                            seq.remove(i);
                        }
                    }

                }
            }
        }
        int sum = 0;
        for (Integer integer : seq) {
            sum += integer;
        }
        System.out.println(sum);

    }
}
