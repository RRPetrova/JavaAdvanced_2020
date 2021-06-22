package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialCourses = Arrays.stream(scanner.nextLine()
                .split(", ")).collect(Collectors.toList());

        String cmd = scanner.nextLine();

        while (!cmd.equals("course start")) {
            String[] tokens = cmd.split(":");
            String lessonTitle = tokens[1];
            String ex = lessonTitle + "-Exercise";
            if (tokens[0].equals("Add")) {
                if (!initialCourses.contains(lessonTitle)) {
                    initialCourses.add(lessonTitle);
                }
            } else if (tokens[0].equals("Insert")) {
                int index = Integer.parseInt(tokens[2]);
                if (!initialCourses.contains(lessonTitle)) {
                    initialCourses.add(index, lessonTitle);
                }
            } else if (tokens[0].equals("Remove")) {
                if (initialCourses.contains(lessonTitle)) {
                    initialCourses.remove(initialCourses.indexOf(lessonTitle));
                    if (initialCourses.contains(ex)) {
                        initialCourses.remove(initialCourses.indexOf(ex));
                    }
                }
            } else if (tokens[0].equals("Swap")) {
                if (initialCourses.contains(lessonTitle) && initialCourses.contains(tokens[2])) {
                    int index1 = initialCourses.indexOf(lessonTitle);
                    int index2 = initialCourses.indexOf(tokens[2]);
                    Collections.swap(initialCourses, index1, index2);

                    if (initialCourses.contains(ex) && initialCourses.contains(tokens[2] + "-Exercise")) {
                        int ind1 = initialCourses.indexOf(ex);
                        int ind2 = initialCourses.indexOf(tokens[2] + "-Exercise");
                        Collections.swap(initialCourses, ind1, ind2);
                    } else if (initialCourses.contains(ex) && !initialCourses.contains(tokens[2] + "-Exercise")) {
                        int indEx = initialCourses.indexOf(ex);
                        initialCourses.remove(indEx);
                        initialCourses.add(index2+1, ex);
                    } else if (!initialCourses.contains(ex) && initialCourses.contains(tokens[2] + "-Exercise")) {
                        int indEx = initialCourses.indexOf(tokens[2] + "-Exercise");
                        initialCourses.remove(indEx);
                        initialCourses.add(index1+1, tokens[2] + "-Exercise");
                    }
                }

            } else if (tokens[0].equals("Exercise")) {

                if (initialCourses.contains(lessonTitle)) {
                    if (!initialCourses.contains(ex)) {
                        initialCourses.add(initialCourses.indexOf(lessonTitle) + 1, ex);
                    }
                } else {
                    initialCourses.add(lessonTitle);
                    initialCourses.add(ex);
                }
            }
            cmd = scanner.nextLine();
        }
int count = 1;
        for (String initialCours : initialCourses) {
            System.out.printf("%d.%s%n", count, initialCours);
            count++;
        }


    }
}
