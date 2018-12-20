package pool;

import java.util.*;

public class CarPool implements Poolable<Car> {
    private Deque<Car> cars = new ArrayDeque<>();

    public CarPool(Collection cars){
        this.cars.addAll(cars);
    }

    @Override
    public Optional<Car> get() {
        int carsAmount = cars.size();
        if(carsAmount != 0) return Optional.of(cars.getLast());
        return Optional.empty();
    }

    @Override
    public void release(Car car) {
        cars.addFirst(car);
    }

    public int getSize(){
        return cars.size();
    }
}
