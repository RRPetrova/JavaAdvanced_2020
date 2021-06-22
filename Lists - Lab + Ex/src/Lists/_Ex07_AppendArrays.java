package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Ex07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrays = scanner.nextLine().split("\\|");

        List<String> result = new ArrayList<>();
        for (int i = arrays.length-1; i >= 0; i--) {
            String[] values = arrays[i].split("\\s+");
            for (int j = 0; j < values.length; j++) {
                if (!values[j].equals("")) {
                    result.add(values[j]);
                }
            }
        }

        System.out.println(result.toString().replace("[", "")
        .replace("]", "").replace(",", ""));

    }
}
