package _09CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();


        Map<String, Cat> cats = new HashMap<>();
        Cat cat = null;

        while (!cmd.equals("End")) {
            String[] tokens = cmd.split("\\s+");
            String breed = tokens[0];
            String name = tokens[1];
            double characteristic = Double.parseDouble(tokens[2]);

            if (breed.equals("Siamese")) {
                cat = new Siamese(name, characteristic);
            } else if (breed.equals("Cymric")) {
                cat = new Cymric(name, characteristic);
            } else if (breed.equals("StreetExtraordinaire")) {
                cat = new StreetExtraordinary(name, characteristic);
            }
            cats.put(name, cat);

            cmd = scanner.nextLine();
        }
        String name = scanner.nextLine();

        if (cats.containsKey(name)) {
            System.out.println(cats.get(name).toString());
        }
    }
}
