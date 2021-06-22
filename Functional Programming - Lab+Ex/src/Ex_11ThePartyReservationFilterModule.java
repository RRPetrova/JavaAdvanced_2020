import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Ex_11ThePartyReservationFilterModule {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split("\\s+");

        LinkedList<String> guests = new LinkedList<>();
        Collections.addAll(guests, input);
        LinkedList<String> filteredNames = new LinkedList<>();

        String cmd = reader.readLine();
        while (!cmd.equals("Print")) {
            String[] tokens = cmd.split(";");
            if (tokens.length == 3) {
                Predicate<String> conditionStarts = str -> str.startsWith(tokens[2]);
                Predicate<String> conditionEnds = str -> str.endsWith(tokens[2]);
                Predicate<String> conditionLength = str -> str.length() == Integer.parseInt(tokens[2]);
                Predicate<String> conditionContains = str -> str.contains(tokens[2]);

                if (tokens[0].equals("Add filter")) {
                    if (tokens[1].equals("Starts with")) {
                        for (String guest : guests) {
                            if (conditionStarts.test(guest)) {
                                filteredNames.add(guest);
                            }
                        }

                    } else if (tokens[1].equals("Ends with")) {
                        for (String guest : guests) {
                            if (conditionEnds.test(guest)) {
                                filteredNames.add(guest);
                            }
                        }
                    } else if (tokens[1].equals("Length")) {
                        for (String guest : guests) {
                            if (conditionLength.test(guest)) {
                                filteredNames.add(guest);
                            }
                        }
                    } else if (tokens[1].equals("Contains")) {
                        for (String guest : guests) {
                            if (conditionContains.test(guest)) {
                                filteredNames.add(guest);
                            }
                        }
                    }


                } else if (tokens[0].equals("Remove filter")) {
                    if (tokens[1].equals("Starts with")) {
                        for (int i = 0; i < filteredNames.size(); i++) {
                            if (conditionStarts.test(filteredNames.get(i))) {
                                filteredNames.remove(filteredNames.get(i));
                                if (filteredNames.size() > 0) {
                                    i--;
                                }
                            }
                        }
                    } else if (tokens[1].equals("Ends with")) {
                        for (int i = 0; i < filteredNames.size(); i++) {
                            if (conditionEnds.test(filteredNames.get(i))) {
                                filteredNames.remove(filteredNames.get(i));
                                if (filteredNames.size() > 0) {
                                    i--;
                                }
                            }
                        }
                    } else if (tokens[1].equals("Length")) {
                        for (int i = 0; i < filteredNames.size(); i++) {
                            if (conditionLength.test(filteredNames.get(i))) {
                                filteredNames.remove(filteredNames.get(i));
                                if (filteredNames.size() > 0) {
                                    i--;
                                }
                            }
                        }
                    } else if (tokens[1].equals("Contains")) {
                        for (int i = 0; i < filteredNames.size(); i++) {
                            if (conditionContains.test(filteredNames.get(i))) {
                                filteredNames.remove(filteredNames.get(i));
                                if (filteredNames.size() > 0) {
                                    i--;
                                }
                            }
                        }
                    }
                }
            }

            cmd = reader.readLine();
        }
        if (!filteredNames.isEmpty()) {
            for (String filtered : filteredNames) {
                for (int i = 0; i < guests.size(); i++) {
                    if (guests.get(i).equals(filtered)) {
                        guests.remove(i);
                        if (guests.size() > 0) {
                            i--;
                        }
                    }
                }
            }
        }

        System.out.println(String.join(" ", guests));

    }
}
