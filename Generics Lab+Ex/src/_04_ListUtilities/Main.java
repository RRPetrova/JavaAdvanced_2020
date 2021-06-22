package _04_ListUtilities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

List<Integer> list = Arrays.asList(1, -4, 56, 28, -100);

        System.out.println(ListUtils.getMax(list));
        System.out.println(ListUtils.getMin(list));



    }
}
