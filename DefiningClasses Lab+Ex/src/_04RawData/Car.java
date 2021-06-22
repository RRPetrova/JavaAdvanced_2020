package _04RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tire;

    public Car(String model, Engine engine, Cargo cargo, Tire tire) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tire = tire;
    }
    public int getEnginePower() {
        return this.engine.enginePower;
    }

    public String getCargoType() {
        return this.cargo.cargoType;
    }

    public double getPressure1() {
        return this.tire.tire1Pressure;
    }

    public double getPressure2() {
        return this.tire.tire2Pressure;
    }

    public double getPressure3() {
        return this.tire.tire3Pressure;
    }

    public double getPressure4() {
        return this.tire.tire4Pressure;
    }
    @Override
    public String toString() {
        return this.model;
    }

}
