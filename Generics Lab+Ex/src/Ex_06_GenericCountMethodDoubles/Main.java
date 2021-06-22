package Ex_06_GenericCountMethodDoubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new
                BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Box<Double>> list = new ArrayList<>();
        while (n-- > 0) {
            list.add(new Box<>(Double.parseDouble(reader.readLine())));
        }

        Box<Double> toBeComparedWith =
                new Box<>(Double.parseDouble(reader.readLine()));

        System.out.println(compareMethod(list, toBeComparedWith));
    }

    private static<T extends Comparable> long compareMethod(List<Box<T>> list,
                                                           Box<T> toBeComparedWith) {
                return list.stream()
                .filter(e -> 0 < e.getInput().compareTo(toBeComparedWith.getInput()))
                .count();
    }
}
