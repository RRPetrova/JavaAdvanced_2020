package linearDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

public class _02_PoundsToDollars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double pounds = Double.parseDouble(br.readLine());
        System.out.printf("%.3f", pounds * 1.31);
    }
}
