package MapsLambdaStreams;

import java.util.*;

public class _10_SoftuniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> stPoints = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> countSubm = new LinkedHashMap<>();
                //name - points
        //lang / size
        String cmd = scanner.nextLine();
        while (!cmd.equals("exam finished")) {
            String[] tokens = cmd.split("-");
            String name = tokens[0];
            if (tokens.length == 3) {
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                if (!stPoints.containsKey(name)) {
                    stPoints.put(name, points);
                } else {
                    if (stPoints.get(name) < points) {
                        stPoints.remove(name);
                        stPoints.put(name, points);
                    }
                }


                if (!countSubm.containsKey(language)) {
                    countSubm.put(language, 1);
                } else {
                    countSubm.put(language, countSubm.get(language) + 1);
                }
            } else {
                for (Map.Entry<String, Integer> entry : stPoints.entrySet()) {
                    if (entry.getKey().contains(name)) {
                        stPoints.remove(name);
                    }
                }
            }
            cmd = scanner.nextLine();
        }


        System.out.println("Results:");
        stPoints.entrySet().stream().sorted((f,s) -> {
            int res = s.getValue() - f.getValue();
            if (res == 0) {
                res = f.getKey().compareTo(s.getKey());
            }
            return res;
        }).forEach(e ->

        {

            System.out.printf("%s | %d%n" , e.getKey(), e.getValue());
        });

        System.out.println("Submissions:");
       countSubm.entrySet().stream().sorted((f,s) -> {
           int res = s.getValue().compareTo(f.getValue());
           if (res == 0) {
               res = f.getKey().compareTo(s.getKey());
           }
           return res;
       }).forEach(e -> System.out.printf("%s - %d%n", e.getKey(), e.getValue()));


    }
}
