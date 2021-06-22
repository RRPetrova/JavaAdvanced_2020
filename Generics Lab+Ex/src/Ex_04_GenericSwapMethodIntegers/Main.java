package Ex_04_GenericSwapMethodIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Box<Integer>> list = new ArrayList<>();

        while (n-- > 0) {
            int num = Integer.parseInt(br.readLine());
            Box<Integer> box = new Box<>(num);
            list.add(box);
        }
String[] inds = br.readLine().split("\\s+");
        int a = Integer.parseInt(inds[0]);
        int b = Integer.parseInt(inds[1]);
        swapIndexes(list, a, b);
        StringBuilder sb = new StringBuilder();
        for (Box<Integer> box : list) {

            sb.append(box).append(System.lineSeparator());
        }
        System.out.println(sb);

    }

    private static void swapIndexes(List<Box<Integer>> list, int a, int b) {
        Collections.swap(list, a, b);
    }
}
