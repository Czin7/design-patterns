package flyhweight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarProducer {
    private FlyweightCarFactory flyweightCarFactory;

    public CarProducer(FlyweightCarFactory flyweightCarFactory) {
        this.flyweightCarFactory = flyweightCarFactory;
    }

    public List<Car> produce(String model, int amount){
        return IntStream
                .range(0, amount)
                .mapToObj(counter -> flyweightCarFactory.getCar(model))
                .collect(Collectors.toList());
    }
}
