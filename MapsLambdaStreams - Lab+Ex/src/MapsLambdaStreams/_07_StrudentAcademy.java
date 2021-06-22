package MapsLambdaStreams;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class _07_StrudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        for (int i = 0; i < n *2; i += 2) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(name)) {
                map.put(name, grade);
            } else {
                map.put(name, (map.get(name) + grade)/ 2);
            }
        }

        map.entrySet().stream().filter( e-> e.getValue() >= 4.5)
                .sorted((f,s) -> s.getValue().compareTo(f.getValue()))
                .forEach(e->
                        System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));


    }
}
