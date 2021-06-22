package linearDataStructures;

import java.util.Scanner;

public class Ex_11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int snowMax = 0;
        int timeMax = 0;
        int qualityMax = 0;

        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
             int quality = Integer.parseInt(scanner.nextLine());

           double currValue = Math.pow(snow / time, quality);

            if (currValue > maxValue) {
                maxValue = currValue;
                snowMax = snow;
                 timeMax = time;
                 qualityMax = quality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)", snowMax, timeMax, maxValue, qualityMax);

    }
}
