package MapsLambdaStreams;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Lab_01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> map = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), map.get(list.get(i))+ 1);
            }
        }
        for (Map.Entry<Double, Integer> doubleIntegerEntry : map.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(doubleIntegerEntry.getKey()), doubleIntegerEntry.getValue());
        }


    }
}
