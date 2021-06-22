package MapsLambdaStreams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] cmd = scanner.nextLine().split("\\s+");
            String username = cmd[1];

            if (cmd[0].equals("register")) {
                if (parking.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n",
                            cmd[2]);
                } else {
                    parking.put(username, cmd[2]);
                    System.out.printf("%s registered %s successfully%n", username, cmd[2]);
                }
            } else if (cmd[0].equals("unregister")) {
                if (!parking.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parking.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }

        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }


    }
}
