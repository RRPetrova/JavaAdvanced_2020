package linearDataStructures;

import java.util.*;

public class _01_EncryptSortPrintArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String vowels = "aeiouAEIOU";
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < name.length(); j++) {
                if (vowels.contains(name.charAt(j) + "")) {
                    sum += name.charAt(j) * name.length();
                } else {
                    sum += name.charAt(j) / name.length();
                }
            }
            results[i] = sum;
        }
        Arrays.sort(results);
        for (int result : results) {
            System.out.println(result);
        }


    }
}
