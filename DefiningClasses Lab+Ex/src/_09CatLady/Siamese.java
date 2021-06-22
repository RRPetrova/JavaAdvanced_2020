package _09CatLady;

public class Siamese extends Cat {
    public Siamese(String name, double thing) {
        super(name, thing);
    }

    @Override
    public String toString() {
        return String.format("Siamese " + super.toString());
    }
}
