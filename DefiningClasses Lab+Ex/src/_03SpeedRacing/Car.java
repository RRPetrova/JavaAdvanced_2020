package _03SpeedRacing;

public class Car {
    private static int traveled = 0;
    String model;
    double fuelAmount;
    double fuelCostPerKm;
    int distTraveled;

    Car() {
        this.distTraveled += traveled;
    }

    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
    }

    public String getModel() {
        return this.model;
    }

    public boolean isFuelEnough(int kmTraveled) {

        if (fuelAmount >= fuelCostPerKm * kmTraveled) {
            fuelAmount -= kmTraveled * fuelCostPerKm;
            distTraveled += kmTraveled;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distTraveled);
    }
}
