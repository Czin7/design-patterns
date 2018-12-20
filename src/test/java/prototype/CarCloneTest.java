package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarCloneTest {

    @Test
    public void givenClonableCar_whenClone_thenShouldCloneCar(){
        Car car = new Car("RED");

        Car clonedCar = car.clone(car);

        assertTrue(car != clonedCar);
        assertTrue(car.equals(clonedCar));
    }

}
