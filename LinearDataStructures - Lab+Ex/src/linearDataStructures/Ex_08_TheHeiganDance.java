package linearDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_08_TheHeiganDance {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        double damage = Double.parseDouble(reader.readLine());

        int playerRow = 7;
        int playerCol = 7;
        int playerHealth = 18500;
        double heiganHealth = 3000000;

        String lastSpell = "";
        while (true) {
            if (playerHealth >= 0) {
                heiganHealth -= damage;
            }
            if (lastSpell.equals("Cloud")) {
                playerHealth -= 3500;
            }
            if (heiganHealth <= 0 || playerHealth <= 0) {
                break;
            }
          String[]  input = reader.readLine().split("\\s+");
            int row = Integer.parseInt(input[1]);
            int col = Integer.parseInt(input[2]);

            if (inDamageArea(playerRow, playerCol, row, col)) {
                if (!inDamageArea(playerRow - 1, playerCol, row, col) &&
                        !isWall(playerRow - 1)) {
                    playerRow--;
                    lastSpell = "";
                } else if (!inDamageArea(playerRow, playerCol + 1, row, col) &&
                        !isWall(playerCol + 1)) {
                    playerCol++;
                    lastSpell = "";
                } else if (!inDamageArea(playerRow + 1, playerCol, row, col) &&
                        !isWall(playerRow + 1)) {
                    playerRow++;
                    lastSpell = "";
                } else if (!inDamageArea(playerRow, playerCol - 1, row, col) &&
                        !isWall(playerCol - 1)) {
                    playerCol--;
                    lastSpell = "";
                } else {
                    if (input[0].equals("Cloud")) {
                        playerHealth -= 3500;
                        lastSpell = "Cloud";
                    } else if (input[0].equals("Eruption")) {
                        playerHealth -= 6000;
                        lastSpell = "Eruption";
                    }
                }
            }


        }

        if (lastSpell.equals("Cloud")) {
            lastSpell = "Plague Cloud";
        } else {
            lastSpell = "Eruption";
        }
        String heiganState = heiganHealth <= 0 ? "Heigan: Defeated!" : String.format("Heigan: %.2f", heiganHealth);
        String playerState = playerHealth <= 0 ? String.format("Player: Killed by %s", lastSpell) :
                String.format("Player: %d", playerHealth);

        System.out.println(heiganState);
        System.out.println(playerState);
        System.out.printf("Final position: %d, %d", playerRow, playerCol);
    }

    private static boolean inDamageArea(int playerRow, int playerCol, int row, int col) {
        return ((row - 1 <= playerRow && playerRow <= row + 1) &&
                (col - 1 <= playerCol && playerCol <= col + 1));

    }

    private static boolean isWall(int i) {
        return i < 0 || i >= 15;
    }
}
