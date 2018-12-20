package abstractfactory.factories;

import abstractfactory.model.AbstractCar;
import abstractfactory.model.SuperCar;

public class BwmCarFactory implements AbstractFactory {

    @Override
    public AbstractCar createCar() {
        return new SuperCar();
    }
}
