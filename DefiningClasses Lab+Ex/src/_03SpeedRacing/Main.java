package _03SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Car car = null;
        List<Car> listCars = new ArrayList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (!isaBoolean(listCars, tokens[0])) {
                car = new Car(tokens[0], Double.parseDouble(tokens[1]),
                        Double.parseDouble(tokens[2]));
                listCars.add(car);
            }
        }

        String cmd = scanner.nextLine();
        while (!cmd.equals("End")) {
            String[] tokens = cmd.split("\\s+");
            for (Car listCar : listCars) {
                if (listCar.getModel().equals(tokens[1])) {
                    if (!listCar.isFuelEnough(Integer.parseInt(tokens[2]))) {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }
            cmd = scanner.nextLine();
        }

        for (Car listCar : listCars) {
            System.out.println(listCar.toString());
        }


    }

    private static boolean isaBoolean(List<Car> listCars, String token) {
        return listCars.stream().anyMatch(e -> e.getModel().equals(token));
    }
}
