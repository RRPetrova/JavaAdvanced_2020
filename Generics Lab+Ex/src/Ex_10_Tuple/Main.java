package Ex_10_Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split("\\s+");
        Tuple tuple = new Tuple<>(input1[0] +" "+ input1[1], input1[2]);
        System.out.println(tuple.print());

        String[] input2 = scanner.nextLine().split("\\s+");
        tuple= new Tuple<>(input2[0], Integer.parseInt(input2[1]));
        System.out.println(tuple.print());

        String[] input3 = scanner.nextLine().split("\\s+");
        tuple= new Tuple<>(Integer.parseInt(input3[0]),
                Double.parseDouble(input3[1]));
        System.out.println(tuple.print());

    }
}
