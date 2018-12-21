package proxy;

import java.util.ArrayList;
import java.util.List;

public class FakeCarRepository implements CarRepository {
    private List<Car> cars = new ArrayList<>();

    @Override
    public Car save(Car car) {
        this.cars.add(car);
        return car;
    }
}
