package Ex_02_GenericBoxOfInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            Box<Integer> box = new Box<>(Integer.parseInt(reader.readLine()));
            System.out.println(box.toString());
        }

    }
}
