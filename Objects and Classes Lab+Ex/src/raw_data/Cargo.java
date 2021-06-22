package raw_data;

public class Cargo {
    int cargoWeight;
    String cargoType;

    public Cargo(int cargoWeight, String cargoType) {
        this.cargoType = cargoType;
        this.cargoWeight = cargoWeight;
    }

    public String getCargoType() {
        return cargoType;
    }
}
