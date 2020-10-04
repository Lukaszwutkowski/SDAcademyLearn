package classesAndInterfaces.car;

public class Car {

    public static void main(String[] args) {
        Car car = new Car("Audi", "sport");
        Car car1 = new Car("Audi", "luxury");
        Car car2 = new Car("Audi", "economy");

        System.out.println("First car: " + car + " Second car:" + car1 + " Third car: " + car2);

    }

    private String model;
    private String type;
    private Engine engine;

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
        engine = new Car.Engine();
        engine.setEngineType(type);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    public class Engine {

        private String engineType;

        public void setEngineType(String carType) {
            switch (carType) {
                case "economy":
                    engineType = "diesel";
                    break;
                case "luxury":
                    engineType = "electric";
                    break;
                default:
                    engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}
