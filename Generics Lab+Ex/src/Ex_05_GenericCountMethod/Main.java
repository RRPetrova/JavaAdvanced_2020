package Ex_05_GenericCountMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Box<String>> list = new ArrayList<>();

        while (n-- > 0) {
            Box<String> box = new Box<>(reader.readLine());
            list.add(box);
        }

        Box<String> toBeComp = new Box<>(reader.readLine());
        System.out.println(compareStrings(list, toBeComp));
    }

    private static <T extends Comparable> long compareStrings(List<Box<T>> list,
                                                              Box<T> toBeComp) {

        long occ = list.stream()
                .filter(e -> 0 < e.getInput().compareTo(toBeComp.getInput()))
                .count();


        return occ;
    }


}
