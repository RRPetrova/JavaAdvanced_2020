package Ex_04_Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Lake lake = new Lake(numbers);

        StringBuilder sb = new StringBuilder();
        for (Integer integer : lake) {
            sb.append(integer).append(",").append(" ");
        }
        System.out.println(sb.deleteCharAt(sb.length()-2).toString());

    }

}
