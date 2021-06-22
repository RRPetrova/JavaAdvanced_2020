package MapsLambdaStreams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                if (!count.containsKey(word.charAt(i))) {
                    count.put(word.charAt(i), 1);
                } else {
                    count.put(word.charAt(i), count.get(word.charAt(i))+ 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : count.entrySet()) {
            System.out.printf("%c -> %d%n", characterIntegerEntry.getKey(),
                    characterIntegerEntry.getValue());
        }


    }
}
