package _06vehiclecatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> listCars = new ArrayList<>();
        List<Truck> listTrucks = new ArrayList<>();

        int carsHP = 0;
        int trucksH = 0;

        String cmd = scanner.nextLine();
        while (!cmd.equals("End")) {
            String[] tokens = cmd.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int hp = Integer.parseInt(tokens[3]);

            if ("car".equals(type)) {
                Car car = new Car(model, color, hp);
                listCars.add(car);
                carsHP += car.getHorsepower();
            } else {
                Truck truck = new Truck(model, color, hp);
                trucksH += truck.getHorsepower();
                listTrucks.add(truck);
            }
            cmd = scanner.nextLine();
        }
        cmd = scanner.next();
        while (!cmd.equals("Close the Catalogue")) {
            for (Truck listTruck : listTrucks) {
                if (listTruck.getModel().equals(cmd)) {
                    System.out.println(listTruck);
                    break;
                }
            }
            for (Car listCar : listCars) {
                if (listCar.getModel().equals(cmd)) {
                    System.out.println(listCar);
                    break;
                }
            }

            cmd = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", carsHP * 1.0/ listCars.size() );
        System.out.printf("Trucks have average horsepower of: %.2f.%n", trucksH * 1.0/ listTrucks.size() );


    }
}
