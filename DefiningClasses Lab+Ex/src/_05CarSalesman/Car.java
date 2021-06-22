package _05CarSalesman;

public class Car {
    String model;
    Engine engine;
    int weight;
    String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = -1;
        this.color = "n/a";
    }
    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }
    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }
    public Car(String model, Engine engine,  int weight, String color) {
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }


    @Override
    public  String toString(){

        if (this.weight == -1) {
            return String.format("%s:%n" +
                    "%s" +
                    "Weight: n/a%n" +
                    "Color: %s", this.model, this.engine, this.color);
        } else {
            return String.format("%s:%n" +
                    "%s" +
                    "Weight: %d%n" +
                    "Color: %s", this.model, this.engine, this.weight, this.color);
        }
    }
}
