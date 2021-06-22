package MapsLambdaStreams;

import java.lang.reflect.Array;
import java.util.*;

public class Lab_03_OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i].toLowerCase())) {
                map.put(words[i].toLowerCase(), 1);
            } else {
                map.put(words[i].toLowerCase(), map.get(words[i].toLowerCase()) + 1);
            }
        }
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
        res.add(entry.getKey());
            }
        }
        System.out.println(res.toString().replace("[", "")
                .replace("]", ""));

    }
}
