package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();
        while (!cmd.equals("End")) {
            String[] tokens = cmd.split("\\s+");
            if (tokens[0].equals("Add")) {
                list.add(Integer.parseInt(tokens[1]));
            } else if (tokens[0].equals("Insert")) {
                if (Integer.parseInt(tokens[2]) >= 0 &&
                        Integer.parseInt(tokens[2]) < list.size()) {
                    list.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (tokens[0].equals("Remove")) {
                if (Integer.parseInt(tokens[1]) >= 0 &&
                        Integer.parseInt(tokens[1]) < list.size()) {
                    list.remove(Integer.parseInt(tokens[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (tokens[0].equals("Shift")) {
                if (tokens[1].equals("left")) {
                    for (int i = 0; i < Integer.parseInt(tokens[2]); i++) {
                        int first = list.get(0);
                        list.add(first);
                       list.remove(0);
                    }
                } else if (tokens[1].equals("right")) {
                    for (int i = 0; i < Integer.parseInt(tokens[2]); i++) {
                        int last = list.get(list.size()-1);
                        list.add(0, last);
                        list.remove(list.size()-1);
                    }
                }
            }

            cmd = scanner.nextLine();
        }
        System.out.println(list.toString().replace("[", "")
        .replace("]","")
                .replace(",", ""));
    }
}
