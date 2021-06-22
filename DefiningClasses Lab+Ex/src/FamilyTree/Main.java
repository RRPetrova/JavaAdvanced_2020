import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static final String def = "unknown";

    public static void main (String[] argv) {
        List<String> inputDataList = getInput();

        Person head = getHead(inputDataList);

        generateTree(inputDataList, head);

        printTree(head);
    }

    private static List<String> getInput() {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        String line = scanner.nextLine();
        while (!line.equals("End")) {
            list.add(line);
            line = scanner.nextLine();
        }

        return list;
    }

    private static Person getHead(List<String> list) {
        String headPart = list.get(0);
        list.remove(0);

        String headInfo = list
                .stream()
                .filter(e -> e.contains(headPart) && !e.contains("-"))
                .collect(Collectors.joining());
        list.remove(headInfo);

        String[] headInfoParts = headInfo.split("\\s+");

        String birthday = headInfoParts[headInfoParts.length - 1];
        String name = headInfo.substring(0, headInfo.length() - birthday.length()).trim();

        return new Person(name, birthday);
    }

    private static void generateTree(List<String> list, Person person) {
        List<String[]> uncategorized = new ArrayList<>();

        for (String line : list) {
            String[] lineParts = line.split("\\s+-\\s+");

            if (lineParts.length == 1) {
                String[] innerParts = lineParts[0].split("\\s+");
                String birthday = innerParts[innerParts.length - 1];
                String name = lineParts[0].substring(0, lineParts[0].length() - birthday.length()).trim();

                if (!checkRelatives(name, birthday, person))
                    uncategorized.add(new String[]{name, birthday});
            }
            else {
                String parent = lineParts[0];
                String child = lineParts[1];

                if (person.getName().equals(child) || person.getBirthday().equals(child))
                    person.getParents().add(new Person(parent));
                else if (person.getName().equals(parent) || person.getBirthday().equals(parent))
                    person.getChildren().add(new Person(child));
            }
        }

        if (!uncategorized.isEmpty())
            checkUncategorized(person, uncategorized);
    }

    private static boolean checkRelatives(String name, String birthday, Person person) {
        for (Person parent : person.getParents()) {
            if (parent.getName().equals(name)) {
                parent.setBirthday(birthday);
                return true;
            }
            else if (parent.getBirthday().equals(birthday)) {
                parent.setName(name);
                return true;
            }
        }

        for (Person child : person.getChildren()) {
            if (child.getName().equals(name)) {
                child.setBirthday(birthday);
                return true;
            }
            else if (child.getBirthday().equals(birthday)) {
                child.setName(name);
                return true;
            }
        }

        return false;
    }

    private static void checkUncategorized(Person person, List<String[]> list) {
        for (int i = 0; i < list.size(); ++i)
            if (checkRelatives(list.get(i)[0], list.get(i)[1], person)) {
                list.remove(list.get(i));
                i = -1;
            }
    }

    private static void printTree(Person head) {
        System.out.println(head.toString());

        System.out.println("Parents:");
        for (Person parent : head.getParents())
            System.out.println(parent.toString());

        System.out.println("Children:");
        for (Person child : head.getChildren())
            System.out.println(child.toString());
    }

}
