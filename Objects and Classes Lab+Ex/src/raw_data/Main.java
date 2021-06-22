package raw_data;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Car> listOfCars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tire1Pressure = Double.parseDouble(input[5]);
            int tire1Age = Integer.parseInt(input[6]);
            double tire2Pressure = Double.parseDouble(input[7]);
            int tire2Age = Integer.parseInt(input[8]);
            double tire3Pressure = Double.parseDouble(input[9]);
            int tire3Age = Integer.parseInt(input[10]);
            double tire4Pressure = Double.parseDouble(input[11]);
            int tire4Age = Integer.parseInt(input[12]);

          Car car = new Car(model, engineSpeed, enginePower, cargoWeight,
                  cargoType, tire1Pressure, tire1Age, tire2Pressure,
                  tire2Age, tire3Pressure, tire3Age,
                  tire4Pressure, tire4Age);

          listOfCars.add(car);

        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
          listOfCars.stream().filter(ct -> ct.getCargo().getCargoType().equals("fragile")
          && Arrays.stream(ct.getTires()).anyMatch(p -> p.getPressure() < 1))
          .forEach(System.out::println);


        } else if (command.equals("flamable")) {
            listOfCars.stream()
                    .filter(ct -> ct.getCargo().getCargoType().equals("flamable")
                    && ct.getEngine().getEnginePower() > 250)
                    .forEach(System.out::println);
        }
    }
}
