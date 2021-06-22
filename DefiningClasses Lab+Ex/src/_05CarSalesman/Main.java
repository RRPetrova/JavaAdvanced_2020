package _05CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> listEngine = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        Engine engine = null;
        while (n-- > 0) {
            String[] infoEngine = scanner.nextLine().split("\\s+");
            String modelEngine = infoEngine[0];
            int powerEngine = Integer.parseInt(infoEngine[1]);

            if (infoEngine.length == 4) {
                engine = new Engine(modelEngine, powerEngine, Integer.parseInt(infoEngine[2]), infoEngine[3]);
            } else if (infoEngine.length == 2) {
                engine = new Engine(modelEngine, powerEngine);
            } else if (infoEngine.length == 3) {
                try {
                    int displacement = Integer.parseInt(infoEngine[2]);
                    engine = new Engine(modelEngine, powerEngine, displacement);
                } catch (NumberFormatException ex) {
                    engine = new Engine(modelEngine, powerEngine, infoEngine[2]);
                }
            }
            listEngine.add(engine);

        }
        List<Car> carList = new ArrayList<>();
        int m = Integer.parseInt(scanner.nextLine());
        while (m-- > 0) {
            String[] infoCar = scanner.nextLine().split("\\s+");
            String model = infoCar[0];
            String modelEngine = infoCar[1];
            Car car = null;
            for (Engine currEngine : listEngine) {
                if (currEngine.getModelEngine().equals(modelEngine)) {
                    if (infoCar.length == 4) {
                        car = new Car(model, currEngine, Integer.parseInt(infoCar[2]), infoCar[3]);
                    } else if (infoCar.length == 3) {
                        try {
                            int weight = Integer.parseInt(infoCar[2]);
                            car = new Car(model, currEngine, weight);
                        } catch (NumberFormatException ex) {
                            car = new Car(model, currEngine, infoCar[2]);
                        }
                    } else {
                        car = new Car(model, currEngine);
                    }
                    carList.add(car);
                }

            }
        }

        for (Car car : carList) {
            System.out.println(car);
        }


    }
}
