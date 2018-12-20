package builder;

public class Car {
    private EngineType engineType;
    private String color;
    private String additionalParameter1;
    private String additionalParameter2;

    private Car(EngineType engineType, String color){
        this.engineType = engineType;
        this.color = color;
    }

    public static class CarBuilder{
        private Car car;

        public CarBuilder(EngineType engineType, String color){
            this.car = new Car(engineType, color);
        }

        public CarBuilder setAdditionalParameter1(String value){
            this.car.additionalParameter1 = value;
            return this;
        }

        public CarBuilder setAdditionalParameter2(String value){
            this.car.additionalParameter2 = value;
            return this;
        }

        public Car build(){
            return this.car;
        }
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAdditionalParameter1() {
        return additionalParameter1;
    }

    public void setAdditionalParameter1(String additionalParameter1) {
        this.additionalParameter1 = additionalParameter1;
    }

    public String getAdditionalParameter2() {
        return additionalParameter2;
    }

    public void setAdditionalParameter2(String additionalParameter2) {
        this.additionalParameter2 = additionalParameter2;
    }
}
