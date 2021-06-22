package Ex_11_Threeuple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in));

        String[] input1 = bufferedReader.readLine().split("\\s+");
        Threeuple threeuple = new Threeuple(input1[0] + " " + input1[1],
                input1[2], input1[3]);
        System.out.println(threeuple);

        input1 = bufferedReader.readLine().split("\\s+");
        boolean isDrunk = false;
        if (input1[2].equals("drunk")) {
            isDrunk = true;
        }
        threeuple = new Threeuple(input1[0], Integer.parseInt(input1[1]),
                isDrunk);
        System.out.println(threeuple);

        input1 = bufferedReader.readLine().split("\\s+");
        threeuple = new Threeuple(input1[0], Double.parseDouble(input1[1]),
                input1[2]);
        System.out.println(threeuple);

    }
}
