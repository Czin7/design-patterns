package factory;

import factory.model.Car;
import factory.model.CarType;
import factory.model.DiselCar;
import factory.model.PetrolCar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarFactoryTest {

    @Test
    public void givenCarFactory_whenCreate_thenShouldCreatePetrolCar(){
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.create(CarType.PETROL);

        assertTrue(car instanceof PetrolCar);
    }

    @Test
    public void givenCarFactory_whenCreate_thenShouldCreateDiselCar(){
        CarFactory carFactory = new CarFactory();

        Car car = carFactory.create(CarType.DISEL);

        assertTrue(car instanceof DiselCar);
    }
}
