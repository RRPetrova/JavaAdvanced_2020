package _02Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car = null;
            if (tokens.length == 3) {
                car = new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            } else if (tokens.length == 1) {
                try {
                    int hp = Integer.parseInt(tokens[0]);
                    car = new Car(tokens[0], hp);
                } catch (NumberFormatException ex) {
                    car = new Car(tokens[0]);
                }
            }
            cars.add(car);
        }
        for (Car car : cars) {
            System.out.println(car);
        }

    }
}
