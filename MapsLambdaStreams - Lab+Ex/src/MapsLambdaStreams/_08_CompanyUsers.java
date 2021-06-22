package MapsLambdaStreams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
        List<String> ids = new ArrayList<>();
        String cmd = scanner.nextLine();

        while (!cmd.equals("End")) {
            String[] tokens = cmd.split("\\s+->\\s+");
            String company = tokens[0];
            String id = tokens[1];
            if (!map.containsKey(company)) {
                ids = new ArrayList<>();
            } else {
                ids = map.get(company);
            }
            if (!ids.contains(id)) {
                ids.add(id);
            }
            map.put(company, ids);
            cmd = scanner.nextLine();
        }
map.entrySet().stream().sorted((f,s) -> {

            return f.getKey().compareTo(s.getKey());
        }
).forEach(e -> {
        System.out.printf("%s%n", e.getKey());
        e.getValue().forEach(x -> System.out.printf("-- %s%n", x));
});


    }
}
