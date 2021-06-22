package _09CatLady;

public class StreetExtraordinary extends Cat {
    public StreetExtraordinary(String name, double thing) {
        super(name, thing);
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire " + super.toString());
    }
}
