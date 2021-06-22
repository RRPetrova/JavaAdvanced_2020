package linearDataStructures;

import javafx.scene.transform.Scale;

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal res = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());
           res = num.add(res);
        }

        System.out.println(res);

    }
}
