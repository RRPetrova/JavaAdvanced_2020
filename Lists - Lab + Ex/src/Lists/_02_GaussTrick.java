package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() / 2 && list.size() % 2 != 0) {
                listResult.add(list.get(i));
                break;
            } else if (list.size() % 2 == 0 && i == list.size() / 2) {
                break;
            }
            //0 + 5-0-1 ; 1 + 5-1-1
            listResult.add(list.get(i) + list.get(list.size() - i - 1));
        }

        for (Integer integer : listResult) {
            System.out.print(integer + " ");
        }


    }
}
