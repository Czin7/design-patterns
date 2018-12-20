package abstractfactory;

import abstractfactory.factories.AbstractFactory;
import abstractfactory.factories.BwmCarFactory;
import abstractfactory.factories.MercedesCarFactory;
import abstractfactory.model.AbstractCar;
import abstractfactory.model.LuxuryCar;
import abstractfactory.model.SuperCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {


    @Test
    public void givenAbstractFactory_whenCreateCar_thenShouldCreateSuperCar(){
        AbstractFactory abstractFactory = new BwmCarFactory();

        AbstractCar abstractCar = abstractFactory.createCar();

        assertTrue(abstractCar instanceof SuperCar);
    }

    @Test
    public void givenAbstractFactory_whenCreateCar_thenShouldCreateLuxury(){
        AbstractFactory abstractFactory = new MercedesCarFactory();

        AbstractCar abstractCar = abstractFactory.createCar();

        assertTrue(abstractCar instanceof LuxuryCar);
    }
}
