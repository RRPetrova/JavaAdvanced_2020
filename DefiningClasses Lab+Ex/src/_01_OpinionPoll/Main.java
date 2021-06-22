package _01_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Person person;
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            person = new Person();

            person.setName(tokens[0]);
            person.setAge(Integer.parseInt(tokens[1]));
            if (person.getAge() > 30) {
                people.add(person);
            }
        }
people.stream()
        .sorted((f,s) -> f.getName().compareTo(s.getName()))
        .forEach(System.out::println);


    }
}
