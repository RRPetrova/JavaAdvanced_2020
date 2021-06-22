package linearDataStructures;

import java.util.Scanner;

public class Ex_08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double volume = Double.MIN_VALUE;
        String biggest = "";
        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());

            double currVolume = Math.PI * radius * radius * height;
            if (currVolume > volume) {
                volume = currVolume;
                biggest = model;
            }
        }
        System.out.printf("%s", biggest);


    }
}
