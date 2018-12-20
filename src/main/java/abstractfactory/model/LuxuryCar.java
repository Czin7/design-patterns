package abstractfactory.model;

public class LuxuryCar extends Car {
    private boolean massageChairActivated;

    @Override
    public void drive() {
        System.out.println("Luxury car drive.");
    }
}
