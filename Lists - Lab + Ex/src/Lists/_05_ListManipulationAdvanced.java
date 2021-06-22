package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();
        while (!cmd.equals("end")) {
            String[] tokens = cmd.split(" ");
            if (tokens[0].equals("Contains")) {
                if (numbers.contains(Integer.parseInt(tokens[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (tokens[0].equals("Print")) {
                if (tokens[1].equals("even")) {
                    for (Integer num : numbers) {
                        if (num % 2 == 0) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                } else if (tokens[1].equals("odd")) {
                    for (Integer num : numbers) {
                        if (num % 2 != 0) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
            } else if (tokens[0].equals("Get")) {
                int sum = 0;
                for (Integer num : numbers) {
                    sum += num;
                }
                System.out.println(sum);
            } else if (tokens[0].equals("Filter")) {
                for (Integer num : numbers) {
                    if (tokens[1].equals("<") && num < Integer.parseInt(tokens[2])) {
                        System.out.print(num + " ");
                    } else if (tokens[1].equals(">") && num > Integer.parseInt(tokens[2])) {
                        System.out.print(num + " ");
                    } else if (tokens[1].equals(">=") && num >= Integer.parseInt(tokens[2])) {
                        System.out.print(num + " ");
                    } else if (tokens[1].equals("<=") && num <= Integer.parseInt(tokens[2])) {
                        System.out.print(num + " ");
                    }
                }
                System.out.println();
            }

            cmd = scanner.nextLine();
        }

    }
}
