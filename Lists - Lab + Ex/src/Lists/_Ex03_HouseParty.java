package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Ex03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] cmd = scanner.nextLine().split("\\s+");
            if (cmd.length == 3) {
                if (!guests.contains(cmd[0])) {
                    guests.add(cmd[0]);
                } else {
                    System.out.printf("%s is already in the list!%n", cmd[0]);
                }
            } else if (cmd.length > 3) {
                if (guests.contains(cmd[0])) {
                    guests.remove(guests.indexOf(cmd[0]));
                } else {
                    System.out.printf("%s is not in the list!%n", cmd[0]);
                }
            }
        }
        for (String guest : guests) {
            System.out.println(guest);
        }

    }
}
