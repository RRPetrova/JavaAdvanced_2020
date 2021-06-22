package _04RawData;

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
            String[] info = scanner.nextLine().split("\\s+");
            Engine engine = new Engine(Integer.parseInt(info[1]), Integer.parseInt(info[2]));
            Cargo cargo = new Cargo(Integer.parseInt(info[3]), info[4]);
            Tire tire = new Tire(Double.parseDouble(info[5]), Integer.parseInt(info[6]),
                    Double.parseDouble(info[7]), Integer.parseInt(info[8]),
                    Double.parseDouble(info[9]), Integer.parseInt(info[10]),
                    Double.parseDouble(info[11]), Integer.parseInt(info[12]));

            car = new Car(info[0], engine, cargo, tire);

            listCars.add(car);
        }

        String cmd = scanner.nextLine();

        listCars.stream().filter(e->e.getCargoType().equals(cmd));



        for (Car listCar : listCars) {
            if (cmd.equals("fragile")) {
                double p1 = listCar.getPressure1();
                double p3 = listCar.getPressure2();
                int p4 = listCar.getEnginePower();
               String pdasd = listCar.getCargoType();

                if (listCar.getPressure1() < 1 || listCar.getPressure2() < 1 ||
                listCar.getPressure3() < 1 || listCar.getPressure4() < 1) {
                    System.out.println(listCar.toString());
                }

            } else if (cmd.equals("flamable")) {
                if (listCar.getEnginePower() > 250) {
                    System.out.println(listCar.toString());
                }

            }
        }


    }
}
