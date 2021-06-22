package _06PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cmd = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!cmd.equals("Tournament")) {
            String[] tokens = cmd.split("\\s+");
            String trainerName = tokens[0];
            String pokeName = tokens[1];
            String pokeElement = tokens[2];
            int pokeHealth = Integer.parseInt(tokens[3]);

            Trainer trainer = new Trainer(trainerName);
            Pokemon pokemon = new Pokemon(pokeName, pokeElement, pokeHealth);

            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).addPokemon(pokemon);

            cmd = scanner.nextLine();
        }

        cmd = scanner.nextLine();
        while (!cmd.equals("End")) {
            for (Trainer trainer : trainers.values()) {
                if (trainer.hasElement(cmd)) {
                    trainer.setBadges(1);
                } else {
                    trainer.reduceHealth(10);
                }
            }
            cmd = scanner.nextLine();
        }

trainers
        .entrySet()
        .stream()
        .sorted((p1,p2) -> p2.getValue().getNumOfBadges() - p1.getValue().getNumOfBadges())
        .forEach(e->
                System.out.println(e.getValue().toString()));
    }
}
