package Ex_05_ComparingObjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        Person person = null;
        HashMap<Person, Integer> people = new HashMap<>();
        int n = 1;
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);

            people.put(person, n);
            n++;
            input = reader.readLine();
        }
        int num = Integer.parseInt(reader.readLine());
        Person pToC = null;
        for (Map.Entry<Person, Integer> personIntegerEntry : people.entrySet()) {
            if (personIntegerEntry.getValue() == num) {
                pToC = personIntegerEntry.getKey();
            }
        }

        int countEq = 0;
        int countNotEq = 0;
        for (Map.Entry<Person, Integer> personIntegerEntry : people.entrySet()) {
            Person currPerson = personIntegerEntry.getKey();
            if (currPerson.compareTo(pToC) == 0) {
                countEq++;
            } else {
                countNotEq++;
            }
        }
        if (countEq == 1) {
            countEq = 0;
        }
        if (countEq == 0) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", countEq, countNotEq, people.size());
        }
    }
}
