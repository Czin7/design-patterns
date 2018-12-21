package bridge;

public class CarCustomizer {
    private Car car;

    public CarCustomizer(Car car) {
        this.car = car;
    }

    public boolean driveWithLaunchControl(){
        car.enableLaunchControl();
        car.drive();
        return true;
    }
}
