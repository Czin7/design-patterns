package flyhweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightCarFactory {
    private Map<String, Car> cars = new HashMap<>();

    public Car getCar(String carModel){
        return cars.computeIfAbsent(carModel, key -> {
            return new Car(carModel);
        });
    }
}
