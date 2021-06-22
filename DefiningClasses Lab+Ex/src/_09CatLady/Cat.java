package _09CatLady;

public class Cat {
    private String name;
    private double thing;

    public Cat(String name, double thing) {
        this.name = name;
        this.thing = thing;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", this.name, this.thing);
    }
}
