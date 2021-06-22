package _03opinion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            int age = Integer.parseInt(tokens[1]);
            Person person = new Person(tokens[0], age);

            if (person.getAge() > 30) {
                people.add(person);
            }
        }
        people.stream().sorted((f,s) -> {
           int res = f.getName().compareTo(s.getName());
           return res;
        }).forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));
    }

}
