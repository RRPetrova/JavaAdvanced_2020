package MapsLambdaStreams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        LinkedHashMap<String, Double> prodPrice  = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> prodQty  = new LinkedHashMap<>();
        while (!cmd.equals("buy")) {
            String[] tokens = cmd.split("\\s+");
            String prod = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int qty = Integer.parseInt(tokens[2]);

            if (!prodPrice.containsKey(prod) && !prodQty.containsKey(prod)) {
                prodPrice.put(prod, price);
                prodQty.put(prod, qty);
            } else {
                prodQty.put(prod, prodQty.get(prod) + qty);
                    prodPrice.put(prod, price);
            }
            cmd = scanner.nextLine();
        }

        for (Map.Entry<String, Double> priceEntry : prodPrice.entrySet()) {
            for (Map.Entry<String, Integer> entryQty : prodQty.entrySet()) {
            if (priceEntry.getKey().equals(entryQty.getKey())) {
                System.out.printf("%s -> %.2f%n", entryQty.getKey(),
                        priceEntry.getValue() * entryQty.getValue());
            }
            }


        }


    }
}
