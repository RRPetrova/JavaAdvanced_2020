package ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class _01_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella",
                "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int n = Integer.parseInt(scanner.nextLine());
        Random rdm = new Random();

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s - %s%n", phrases[rdm.nextInt(phrases.length)],
                    events[rdm.nextInt(events.length)], authors[rdm.nextInt(authors.length)],
                    cities[rdm.nextInt(cities.length)]);
        }


    }
}