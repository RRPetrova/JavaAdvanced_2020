package _08FamilyTree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> namePersonMap = new LinkedHashMap<>(); //Gancho, name, date
        List<String> listPeople = new ArrayList<>();

        String input;
        while (!"End".equals(input = scanner.nextLine())) {

            if (!input.contains(" - ")) {
                String[] tokens = input.split("\\s+");
                String name = tokens[0] + " " + tokens[1];
                String bdate = tokens[2];
                Person person = new Person(name, bdate);
                namePersonMap.put(name, person);
            } else {
                listPeople.add(input);
            }
        }

        for (String listPerson : listPeople) {
            String leftParent = listPerson.split(" - ")[0];
            String rightChild = listPerson.split(" - ")[1];

            if (!leftParent.contains("/")) { //Gancho Peshev 01/01/2005
                if (namePersonMap.containsKey(leftParent)) { //Gancho Peshev
                  namePersonMap.get(leftParent).getChildren().add(rightChild);
                }
            }


        }


    }
}
