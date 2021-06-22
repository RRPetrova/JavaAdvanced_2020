package MapsLambdaStreams;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        LinkedHashMap<String, List<String>> courses = new LinkedHashMap<>();
        List<String> students = new ArrayList<>();
        while (!cmd.equals("end")) {
            String[] tokens = cmd.split("\\s+:\\s+");
            String curCourse = tokens[0];
            String name = tokens[1];
            if (!courses.containsKey(curCourse)) {
                students = new ArrayList<>();
            } else {
                students = courses.get(curCourse);
            }
            students.add(name);
            courses.put(curCourse, students);
            cmd = scanner.nextLine();
        }

        courses.entrySet().stream().sorted((f, s) -> {
            return s.getValue().size() - f.getValue().size();
                }).forEach(e -> {
            System.out.printf("%s: %d%n", e.getKey(), e.getValue().size());
            e.getValue().stream()
                    .sorted((f,s) -> f.compareTo(s))
                    .forEach(x -> System.out.printf("-- %s%n", x));
        });



    }
}
