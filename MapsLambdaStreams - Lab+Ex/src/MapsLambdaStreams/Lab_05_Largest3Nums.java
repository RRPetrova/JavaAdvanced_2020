package MapsLambdaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab_05_Largest3Nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted((a1, a2) -> a2.compareTo(a1))
                .collect(Collectors.toList());

        int count = 0;
        for (Integer integer : list) {
            count++;
            System.out.print(integer + " ");
            if (count == 3) {
                break;
            }
        }

    }
}
