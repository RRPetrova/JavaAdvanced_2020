package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String cmd = scanner.nextLine();
        while (!cmd.equals("end")) {
            String[] tokens = cmd.split(" ");
            if (tokens[0].equals("Add")) {
                numbers.add(Integer.parseInt(tokens[1]));
            } else if (tokens[0].equals("Remove")) {
                int index = numbers.indexOf(Integer.parseInt(tokens[1]));
                numbers.remove(index);
            } else if (tokens[0].equals("RemoveAt")) {
                numbers.remove(Integer.parseInt(tokens[1]));
            } else if (tokens[0].equals("Insert")) {
                numbers.add(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[1]));
            }
            cmd = scanner.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
