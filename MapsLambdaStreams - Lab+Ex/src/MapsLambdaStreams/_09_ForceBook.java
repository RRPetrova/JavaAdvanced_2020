package MapsLambdaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class _09_ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        TreeMap<String, List<String>> map = new TreeMap<>();
        List<String> users = new ArrayList<>();

        while (!cmd.equals("Lumpawaroo")) {

            boolean containsUser = false;
            if (cmd.contains(" | ")) {
                String[] tokens = cmd.split(" \\| ");
                String forceSide = tokens[0];
                String forceUser = tokens[1];

                users = map.get(forceSide);

                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry.getValue().contains(forceUser)) {
                        containsUser = true;
                        break;
                    }
                }
                if (!containsUser) {
                    if (!map.containsKey(forceSide)) {
                        users = new ArrayList<>();
                    }
                        users.add(forceUser);
                        map.put(forceSide, users);
                    }

            } else {
                String[] tokens = cmd.split(" -> ");
                String user = tokens[0];
                String side = tokens[1];

                map.entrySet().stream()
                        .forEach(e -> {
                            if (e.getValue().contains(user)) {
                                e.getValue().remove(user);
                            }
                        });

                if (map.containsKey(side) || users == null) {
                    users = map.get(side);

                } else {
                    users = new ArrayList<>();
                }

                    System.out.printf("%s joins the %s side!%n", user, side);
                    users.add(user);
                    map.put(side, users);

            }
            // System.out.println(map);
            cmd = scanner.nextLine();
        }

        // map.entrySet().stream().sorted((f, s) -> {
        //             int res = s.getValue().size() - f.getValue().size();
        //             if (res == 0) {
        //                 res = f.getKey().compareTo(s.getKey());
        //             }
        //             return res;
        //         }

        // ).forEach(x -> {
        //     if (!x.getValue().isEmpty()) {
        //         System.out.printf("Side: %s, Members: %s%n", x.getKey(), x.getValue().size());

        //         Collections.sort(x.getValue());
        //         System.out.print("! ");
        //         System.out.println(String.join("\n! ", x.getValue()));
        //         //  System.out.println(x.getValue().toString().replace(", ", "%n! "));
        //     }
        // });

        map.entrySet().stream()
                .filter(i -> i.getValue().size() > 0).sorted((f, s) ->
                s.getValue().size() - f.getValue().size())
                .forEach(element -> {
                    if (element.getValue().size() != 0) {
                        System.out.printf("Side: %s, Members: %d%n", element.getKey(), element.getValue().size());

                        element.getValue().stream().sorted(Comparator.naturalOrder())
                                .forEach(el -> System.out.printf("! %s%n", el));


                    }
                });


    }
}
