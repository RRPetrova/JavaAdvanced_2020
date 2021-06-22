package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _Ex08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine()
                .split("\\s+")).collect(Collectors.toList());

        // List<String> res = new ArrayList<>();
        String cmd = scanner.nextLine();
        while (!cmd.equals("3:1")) {
            String[] tokens = cmd.split("\\s+");
            if (tokens[0].equals("merge")) {
                int start = Integer.parseInt(tokens[1]);
                int end = Integer.parseInt(tokens[2]);
                StringBuilder conc = new StringBuilder();
                if (start < 0 || start >= list.size()) {
                    start = 0;
                }
                if (end > list.size() - 1) {
                    end = list.size() - 1;
                }
                for (int i = start; i <= end; i++) {
                    conc.append(list.get(i));
                }

                for (int i = end; i >= start; i--) {
                    list.remove(i);
                }
                list.add(start, conc.toString());
            } else if (tokens[0].equals("divide")) {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);
                if (index >= 0 && index < list.size() && partitions >= 0 && partitions <= 100) {

                    String toBeDivided = list.get(index);
                    list.remove(index);
                    if (toBeDivided.length() % partitions != 0) {
                        int lengthDivided = toBeDivided.length() / partitions;

                        int rest = toBeDivided.length() - lengthDivided * partitions;
                        int indCurr = index;
                        for (int i = 0; i < lengthDivided * partitions - 1; i += rest) {
                            String divided = toBeDivided.substring(i, i + lengthDivided);
                            list.add(indCurr, divided);
                            indCurr++;
                        }
                        String sub = toBeDivided.substring((partitions - 1) * lengthDivided);
                        list.add(indCurr, sub);

                    } else {
                        int lengthDivided = toBeDivided.length() / partitions;
                        int indCurr = index;
                        for (int i = 0; i < toBeDivided.length(); i += lengthDivided) {
                            String divided = toBeDivided.substring(i, i + lengthDivided);
                            list.add(indCurr, divided);
                            indCurr++;
                        }
                    }
                }
            }

            cmd = scanner.nextLine();
        }
        for (String s : list) {
            System.out.print(s + " ");
        }


    }
}
