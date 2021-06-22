package MapsLambdaStreams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        LinkedHashMap<String, Long> miner = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            long qty = Long.parseLong(scanner.nextLine());
            if (!miner.containsKey(resource)) {
                miner.put(resource, qty);
            } else {
                miner.put(resource, miner.get(resource) + qty);
            }
            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Long> stringLongEntry : miner.entrySet()) {
            System.out.printf("%s -> %d%n", stringLongEntry.getKey(), stringLongEntry.getValue());
        }

    }
}
