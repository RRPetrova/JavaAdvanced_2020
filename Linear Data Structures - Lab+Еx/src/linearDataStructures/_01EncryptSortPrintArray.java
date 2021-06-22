package linearDataStructures;

import java.lang.reflect.Array;
import java.util.*;

public class _01EncryptSortPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] nums = new int[n];
        char[] vowels =  {'a','e','o','u','i','y'};
      //  ArrayList<Character> vowelsList = new ArrayList<>();
     //   Collections.addAll(vowelsList, vowels);

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int sumName = 0;
            for (int j = 0; j < name.length(); j++) {
                if (vowels.toString().contains(String.valueOf(name.charAt(i)))) {
                    sumName += name.charAt(i) ^ name.length();
                } else {
                    sumName += name.charAt(i) / name.length();
                }
            }
            nums[i] = sumName;
        }
        Arrays.sort(nums);

    }
}
