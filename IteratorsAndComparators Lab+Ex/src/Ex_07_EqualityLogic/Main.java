package Ex_07_EqualityLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        TreeSet<Person> treeSetPerson = new TreeSet<>();
        HashSet<Person> hashPerson = new HashSet<>();

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            String[] input = reader.readLine().split("\\s+");
            Person person = new Person(input[0], Integer.parseInt(input[1]));

                hashPerson.add(person);
                treeSetPerson.add(person);

        }
        System.out.println(treeSetPerson.size());
        System.out.println(hashPerson.size());
    }
}
