package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsWithPasseng = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String cmd = scanner.nextLine();
        while (!cmd.equals("end")) {
            String[] tokens = cmd.split(" ");
            if (tokens[0].equals("Add")) {
                wagonsWithPasseng.add(Integer.parseInt(tokens[1]));
            } else {
                int currentPassengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagonsWithPasseng.size(); i++) {
                    int passInside = wagonsWithPasseng.get(i);
                    if (passInside + currentPassengers <= maxCapacity ) {
                        wagonsWithPasseng.set(i, passInside + currentPassengers);
                      break;
                    }
                }
            }
            cmd = scanner.nextLine();
        }
        for (Integer integer : wagonsWithPasseng) {
            System.out.print(integer + " ");

        }

    }
}
