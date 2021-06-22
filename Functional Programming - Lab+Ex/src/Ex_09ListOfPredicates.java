import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BiPredicate;

public class Ex_09ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] array = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();


        BiPredicate<Integer, int[]> divis = (a, b) -> {
            boolean res = false;
            for (int i : b) {
                if (a % i == 0) {
                    res = true;
                } else {
                    res = false;
                    break;
                }
            }
            return res;
        };
        for (int i = 1; i <= n; i++) {
            if (divis.test(i, array)) {
                System.out.print(i + " ");
            }
        }
    }
}
