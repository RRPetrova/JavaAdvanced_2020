import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Ex_10PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");
        String cmd = reader.readLine();

        List<String> names = new ArrayList<>();

        Collections.addAll(names, input);

        while (!cmd.equals("Party!")) {
            String[] tokens = cmd.split("\\s+");
            Predicate<String> startsCondition = str -> str.startsWith(tokens[2]);
            Predicate<String> endsCondition = str -> str.endsWith(tokens[2]);
            Predicate<String> lengthCondition = str -> str.length() == Integer.parseInt(tokens[2]);

            if (tokens[0].equals("Double")) {
                List<String> addedGuests = new ArrayList<>();
                if (tokens[1].equals("StartsWith")) {
                    for (String name : names) {
                        if (startsCondition.test(name)) {
                            addedGuests.add(name);
                        }
                        addedGuests.add(name);
                    }
                    names = addedGuests;
                } else if (tokens[1].equals("EndsWith")) {
                    for (String name : names) {
                        if (endsCondition.test(name)) {
                            addedGuests.add(name);
                        }
                        addedGuests.add(name);
                    }
                    names = addedGuests;
                } else if (tokens[1].equals("Length")) {
                    for (String name : names) {
                        if (lengthCondition.test(name)) {
                            addedGuests.add(name);
                        }
                        addedGuests.add(name);
                    }
                    names = addedGuests;
                }
            } else if (tokens[0].equals("Remove")) {
                if (tokens[1].equals("StartsWith")) {
                    names.removeIf(goingGuest -> startsCondition.test(goingGuest));
                } else if (tokens[1].equals("EndsWith")) {
                    names.removeIf(goingGuest -> endsCondition.test(goingGuest));
                } else if (tokens[1].equals("Length")) {
                    names.removeIf(goingGuest -> lengthCondition.test(goingGuest));
                }
            }

            cmd = reader.readLine();
        }
        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(names);
            System.out.printf("%s are going to the party!", String.join(", ", names));

        }
    }

}
