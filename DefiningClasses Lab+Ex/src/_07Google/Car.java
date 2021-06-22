package _07Google;

public class Car  {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(model)
                .append(" ")
                .append(speed)
                .append(System.lineSeparator());
        return sb.toString();
    }
}
