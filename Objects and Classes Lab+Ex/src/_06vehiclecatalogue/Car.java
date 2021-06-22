package _06vehiclecatalogue;

public class Car {
    private String type;
    private String model;
    private String color;
    private int horsepower;


    public Car(String model, String color, int horsepower) {

        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
        this.type = "Car";
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%n" +
                        "Model: %s%n" +
                        "Color: %s%n" +
                        "Horsepower: %d",
                this.type, this.model, this.color, this.horsepower);
    }
}
