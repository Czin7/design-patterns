package abstractfactory.model;

public class SuperCar extends Car {
    private boolean doubleTurboCharger;

    @Override
    public void drive() {
        System.out.println("BMW DRIVE");
    }
}
