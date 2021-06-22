package _06PokemonTrainer;

public class Pokemon {
    String name;
    String element;
    int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getPokeElement() {
        return this.element;
    }

    public int getHealth() {
        return health;
    }

    public void damage(int damage){
         this.health-=damage;
    }
    @Override
    public String toString(){
        return String.format("%s, %s, %d", this.name, this.element, this.health);
    }
}
