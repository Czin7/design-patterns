package flyweight;

import flyhweight.Car;
import flyhweight.CarProducer;
import flyhweight.FlyweightCarFactory;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarProducerTest {

    @Test
    public void givenCarProducer_whenProduce_thenShouldReturnCarsWithSameReference(){
        final int amoutOfCarsToProduce = 10;
        FlyweightCarFactory flyweightCarFactory = new FlyweightCarFactory();
        CarProducer carProducer = new CarProducer(flyweightCarFactory);

        List<Car> cars = carProducer.produce( "MUSTANG", amoutOfCarsToProduce);

        assertTrue(!cars.isEmpty());
        assertTrue(cars.size() == amoutOfCarsToProduce);

        boolean referenceEquality = IntStream.range(0, amoutOfCarsToProduce - 1)
                .mapToObj(count -> cars.get(count) == cars.get(count + 1))
                .allMatch(value -> value == Boolean.TRUE);
        assertTrue(referenceEquality);
    }


}
