package MapsLambdaStreams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_Plants2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> rarityInfo = new LinkedHashMap<>();
        LinkedHashMap<String, Double> ratingInfo = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("<->");
            String plant = info[0];
            int currentRarity = Integer.parseInt(info[1]);
            rarityInfo.put(plant, currentRarity);
            ratingInfo.put(plant, 0.0);
            //   System.out.println(rarityInfo);
        }

        String cmd = scanner.nextLine();
        while (!cmd.equals("Exhibition")) {
            String[] tokens = cmd.split(":\\s+");
            String[] info = tokens[1].split("\\s+-\\s+");

            String plant = info[0];
            if (tokens[0].equals("Rate")) {
                int currRate = Integer.parseInt(info[1]);
                if (ratingInfo.get(plant) != 0) {
                    double averRate = (ratingInfo.get(plant) + currRate) / 2;
                    ratingInfo.put(plant, averRate);
                } else {
                    ratingInfo.put(plant, currRate * 1.0);
                }

            } else if (tokens[0].equals("Update")) {
                if (rarityInfo.containsKey(plant)) {
                    rarityInfo.put(plant, Integer.parseInt(info[1]));
                }

            } else if (tokens[0].equals("Reset")) {
                if (ratingInfo.containsKey(plant)) {
                    ratingInfo.put(plant, 0.00);
                }
            } else {
                System.out.println("error");
            }
            cmd = scanner.nextLine();
        }


        System.out.println("Plants for the exhibition:");

        rarityInfo.entrySet().stream().sorted((f, s) -> {
            int res = s.getValue().compareTo(f.getValue());
            return res;
        })
                .forEach(e -> {

                    for (Map.Entry<String, Double> entryRating : ratingInfo.entrySet()) {
                        if (e.getKey().equals(entryRating.getKey())) {

                            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                                    e.getKey(), e.getValue(), entryRating.getValue());
                        }
                    }
                });


    }
}