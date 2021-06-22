package Ex_06_StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Set<Person> byName = new TreeSet<>(new PersonComparatorByName());
        Set<Person> byAge = new TreeSet<>(new PersonComparatorByAge());

        while (n-- > 0) {
            String[] input = reader.readLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));
            if (Integer.parseInt(input[1]) >= 1) {
                byName.add(person);
                byAge.add(person);
            }
        }
        byName.forEach(System.out::println);
        byAge.forEach(System.out::println);
    }
}
