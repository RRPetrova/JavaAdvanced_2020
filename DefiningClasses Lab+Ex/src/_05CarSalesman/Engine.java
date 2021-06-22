package _05CarSalesman;

public class Engine {
    String modelEngine;
    int powerEngine;
    int displacement;
    String efficiency;

    public Engine(String modelEngine, int powerEngine) {
        this.modelEngine = modelEngine;
        this.powerEngine = powerEngine;
        this.displacement = -1;
        this.efficiency = "n/a";
    }

    public Engine(String modelEngine, int powerEngine, int displacement) {
        this(modelEngine, powerEngine);
        this.displacement = displacement;
    }

    public Engine(String modelEngine, int powerEngine, String efficiency) {
        this(modelEngine, powerEngine);
        this.efficiency = efficiency;
    }

    public Engine(String modelEngine, int powerEngine, int displacement, String efficiency) {
        this(modelEngine, powerEngine);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModelEngine() {
        return modelEngine;
    }

    @Override
    public String toString() {

        if (this.displacement == -1) {
            return String.format("%s:%n" +
                    "Power: %d%n" +
                    "Displacement: n/a%n" +
                    "Efficiency: %s%n", this.modelEngine, this.powerEngine, this.efficiency);
        } else {
            return String.format("%s:%n" +
                    "Power: %d%n" +
                    "Displacement: %d%n" +
                    "Efficiency: %s%n", this.modelEngine, this.powerEngine, this.displacement, this.efficiency);
        }
    }
}

