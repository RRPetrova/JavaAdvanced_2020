package linearDataStructures;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex_01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int fourth = Integer.parseInt(scanner.nextLine());

       // BigInteger res =  BigInteger.valueOf(first).add(BigInteger.valueOf(second));
       // BigInteger nextR = res.divide(BigInteger.valueOf(third));
       // BigInteger rr = nextR.multiply(BigInteger.valueOf(fourth));

       // System.out.println(rr);
        System.out.println((first+second) / third * fourth);

    }
}
