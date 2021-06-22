package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Long::parseLong).collect(Collectors.toList());

        String cmd = scanner.nextLine();

        while (!cmd.equalsIgnoreCase("end")) {
            String[] tokens = cmd.split("\\s+");
            if (tokens[0].equals("Delete")) {
                while (list.contains(Long.parseLong(tokens[1]))) {
                    list.remove(list.indexOf(Long.parseLong(tokens[1])));
                }
            } else if (tokens[0].equalsIgnoreCase("Insert")) {
                if (Long.parseLong(tokens[2]) >= 0 && Long.parseLong(tokens[2]) < list.size()) {
                    list.add(Integer.parseInt(tokens[2]), Long.parseLong(tokens[1]));
                }
            }
            cmd = scanner.nextLine();
        }
        for (Long integer : list) {
            System.out.print(integer + " ");
        }

    }
}
