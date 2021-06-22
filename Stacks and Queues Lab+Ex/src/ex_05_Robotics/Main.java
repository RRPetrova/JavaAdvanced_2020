package ex_05_Robotics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputRobots = reader.readLine().split(";");
        int[] time = Arrays.stream(reader.readLine().split(":"))
                .mapToInt(Integer::parseInt).toArray();
        long startTimeSecs = time[0] * 3600 + time[1] * 60 + time[2];

        ArrayDeque<String> queueProducts = new ArrayDeque<>();
        LinkedHashMap<String, Integer> robotsMap = new LinkedHashMap<>();

        String product = reader.readLine();
        while (!product.equals("End")) {
            queueProducts.add(product);
            product = reader.readLine();
        }

        int[] workingTime = new int[inputRobots.length];

        for (int i = 0; i < inputRobots.length; i++) {
            String[] infoRobot = inputRobots[i].split("-");
            String nameRobot = infoRobot[0];
            int processingTime = Integer.parseInt(infoRobot[1]);
            robotsMap.put(nameRobot, processingTime);
        }
        while (queueProducts.size() > 0) {
            String currProd = queueProducts.poll();
            boolean isAssigned = false;
            startTimeSecs++;
            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] > 0) {
                    workingTime[i]--;
                }
            }
            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] == 0) {
                    int count = 0;
                    for (Map.Entry<String, Integer> entry : robotsMap.entrySet()) {
                        if (count == i) {
                            workingTime[i] = entry.getValue();
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n",
                                    entry.getKey(), currProd, startTimeSecs / 3600 % 24,
                                    startTimeSecs % 3600 / 60, startTimeSecs % 60);
                            isAssigned = true;
                            break;
                        }
                        count++;
                    }
                    break;
                }
            }
            if (!isAssigned) {
                queueProducts.offer(currProd);
            }
        }


    }
}
