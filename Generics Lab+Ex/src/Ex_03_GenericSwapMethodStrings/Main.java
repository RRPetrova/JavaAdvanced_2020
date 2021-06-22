package Ex_03_GenericSwapMethodStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Box<String>> list = new ArrayList<>();

        while (n-- > 0) {
            Box<String> box = new Box<>(reader.readLine());
            list.add(box);
        }
        String[] ind = reader.readLine().split("\\s+");
        int f = Integer.parseInt(ind[0]);
        int s = Integer.parseInt(ind[1]);
        swapIndexes(list, f,s);
        list.forEach(System.out::println);
    }

    private static<T> void swapIndexes(List<Box<String>> list, int f, int s) {
        Collections.swap(list, f,s);
    }
}
