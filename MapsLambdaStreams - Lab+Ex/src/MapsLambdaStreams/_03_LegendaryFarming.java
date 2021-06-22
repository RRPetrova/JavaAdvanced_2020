package MapsLambdaStreams;

import java.lang.reflect.Array;
import java.util.*;

public class _03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> notJunks = List.of("motes", "shards", "fragments");
        HashMap<String, Integer> map = new HashMap<>();
        for (String notJunk : notJunks) {
            map.put(notJunk, 0);
        }


        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();
        boolean hasWon = false;
        while (!hasWon) {
            String[] array = scanner.nextLine().split("\\s+");
            for (int i = 0; i < array.length - 1; i += 2) {
                int qty = Integer.parseInt(array[i]);
                String material = array[i + 1].toLowerCase();

                if (notJunks.contains(material)) {
                        if (qty >= 250 || qty + map.get(material) >= 250) {
                            if (material.equals("motes")) {
                                System.out.println("Dragonwrath obtained!");
                            } else if (material.equals("fragments")) {
                                System.out.println("Valanyr obtained!");
                            } else if (material.equals("shards")) {
                                System.out.println("Shadowmourne obtained!");
                            }
                            map.put(material, map.get(material) + qty - 250);
                            hasWon = true;
                            break;
                        }
                        map.put(material, map.get(material) + qty);
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, qty);
                    } else {
                        junkMap.put(material, junkMap.get(material) + qty);
                    }
                }
            }
        }
        map.entrySet().stream().sorted((a1, a2) -> {
            int res = a2.getValue().compareTo(a1.getValue());
            if (res == 0) {
                res = a1.getKey().compareTo(a2.getKey());
            }
            return res;
        }).forEach(e -> {
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue()));
        });

        junkMap.entrySet().stream().sorted((f, s) -> {
            return f.getKey().compareTo(s.getKey());

        }).forEach(e -> {
            System.out.printf("%s: %d%n", e.getKey(), e.getValue());
        });

    }
}
