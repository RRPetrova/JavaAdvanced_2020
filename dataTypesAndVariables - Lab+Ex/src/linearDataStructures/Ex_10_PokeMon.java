package linearDataStructures;

import java.util.Scanner;

public class Ex_10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int powerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionY = Integer.parseInt(scanner.nextLine());

        int pokeCount = 0;
        int currPowerN = powerN;
        double originalPowerN = powerN * 1.0;

        while (currPowerN >= distanceM) {
            pokeCount++;
            currPowerN -= distanceM;
            if (originalPowerN * 0.5 == currPowerN) {
                if (exhaustionY != 0) {
                    currPowerN /= exhaustionY;
                }
            }
        }
        System.out.println(currPowerN);
        System.out.println(pokeCount);

    }
}
