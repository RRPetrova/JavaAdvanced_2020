package _06PokemonTrainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trainer {
    private String name;
    private int numOfBadges;
    private Map<String, List<Pokemon>> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.setPokemons();
    }

    private void setPokemons() {
        this.pokemons = new HashMap<>();
        this.pokemons.put("Fire", new ArrayList<>());
        this.pokemons.put("Water", new ArrayList<>());
        this.pokemons.put("Electricity", new ArrayList<>());
    }

    public boolean hasElement(String element) {
        return !this.pokemons.get(element).isEmpty();
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.putIfAbsent(pokemon.getPokeElement(), new ArrayList<>());
        this.pokemons.get(pokemon.getPokeElement()).add(pokemon);

    }

    public void setBadges(int badges) {
        this.numOfBadges += badges;
    }

    public int getNumOfBadges() {
        return numOfBadges;
    }

    public void reduceHealth(int i) {
        for (List<Pokemon> value : pokemons.values()) {
            for (Pokemon pokemon : value) {
                pokemon.damage(i);
            }
        }
this.remove();
    }

    private void remove() {
        for (List<Pokemon> value : pokemons.values()) {
            value.removeIf(p -> p.getHealth() <= 0);
        }
    }

    public int getPokeCount() {
        int size = 0;
        for (List<Pokemon> value : pokemons.values()) {
            size += value.size();
        }
        return size;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.name, this.numOfBadges, this.getPokeCount());
    }


}
