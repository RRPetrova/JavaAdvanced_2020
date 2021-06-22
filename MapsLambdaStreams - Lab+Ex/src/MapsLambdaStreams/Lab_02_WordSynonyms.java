package MapsLambdaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Lab_02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        List<String> synonyms = new ArrayList<>();
        for (int i = 0; i < n*2; i += 2) {
            String word = scanner.nextLine();
            String syn = scanner.nextLine();

            if (!map.containsKey(word)) {
                synonyms = new ArrayList<>();
            } else {
                synonyms = map.get(word);
            }

            synonyms.add(syn);
            map.put(word, synonyms);

        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(),
                    entry.getValue().stream().collect(Collectors.joining(", ")));
        }


    }
}
