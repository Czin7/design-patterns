package pool;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarPoolTest {

    @Test
    public void givenCarPool_whenGet_thenShouldGetCar(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        CarPool carPool = new CarPool(cars);

        Optional<Car> carFromPoolWrapper = carPool.get();

        assertTrue(carFromPoolWrapper.isPresent());
    }

    @Test
    public void givenCarFromPool_whenReturn_thenShouldReturnCar(){
        CarPool carPool = new CarPool(Collections.emptyList());

        int sizeBeforeReturn = carPool.getSize();
        Car carToReturn = new Car();
        carPool.release(carToReturn);

        assertTrue(sizeBeforeReturn < carPool.getSize());
    }

}
