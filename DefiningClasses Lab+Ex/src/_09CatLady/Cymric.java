package _09CatLady;

public class Cymric extends Cat {
    public Cymric(String name, double thing) {
        super(name, thing);
    }

    @Override
    public String toString() {
        return String.format("Cymric " + super.toString());
    }
}
