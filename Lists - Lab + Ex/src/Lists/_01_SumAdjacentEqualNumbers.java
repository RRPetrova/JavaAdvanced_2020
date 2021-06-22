package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01_SumAdjacentEqualNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        List<Double> seq = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            seq.add(array[i]);
        }
        // 8 2 2 4 8 16
        // i = 1 = i+1 ; i = 4 ; remove 2; continue 2
        for (int i = 0; i < seq.size() - 1; i++) {
            if (seq.get(i).equals(seq.get(i + 1))) {
                seq.set(i, seq.get(i) * 2);
                seq.remove(i + 1);
                i = -1;
            }
        }
        for (int j = 0; j < seq.size(); j++) {
            System.out.print(new DecimalFormat("0.#").format(seq.get(j)) + " ");
        }
}
}
