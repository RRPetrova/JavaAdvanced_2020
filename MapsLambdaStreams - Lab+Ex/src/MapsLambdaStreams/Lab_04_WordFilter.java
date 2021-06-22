package MapsLambdaStreams;

import java.util.Scanner;

public class Lab_04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split("\\s+");

        for (String s : array) {
            if (s.length() % 2 == 0) {
                System.out.println(s);
            }
        }


    }
}
