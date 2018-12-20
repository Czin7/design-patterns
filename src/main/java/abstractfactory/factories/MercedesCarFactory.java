package abstractfactory.factories;

import abstractfactory.model.AbstractCar;
import abstractfactory.model.LuxuryCar;

public class MercedesCarFactory implements AbstractFactory {

    @Override
    public AbstractCar createCar() {
        return new LuxuryCar();
    }
}
