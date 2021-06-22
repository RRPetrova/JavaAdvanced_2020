package _07Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, PersonInfo> people = new LinkedHashMap<>();

        String cmd = scanner.nextLine();
        while (!cmd.equals("End")) {
            String[] tokens = cmd.split("\\s+");
            String name = tokens[0];
            PersonInfo personInfo = null;
            if (!people.containsKey(name)) {
                personInfo = new PersonInfo(name);
            } else {
                personInfo = people.get(name);
            }

            if (tokens[1].equals("pokemon")) {
                Pokemon pokemon = new Pokemon(tokens[2], tokens[3]);
                personInfo.getPokemons().add(pokemon);
            } else if (tokens[1].equals("children")) {
                Children children = new Children(tokens[2], tokens[3]);
                personInfo.getChildrens().add(children);
            } else if (tokens[1].equals("parents")){
                Parent parent = new Parent(tokens[2], tokens[3]);
                personInfo.getParent().add(parent);
            } else if (tokens[1].equals("car")){
                Car car = new Car(tokens[2], Integer.parseInt(tokens[3]));
                personInfo.setCar(car);
            } else {
                Company company = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                personInfo.setCompany(company);
            }
            people.put(name, personInfo);

            cmd = scanner.nextLine();
        }

        cmd = scanner.nextLine();
        System.out.println(people.get(cmd));

    }
}
