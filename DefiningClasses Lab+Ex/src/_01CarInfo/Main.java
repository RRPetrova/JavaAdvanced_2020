package _01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            String model = info[1];
            int hp = Integer.parseInt(info[2]);

            Car car = new Car(name, model, hp);

            System.out.println(car);
        }
    }
}
